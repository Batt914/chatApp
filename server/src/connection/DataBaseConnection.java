
package connection;
import java.sql.SQLException;
import java.sql.Connection;


public class DataBaseConnection {

    /**
     * @return the connection
     */
   
    private static DataBaseConnection instance;
    private Connection connection;
    public static DataBaseConnection getInstance(){
        if(instance == null){
            instance = new DataBaseConnection();
        }
        return instance;
    }
    private DataBaseConnection(){
    
        
    }
    public void connectToDatabase() throws SQLException{
        String server = "localhost";
        String port = "3306";
        String database = "chatApplication";
        String userName = "root";
        String password = "9121";
        connection=java.sql.DriverManager.getConnection("jdbc:mysql://"+server+":"+port+"/"+database,userName,password);
    
        
    }
     public Connection getConnection() {
        return connection;
    }

    /**
     * @param connection the connection to set
     */
    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    
}

