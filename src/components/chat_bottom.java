
package components;

import com.bth.swing.ScrollBar;
import com.bth.swing.TextPane;
import events.publicEvent;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;

public class chat_bottom extends javax.swing.JPanel {

    public chat_bottom() {
        initComponents();
        setOpaque(false);
        init();
    }
    private void init(){

        setLayout(new MigLayout("fillx,filly","0[fill]0[]0[]2","2[fill]2"));
        JScrollPane scroll = new JScrollPane();
        scroll.setBorder(null);
        TextPane txt= new TextPane();
        txt.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e) {
                revalidate();
              
            }
            
        });
        txt.setHintText("mera bhAAi...");
        scroll.setViewportView(txt);
        ScrollBar sb=new ScrollBar();
        sb.setPreferredSize(new Dimension(2,10));
        scroll.setVerticalScrollBar(sb);
        add(sb);
        add(scroll,"w 100%");
        JPanel panel=new JPanel();
        panel.setLayout(new MigLayout("filly","0[]0","0[bottom]0"));
        panel.setPreferredSize(new Dimension(30,28));
        panel.setBackground(Color.WHITE);
        JButton cmd=new JButton();
        cmd.setBorder(null);
        
        cmd.setContentAreaFilled(false);
        cmd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmd.setIcon(new ImageIcon(getClass().getResource("/testingpic/send.png")));
        cmd.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=txt.getText().trim();
                if(text.equals("")){
                    txt.grabFocus();
                }else{
                    publicEvent.getInstance().getEventChat().snedMessage(text);
                    txt.setText(text);
                    txt.grabFocus();
                    refresh();
                }
            }
            
        });
        panel.add(cmd);
        add(panel);
                

    }
    private void refresh(){
        revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
