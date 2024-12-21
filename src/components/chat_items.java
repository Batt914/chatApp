 
package components;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;



public class chat_items extends javax.swing.JLayeredPane {
    private JLabel label;


    public chat_items() {
        initComponents();
        txt.setEditable(false);
    }
    public void setText(String text){
        txt.setText(text);
        txt.setBackground(new Color(0,0,0,0));
        txt.setOpaque(false);
    }
    public void setUserProfile(String user){
        JLayeredPane layer = new JLayeredPane();
        layer.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
        layer.setBorder(new EmptyBorder(0,10,0,10));
        JButton cmd=new JButton(user);
        cmd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmd.setBorder(null);
        cmd.setContentAreaFilled(false);
        cmd.setFocusable(false);
        cmd.setForeground(new Color(30,121,213));
        cmd.setFont(new java.awt.Font("sansserif",1,13));
        txt.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 5, 5));

        layer.add(cmd);
        add(layer,0);
    
        
    }
     public void setTime(String time){
       
        JLayeredPane layer = new JLayeredPane();
        layer.setLayout(new FlowLayout(FlowLayout.RIGHT,0,0));
        layer.setBorder(new EmptyBorder(0,5,10,5));
        label=new JLabel(time);
        label.setHorizontalTextPosition(JLabel.LEFT);
        label.setForeground(new Color(110,110,110));
        layer.add(label);
        add(layer);
     }
     public void setImage(boolean right,Icon...image){
         if(image.length>0){
            JLayeredPane layer= new JLayeredPane();
         layer.setLayout(new FlowLayout(right ? FlowLayout.RIGHT : FlowLayout.LEFT));
         layer.setBorder(new EmptyBorder(0,5,0,5));
         chat_image chatimage=new chat_image(right);
         chatimage.addImage(image);
         layer.add(chatimage);
         add(layer);
         }
         
         
     }
     public void setImage(boolean right,String...image){
         JLayeredPane layer= new JLayeredPane();
         layer.setLayout(new FlowLayout(right ? FlowLayout.RIGHT : FlowLayout.LEFT));
         layer.setBorder(new EmptyBorder(0,5,0,5));
         chat_image chatimage=new chat_image(right);
         chatimage.addImage(image);
         layer.add(chatimage);
         add(layer);
         
         
     }
       public void setFile(String fileName,String fileSize){
         JLayeredPane layer= new JLayeredPane();
         layer.setLayout(new FlowLayout( FlowLayout.LEFT));
         layer.setBorder(new EmptyBorder(0,5,0,5));
         chat_File chatFile=new chat_File();
         chatFile.setFile(fileName,fileSize);
         layer.add(chatFile);
         add(layer);
         
         
     }
     
     
     public void sendSuccess(){
         if(label !=null){
             label.setIcon(new ImageIcon(getClass().getResource("")));
         }
     }
     public void seen(){
         if(label !=null){
             label.setIcon(new ImageIcon(getClass().getResource("")));
         }
     }
     public void hideText(){
         txt.setVisible(false);
     }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2=(Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15,15);
        super.paintComponent(g); 
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new com.bth.swing.TextPane();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        txt.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        txt.setSelectionColor(new java.awt.Color(107, 195, 255));
        txt.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                txtComponentHidden(evt);
            }
        });
        add(txt);
    }// </editor-fold>//GEN-END:initComponents

    private void txtComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txtComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComponentHidden


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.bth.swing.TextPane txt;
    // End of variables declaration//GEN-END:variables

  
}
