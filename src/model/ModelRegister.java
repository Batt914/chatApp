
package model;
import org.json.JSONException;
import org.json.JSONObject;

public class ModelRegister {

    /**
     * @return the UserName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the UserName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the Password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public ModelRegister(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    

    public ModelRegister() {
    }
    
    private String userName;
    private String password;
    public JSONObject toJSONObject(){
        try {
            JSONObject json= new JSONObject();
            json.put("userName", userName);
            json.put("password", password);
            return json;
        } catch (JSONException e) {
            return null;
        }
    }
    
}
