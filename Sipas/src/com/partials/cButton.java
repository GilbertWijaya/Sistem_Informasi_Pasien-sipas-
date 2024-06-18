package com.partials;

import java.awt.Color;

import javax.swing.JButton;

public class cButton extends JButton {

    public cButton(String text,int x,int y,int width,int height,Color color){

        super();

        setText(text);
        setBounds(x, y, width, height);
        setFont(cFonts.DAF_LOG_FONT_18);
        setBackground(color);
        setForeground(cColor.BLACK_1);

    }

}
