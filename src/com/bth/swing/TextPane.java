
package com.bth.swing;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import javax.swing.JTextPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.BoxView;
import javax.swing.text.ComponentView;
import javax.swing.text.Element;
import javax.swing.text.IconView;
import javax.swing.text.LabelView;
import javax.swing.text.ParagraphView;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.View;
import javax.swing.text.ViewFactory;

public class TextPane extends JTextPane {

    /**
     * @return the hintText
     */
    public String getHintText() {
        return hintText;
    }

    /**
     * @param hintText the hintText to set
     */
    public void setHintText(String hintText) {
        this.hintText = hintText;
    }
    private String hintText="";

    public void setLineWrap(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setWrapStyleWord(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
    private class WarpEditorKit extends StyledEditorKit{
        private final ViewFactory defauFactory = new WarpColumnFactory();
        @Override
        public ViewFactory getViewFactory(){
            return defauFactory;
       
        }
    }
    private class WarpColumnFactory implements ViewFactory{
        @Override
        public View create (Element elem ){
            String kind = elem.getName();
            if (kind != null){
                if(kind.equals(AbstractDocument.ContentElementName)){
                    return new WarpLabelView(elem);
                    
                }
                else if(kind.equals(AbstractDocument.ParagraphElementName)){
                    return new ParagraphView(elem);
                    
                }
                else if(kind.equals(AbstractDocument.SectionElementName)){
                    return new BoxView(elem, View.Y_AXIS);
                }
                else if(kind.equals(StyleConstants.ComponentElementName)){
                    return new ComponentView(elem);
                }
                else if(kind.equals(StyleConstants.IconElementName)){
                    return new IconView(elem);
                }
            }
            return new LabelView(elem);
        
    }
        
    
    }
    private class WarpLabelView extends LabelView{
        
        public WarpLabelView(Element elem) {
            super(elem);
        }
        @Override
        public float getMinimumSpan(int axis){
            switch(axis) {
                case View.X_AXIS:
                    return 0;
                case View.Y_AXIS:
                    return super.getMinimumSpan(axis);
                   
                default:
                      throw new IllegalArgumentException("Invalid axis value: " + axis);

            }
            
            
        }
    
        
    }
    public TextPane(){
        super();
        this.setEditorKit(new WarpEditorKit());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (getText().length() == 0 && !hintText.equals("")) {
            int h = getHeight();
            ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            Insets ins = getInsets();
            FontMetrics fm = g.getFontMetrics();
            int c0 = getBackground().getRGB();
            int c1 = getForeground().getRGB();
            int m = 0xfefefefe;
            int c2 = ((c0 & m) >>> 1) + ((c1 & m) >>> 1);
            g.setColor(new Color(c2, true));
            g.drawString(hintText, ins.left, h / 2 + fm.getAscent() / 2 - 2);
        }
    }
    
}