
package components;

public class chat_File extends javax.swing.JPanel {

    public chat_File() {
        initComponents();
        setOpaque(false);
    }
    public void setFile(String fileName,String size){
        ibFile.setText(fileName);
        ibFileSize.setText(size);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progress1 = new com.bth.swing.progress();
        jPanel1 = new javax.swing.JPanel();
        ibFile = new javax.swing.JLabel();
        ibFileSize = new javax.swing.JLabel();

        progress1.setProgressType(com.bth.swing.progress.ProgressType.FILE);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        ibFile.setText("my file.file");
        jPanel1.add(ibFile);

        ibFileSize.setForeground(new java.awt.Color(19, 224, 19));
        ibFileSize.setText("5MB");
        jPanel1.add(ibFileSize);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ibFile;
    private javax.swing.JLabel ibFileSize;
    private javax.swing.JPanel jPanel1;
    private com.bth.swing.progress progress1;
    // End of variables declaration//GEN-END:variables
}
