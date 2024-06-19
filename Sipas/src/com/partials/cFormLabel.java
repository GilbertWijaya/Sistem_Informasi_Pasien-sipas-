package com.partials;

import javax.swing.JLabel;

public class cFormLabel extends JLabel {

    public cFormLabel(String text,int x,int y,int width,int height){

        super();
        setText(text);
        setBounds(x, y, width,height);

        setFont(cFonts.INFOR_BOLD_FONT_19);
        setForeground(cColor.BLACK_1);

    }

}
