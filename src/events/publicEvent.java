
package events;


public class publicEvent {
    private static publicEvent instance;
    private EventMain eventMain;
    private EventImageView eventImageView;
    private EventChat eventchat;
    private EventLogin evenLogin;
    private EventMenuL eml;
    
    
    public static publicEvent getInstance(){
        if(instance == null){
            instance = new publicEvent();
            
        }
        return instance;
    }
    private publicEvent(){
        
    }

    public void addEventMain(EventMain event) {
        this.eventMain = event;
        
    }
    
    public void addEventImageView(EventImageView event){
        this.eventImageView=event;
        
    }
    public void addEventChat(EventChat event){
        this.eventchat=event;
      
    }
    public void addEventLogin(EventLogin event){
        this.evenLogin=event;
    }
    public void  addEventMenuL(EventMenuL event){
        this.eml=event;
    }
    public  EventMain getEventMain(){
    
        return eventMain;
    }
    public EventImageView getEventImageView(){
        return eventImageView;
    }
    public EventChat getEventChat(){
        return eventchat;
    }
    public EventLogin getEventLogin(){
    
        return evenLogin;
    }
    public EventMenuL getEevEventMenuL(){
        return eml;
    }

   
    
    
}
