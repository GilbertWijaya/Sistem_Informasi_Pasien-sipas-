package com.partials;

import java.awt.Font;

import javax.swing.JRadioButton;

public class cRadioButton extends JRadioButton {

    public cRadioButton(String text,String value,int x, int y,int width,int height){

        super();
        setText(text);
        setBounds(x, y, width, height);
        setActionCommand(value);
        setForeground(cColor.BLACK_1);
        setFont(new Font("Poppins", Font.PLAIN,height));

    }

}
