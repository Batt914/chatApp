
package components;

import java.awt.Color;

public class chat_title extends javax.swing.JPanel {


    public chat_title() {
        initComponents();
    }
    public void setUserActive(String userName){
        lbName.setText(userName);
    }
    public void stetusActive(){
        lbActive.setText("Active");
        lbActive.setForeground(new java.awt.Color(0, 0, 204));
    }
    public void setStetusText(String text){
        lbActive.setText(text);
        lbActive.setForeground(new Color(160,160,160));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        lbName = new javax.swing.JLabel();
        lbActive = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLayeredPane1.setLayout(new java.awt.GridLayout(0, 1));

        lbName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbName.setForeground(new java.awt.Color(61, 61, 61));
        lbName.setText("Name");
        jLayeredPane1.add(lbName);

        lbActive.setForeground(new java.awt.Color(0, 0, 204));
        lbActive.setText("Active");
        jLayeredPane1.add(lbActive);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lbActive;
    private javax.swing.JLabel lbName;
    // End of variables declaration//GEN-END:variables
}
