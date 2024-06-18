package com.partials;

import java.awt.event.MouseEvent;

import javax.swing.JLabel;

public class cLinkStart extends JLabel {

    public cLinkStart(String text,int x,int y){

        super();
        setText(text);
        setBounds(x, y, 138, 21);

        setHorizontalAlignment(JLabel.CENTER);
        setVerticalAlignment(JLabel.CENTER);

        addMouseListener(new java.awt.event.MouseAdapter() {
           
            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }

        });


    }

}
