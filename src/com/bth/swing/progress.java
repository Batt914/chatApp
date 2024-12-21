
package com.bth.swing;

import javax.swing.Icon;
import javax.swing.JProgressBar;


public class progress extends JProgressBar {

    /**
     * @return the ProgressType
     */
    public ProgressType getProgressType() {
        return progressType;
    }

    /**
     * @param ProgressType the ProgressType to set
     */
    public void setProgressType(ProgressType ProgressType) {
        this.progressType = ProgressType;
        repaint();
    }
    private ProgressType progressType = ProgressType.NON;

   
   
     public progress(){
        setOpaque(false);
    
        setUI(new ProgressCircleUI(this));
    }
     public static enum ProgressType {
         NON, DOWN_FILE, CANCEL, FILE
     }
    
    
}
