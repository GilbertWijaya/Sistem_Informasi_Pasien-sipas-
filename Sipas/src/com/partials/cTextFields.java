package com.partials;

import javax.swing.JTextField;

public class cTextFields extends JTextField {

    public cTextFields(int x,int y,int width,boolean centerAllignment){

        super();
        setBounds(x, y, width, 28);

        if (centerAllignment) {
            setHorizontalAlignment(JTextField.CENTER);
        }

        setForeground(cColor.BLACK_1);
        setBorder(new javax.swing.border.LineBorder(cColor.BLACK_1,1));

    }

}
