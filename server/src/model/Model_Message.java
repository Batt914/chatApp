
package model;

public class Model_Message {

    /**
     * @return the action
     */
    public boolean isAction() {
        return action;
    }

    /**
     * @param action the action to set
     */
    public void setAction(boolean action) {
        this.action = action;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Object data) {
        this.data = data;
    }

    public Model_Message(boolean action, String message, Object data) {
        this.action = action;
        this.message = message;
        this.data = data;
    }
    

    public Model_Message() {
    }
    

    private boolean action;
    private String message;
    private Object data;
    
}
