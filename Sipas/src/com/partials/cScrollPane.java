package com.partials;

import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

public class cScrollPane extends JScrollPane {

    public cScrollPane(java.awt.Component view,int x,int y,int width,int height){

        super(view);
        setBounds(x, y, width, height);
        getViewport().setBackground(cColor.WHITE_100_1);
        setBorder(new LineBorder(cColor.GREEN_TOSKA,1));

    }

}
