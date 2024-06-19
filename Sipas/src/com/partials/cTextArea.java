package com.partials;

import javax.swing.JTextArea;

public class cTextArea extends JTextArea {

    public cTextArea(boolean editable){

        super();
        //setBackground(cColor.GREEN_TOSKA);

        if (editable) {
            setForeground(cColor.BLACK_1);
        }
        else{
            setForeground(cColor.BLACK_1);
            setEditable(false);
        }
        
        setLineWrap(true);
        setWrapStyleWord(true);

    }

    public cTextArea(String text,int x,int y,int width,int height, boolean editable){
        this(editable);
        setBounds(x, y, width, height);
    }

}
