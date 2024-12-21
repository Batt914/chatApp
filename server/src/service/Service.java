
package service;

import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.listener.ConnectListener;
import com.corundumstudio.socketio.listener.DataListener;
import com.mysql.cj.protocol.Message;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTextArea;
import model.ModelRegister;
import model.Model_Message;
import model.Mua;


public class Service {
    private static Service instance;
    private SocketIOServer server;
    private ServiceUser serviceUser;
    private JTextArea textArea;
    private final int PORT_NUMBER = 9999;
    
    public static Service getInstance(JTextArea textArea){
        if(instance == null){
            instance = new Service(textArea);
        }
        return instance;
        
    }
    private Service(JTextArea textArea){
        this.textArea = textArea;
        serviceUser = new ServiceUser();
    }
    
    public void startServer(){
        Configuration config = new Configuration();
        config.setPort(PORT_NUMBER);
        server = new SocketIOServer(config);
        server.addConnectListener(new ConnectListener(){
            @Override
            public void onConnect(SocketIOClient sioc) {
                textArea.append("one clint connected\n");
                
             }
            
        });
        server.addEventListener("register", ModelRegister.class, new DataListener<ModelRegister>() {
            @Override
            public void onData(SocketIOClient sioc, ModelRegister t, AckRequest ar) throws Exception {

                Model_Message massege= serviceUser .register(t);
                ar.sendAckData(massege.isAction(),massege.getMessage(),massege.getData());
                if(massege.isAction()){
                    textArea.append("User has Register : "+ t.getUserName() +" pass : "+ t.getPassword() +"\n");
                }
            }
        });
        server.addEventListener("list_user", Integer.class, new DataListener<Integer>() {
            @Override
            public void onData(SocketIOClient sioc, Integer userID, AckRequest ar) throws Exception {
                try {
                    List<Mua>list=serviceUser.getUset(userID);
                    sioc.sendEvent("list_user",list.toArray());
                    System.out.println("Totel User : "+ list.size());
                } catch (SQLException e) {
                    System.err.println(e);
                }
                
            }
        });
        
        server.start();
        textArea.append("server has started : "+PORT_NUMBER+"\n");
        
        
    }
 
    
}
