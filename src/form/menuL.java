
package form;

import com.bth.swing.ScrollBar;
import com.sun.source.doctree.DocTree;
import components.Item_peopule;
import events.EventMenuL;
import events.publicEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import model.Mua;
import net.miginfocom.swing.MigLayout;

public class menuL extends javax.swing.JPanel {
    private List<Mua> usreAccount;

    public menuL() {
        initComponents();
        init();
        setOpaque(false);
    }
    private void init(){
        sp.setVerticalScrollBar(new ScrollBar());
        sp.setHorizontalScrollBar(new ScrollBar());
        menuList.setLayout(new MigLayout("fillx","0[]0","1[]1"));
        usreAccount= new ArrayList<>();
        publicEvent.getInstance().addEventMenuL(new EventMenuL() {
            @Override
            public void newUser(List<Mua> user) {
                for(Mua d:user){
                    usreAccount.add(d);
                    menuList.add(new Item_peopule(d.getUserName()),"wrap");
//                    System.out.println(d);
//                    refreshMenuList();
                    
                }
                
            }
        });
        showMessage();
    }
    private void showMessage(){
        menuList.removeAll();
          for(Mua d : usreAccount){
            menuList.add(new Item_peopule(d.getUserName()),"wrap");
            
        }
        refreshMenuList();
     
            
    }
     private void showGroup(){
        menuList.removeAll();
        for(int i=0;i<20;i++){
            menuList.add(new Item_peopule("Entha mandi ? "+i),"wrap");
            
        }
        refreshMenuList();
            
    }
      private void showBox(){
        menuList.removeAll();
        for(int i=0;i<20;i++){
            menuList.add(new Item_peopule("Evedra nvu ? "+i),"wrap");
            
            
        }
        refreshMenuList();
            
    }
      private void refreshMenuList(){
        menuList.repaint();
        menuList.revalidate();
      }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        menuMgs = new components.MenuButton();
        menuGroup = new components.MenuButton();
        menuBox = new components.MenuButton();
        sp = new javax.swing.JScrollPane();
        menuList = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(249, 249, 249));

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setLayout(new javax.swing.BoxLayout(jLayeredPane1, javax.swing.BoxLayout.X_AXIS));

        menuMgs.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/bth.icon/icons8-select-45.png"))); // NOI18N
        menuMgs.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/bth.icon/icons8-select-45.png"))); // NOI18N
        menuMgs.setSelected(true);
        menuMgs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMgsActionPerformed(evt);
            }
        });
        jLayeredPane1.add(menuMgs);

        menuGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bth.icon/icons8-macos-minimize-48.png"))); // NOI18N
        menuGroup.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/bth.icon/icons8-select-45.png"))); // NOI18N
        menuGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGroupActionPerformed(evt);
            }
        });
        jLayeredPane1.add(menuGroup);

        menuBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bth.icon/icons8-macos-minimize-48.png"))); // NOI18N
        menuBox.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/bth.icon/icons8-select-45.png"))); // NOI18N
        menuBox.setIconTextGap(5);
        menuBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBoxActionPerformed(evt);
            }
        });
        jLayeredPane1.add(menuBox);

        sp.setBackground(new java.awt.Color(255, 255, 255));
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        menuList.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout menuListLayout = new javax.swing.GroupLayout(menuList);
        menuList.setLayout(menuListLayout);
        menuListLayout.setHorizontalGroup(
            menuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
        );
        menuListLayout.setVerticalGroup(
            menuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
        );

        sp.setViewportView(menuList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
            .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sp))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menuGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGroupActionPerformed
      if(!menuGroup.isSelected()) {
        menuMgs.setSelected(false);
        menuGroup.setSelected(true);
        menuBox.setSelected(false);
         showGroup();
      }
    }//GEN-LAST:event_menuGroupActionPerformed

    private void menuBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBoxActionPerformed
        if(!menuBox.isSelected()) {
        menuMgs.setSelected(false);
        menuGroup.setSelected(false);
        menuBox.setSelected(true);
        showBox();
      }
    }//GEN-LAST:event_menuBoxActionPerformed

    private void menuMgsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMgsActionPerformed
     if(!menuMgs.isSelected()) {
        menuMgs.setSelected(true);
        menuGroup.setSelected(false);
        menuBox.setSelected(false);
        showMessage();
  
        
      }
    }//GEN-LAST:event_menuMgsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private components.MenuButton menuBox;
    private components.MenuButton menuGroup;
    private javax.swing.JLayeredPane menuList;
    private components.MenuButton menuMgs;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
