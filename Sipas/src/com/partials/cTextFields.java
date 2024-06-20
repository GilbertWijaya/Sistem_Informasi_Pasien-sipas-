package com.partials;

import javax.swing.JTextField;

public class cTextFields extends JTextField {

    public cTextFields(int x,int y,int width,boolean isEditable){

        super();

        if (!isEditable) {
            setEditable(false);
        }

        setBounds(x, y, width, 28);

        setForeground(cColor.BLACK_1);
        setBorder(new javax.swing.border.LineBorder(cColor.BLACK_1,1));

    }

    public cTextFields(String text,int x,int y,int width,boolean isEditable){
        this(x,y,width,isEditable);
        setBounds(x, y, width, 28);

    }

}
