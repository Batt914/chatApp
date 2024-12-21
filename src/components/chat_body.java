/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

import com.bth.swing.ScrollBar;
import java.awt.Adjustable;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;

public class chat_body extends javax.swing.JPanel {
    

    public chat_body() {
        initComponents();
        init();
//         addDate("06/04/2005");
//          addItemRight("kjdcbalif kjejebggliueurg oiewurhgliuewrg liwijgwghwoirthgohglijtrthghlkwjrhghlwghwloiurthglwiurthglwuirng.wkjbgerebhglwurg wjerhglor wrubhgloiuoiur quurhgo; oehrgo oihewrog ");
////       addItemLeft("hello hi aow are you\nhbhviug\nniegfyrygr","Thomas");
//          addItemRight("nen cheppn brother ");
//          addItemLeft("hello hi aow are you","Thomas");
////       addItemRight("nen cheppn brother ");  
////         addItemLeft("hello hi aow are you","Thomas");
////        addItemRight("nen cheppn brother\nbiugvviugv ");  
////         addItemLeft("hello hi aow are you","Thomas");
////         addDate("yesterday");
////         addDate("Today");
////          String img[]={"LgM7u;of~qayofWBRjofofof%MWB"};
////         addItemLeft("hello hi aow are you","Thomas",img);
////        addItemRight("nen cheppn brother\nyduyegfyeg\nuwwyegfuweyf\njwjuewdgfukweg ");
////        addItemRight("nen cheppn brotheryduyegfyeguwwyegfuweyfjwjuewdgfukweg ");
//          addItemRight("hello hi aow are you",new ImageIcon(getClass().getResource("/testingpic/pic.jpg")),new ImageIcon(getClass().getResource("/testingpic/pic.jpg")));
////         addItemRight("hello hi aow are you",new ImageIcon(getClass().getResource("/testingpic/pic1.jpg")));
////         addItemLeft("","Thomas",new ImageIcon(getClass().getResource("/testingpic/pic1.jpg")));
////         addItemRight("kjdcbalif kjejebggliueurg oiewurhgliuewrg liwijgwghwoirthgohglijtrthghlkwjrhghlwghwloiurthglwiurthglwuirng.wkjbgerebhglwurg wjerhglor wrubhgloiuoiur quurhgo; oehrgo oihewrog ",new ImageIcon(getClass().getResource("/testingpic/pic.jpg")));
////        
////         addItemLeft("","Thomas",new ImageIcon(getClass().getResource("/testingpic/ram.jpg.jpg")));
////         addItemFile("my file","Thomas","my doc.pdf","1MB");
////         addItemFileRight("my file","Thomas","my doc.pdf","1MB");


    } 
    private void init(){
        body.setLayout(new MigLayout("filly,fillx"));
        sp.setVerticalScrollBar(new ScrollBar());
    }
    public void addItemLeft(String text, String user,Icon...image){
        chatL_whith_profile item=new chatL_whith_profile();
        item.setText(text);
        item.setImage(image);
        item.setTime();
        item.setUserProfile(user);
        body.add(item,"wrap, w ::80%");
        body.repaint();
        body.revalidate();
        scrollToBottom();
        
    }
    public void addItemLeft(String text, String user,String[] image){
        chatL_whith_profile item=new chatL_whith_profile();
        item.setText(text);
        item.setImage(image);
        item.setTime();
        item.setUserProfile(user);
        body.add(item,"wrap, w ::80%");
        body.repaint();
        body.revalidate();
        scrollToBottom();
        
    }
     public void addItemFile(String text, String user,String fileName,String fileSize){
        chatL_whith_profile item=new chatL_whith_profile();
        item.setText(text);
        item.setFile( fileName, fileSize);
        item.setTime();
        item.setUserProfile(user);
        body.add(item,"wrap, w ::80%");
        body.repaint();
        body.revalidate();
        scrollToBottom();
    }
     public void addItemRight(String text,Icon... image){
        chatR item=new chatR();
        item.setText(text);
        item.setImage(image);
        item.setTime();
        body.add(item,"wrap, al right,w :: 80%");
        body.repaint();
        body.revalidate();
        scrollToBottom();
        
        
    }
      public void addItemFileRight(String text, String user,String fileName,String fileSize){
        chatR item=new chatR();
        item.setText(text);
        item.setFile(fileName, fileSize);
        item.setTime();
        body.add(item,"wrap,al right, w ::80%");
        body.repaint();
        body.revalidate();
        scrollToBottom();
       
        
    }
     public void addDate(String date){
     
         chat_Date item=new chat_Date();
         item.setDate(date);
         body.add(item,"wrap,al center");
         body.repaint();
         body.revalidate();
     }
     

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        body = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        sp.setBackground(new java.awt.Color(255, 255, 255));
        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bodyMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 799, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );

        sp.setViewportView(body);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bodyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bodyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bodyMouseClicked

     
    private void scrollToBottom() {
    JScrollBar verticalBar = sp.getVerticalScrollBar();
    AdjustmentListener downScroller = new AdjustmentListener() {
        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            Adjustable adjustable = e.getAdjustable();
            adjustable.setValue(adjustable.getMaximum());
            verticalBar.removeAdjustmentListener(this);
        }
    };
    verticalBar.addAdjustmentListener(downScroller);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
