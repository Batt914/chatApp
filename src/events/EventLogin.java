
package events;

import model.ModelRegister;
import model.Model_Message;


public interface EventLogin {
    
    public void login();
    
    public void register(ModelRegister data , EventMessage message);
    
    public void goRegister();
    
    public void goLogin();
    
   
    
} 
