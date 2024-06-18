package com.partials;

import javax.swing.JLabel;

public class cFormLabel extends JLabel {

    public cFormLabel(String text,int x,int y,int width){

        super();
        setText(text);
        setBounds(x, y, width,29);

        setFont(cFonts.DAF_LOG_FONT_18);
        setForeground(cColor.BLACK_1);

    }

}
