
package com.bth.swing;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

public class Line extends JLabel{

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(getForeground());
        g.drawLine(0, getHeight() / 2, getWidth(), getHeight()/2);
    }
    
    
}
