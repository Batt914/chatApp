

package model;

import org.json.JSONException;
import org.json.JSONObject;
import java.lang.Integer;

public class Mua {

    /**
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param states the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    public Mua(int userID, String userName, String password, String gender, String image, boolean status) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.gender = gender;
        this.image = image;
        this.status = status;
    }
    

    public Mua(Object json) {
        JSONObject obj = (JSONObject) json;
        try {
            userID = obj.getInt("userID");
            userName= obj.getString("userName");
            gender= obj.getString("gender");
            image=obj.getString("image");
            status= obj.getBoolean("status");
            
            
        } catch (JSONException e) {
            System.err.println(e);
        }
    }
    
    private int userID;
    private String userName;
      private String password;
       private String gender;
        private String image;
        private boolean status;
    
    
}
