package com.partials;

import javax.swing.JPasswordField;

public class cPasswordField extends JPasswordField {

    public cPasswordField(int x,int y,int width,boolean centerAlligntment){

        super();
        setBounds(x, y, width, 27);

        if (centerAlligntment) {
            setHorizontalAlignment(JPasswordField.CENTER);
        }

        setForeground(cColor.BLACK_1);
        setBorder(new javax.swing.border.LineBorder(cColor.BLACK_1,1));

    }

}
