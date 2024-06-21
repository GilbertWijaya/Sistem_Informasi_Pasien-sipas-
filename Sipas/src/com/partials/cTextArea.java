package com.partials;

import javax.swing.JTextArea;

public class cTextArea extends JTextArea {

    public cTextArea(boolean editable){


        super();
        //setBackground(cColor.GREEN_TOSKA);

        
        setForeground(cColor.BLACK_1);

        if (editable) {
            setForeground(cColor.BLACK_1);
            //setEditable(false);
        }
        else{
            setEditable(false);
            
            setForeground(cColor.BLACK_1);
        }
        
        setLineWrap(true);
        setWrapStyleWord(true);

    }

    public cTextArea(int x,int y,int width,int height, boolean editable){
        this(editable);
        setBounds(x, y, width, height);
    }

}
