
package form;

import components.chat_body;
import components.chat_bottom;
import components.chat_title;
import events.EventChat;
import events.publicEvent;
import net.miginfocom.swing.MigLayout;

public class chat extends javax.swing.JPanel {

    public chat() {
        initComponents();
        init();
    }
    private void init(){
    
        setLayout(new MigLayout("fillx","0[fill]0","0[]0[100%,bottom]0[shrink 0]0"));
        chat_title ct=new chat_title();
        chat_body cb=new chat_body();
        chat_bottom cbm=new chat_bottom();
        publicEvent.getInstance().addEventChat(new EventChat(){

            @Override
            public void snedMessage(String text) {
                cb.addItemRight(text);
                
            }
        });
        add(ct,"wrap");
        add(cb,"wrap");
        add(cbm,"h ::30%");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 868, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
