
package model;

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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the Password to set
     */
    public void setPassword(String Password) {
        this.password = Password;
    }

    public ModelRegister(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    

    public ModelRegister() {
    }
    
    private String userName;
    private String password;
    
}

