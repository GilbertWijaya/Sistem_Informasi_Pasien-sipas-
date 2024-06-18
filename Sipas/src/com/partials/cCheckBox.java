package com.partials;

import javax.swing.JCheckBox;

public class cCheckBox extends JCheckBox {

    public cCheckBox(String text,String value,int x,int y){

        super();
        setBounds(x, y, 37, 37);
        setFont(cFonts.DAF_LOG_FONT_18);
        setForeground(cColor.BLACK_1);
        setBackground(cColor.WHITE_100_1);
        setActionCommand(value);
        setText(text);

    }

}
