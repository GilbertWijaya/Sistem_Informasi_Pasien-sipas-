package com.partials;

import javax.swing.JLabel;

public class cLabelInfo extends JLabel {

    public cLabelInfo(String text,int x,int y){

        super();
        setText(text);
        setBounds(x,y,219,54);

        setFont(cFonts.TEXTFIELD_LBL_BUTTON_FONT_36);
        setForeground(cColor.BLACK_1);

    }

}
