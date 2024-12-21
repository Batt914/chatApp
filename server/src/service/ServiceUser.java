
package service;
import java.sql.PreparedStatement;
import connection.DataBaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ModelRegister;
import model.Model_Message;
import model.Mua;

public class ServiceUser {

    public ServiceUser() {
//        this.INSERT_USER_ACCOUNT = "insert into user_account(userID,userName) values (?,?)";
        this.con = DataBaseConnection.getInstance().getConnection();
    }
    public Model_Message register(ModelRegister data)  {
        Model_Message message = new Model_Message();
        try{
        PreparedStatement p= con.prepareStatement(CHECK_USER);
        p.setString(1,data.getUserName());
        ResultSet r= p.executeQuery();
        if(r.next()){
            message.setAction(false);
            message.setMessage("User alredy Exit");
        }
        else{
            message.setAction(true);
        }
        r.close();
        p.close();
        // new user
        if(message.isAction()){
            //insert user reg
            con.setAutoCommit(false);
            p=con.prepareStatement(INSERT_USER,PreparedStatement.RETURN_GENERATED_KEYS);
            p.setString(1, data.getUserName());
            p.setString(2, data.getPassword());
            System.out.println(p);
            p.execute();
            r=p.getGeneratedKeys();
            r.next();
            int userID=r.getInt(1);
            r.close();
            p.close();
            
            // create user acc
            p=con.prepareStatement(INSERT_USER_ACCOUNT);
            p.setInt(1, userID);
            p.setString(2, data.getUserName());
            p.execute();
            p.close();
            con.commit();
            con.setAutoCommit(true);
            message.setAction(true);
            message.setMessage("ok");
            message.setData(new Mua(userID, data.getUserName(),"", "", "",true));
            
            
        }
        }
        catch(SQLException e){
            e.printStackTrace();
            message.setAction(false);
            message.setMessage("Server error :" );
            try {
                if(con.getAutoCommit()){
                    con.rollback();
                    con.setAutoCommit(true);
                }
            } catch (SQLException e1) {
            }
          

        }
        return message;
        
        
    }
    public List<Mua> getUset(int exitUser) throws SQLException{
        List<Mua> list=new ArrayList<>();
        PreparedStatement p = con.prepareStatement(SELECT_USER_ACCOUNT);
        p.setInt(1, exitUser);
        ResultSet r= p.executeQuery();
        while(r.next()){
            int userID = r.getInt(1);
            String userName = r.getString(2);
            String gender = r.getString(3);
            String image = r.getString(4);
            list.add(new Mua(userID, userName, gender, image, true));
        }
        r.close();
        p.close();
        return list;
    }

    
    
    private final String SELECT_USER_ACCOUNT = "SELECT userID, userName, Gender, imageString FROM user_account WHERE Status = '1' AND userID <> ?";
    private final String INSERT_USER ="insert into user(userName,password) values(?,?)";
    private final String INSERT_USER_ACCOUNT = "insert into user_account (userID,userName) values(?,?)";
    private final String CHECK_USER = "select userID from user where userName =? limit 1";
    private final Connection con;
    
}


