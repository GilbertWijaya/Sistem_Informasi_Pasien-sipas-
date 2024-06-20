package com.partials;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class cImage extends JLabel {

    public cImage(String file,int width,int height){

        super();
        ImageIcon icon = new ImageIcon(file);
        //setIcon(icon);
        

        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(width,height,java.awt.Image.SCALE_SMOOTH);

        this.setIcon(new ImageIcon(newImg));

        // if (centerAlligntment) {
        //     setHorizontalAlignment(JLabel.CENTER);
        // }
        //setLocation(x, y);
        setVerticalAlignment(JLabel.CENTER);

    }

    // public cImage(String file,int width,int height,boolean centerAllignment) {
    //     super();
    //     ImageIcon icon = new ImageIcon(file);
    //     setIcon(icon);
        
    //     //set size
    //     Image img = icon.getImage();
    //     Image newimg = img.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);

    //     icon.setImage(newimg);

    //     setVerticalAlignment(JLabel.CENTER);
    //     setHorizontalAlignment(JLabel.CENTER);

        
    // }

}
