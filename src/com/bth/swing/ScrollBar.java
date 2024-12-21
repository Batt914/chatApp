/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bth.swing;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

/**
 *
 * @author bth14
 */
public class ScrollBar extends JScrollBar{
    public  ScrollBar(){
        setUI(new CustomScrollBarUI());
        setPreferredSize(new Dimension(5,5));
        setBackground(new Color(255,255,255));
        setUnitIncrement(30);
    }
    
}
