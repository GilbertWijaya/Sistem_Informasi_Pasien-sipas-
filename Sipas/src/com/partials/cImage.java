package com.partials;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class cImage extends JLabel {

    public cImage(String file,int x,int y,int width,int height,boolean centerAlligntment){

        super();
        ImageIcon icon = new ImageIcon(file);
        setIcon(icon);

        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(width, height,java.awt.Image.SCALE_SMOOTH);

        icon.setImage(newImg);

        if (centerAlligntment) {
            setHorizontalAlignment(JLabel.CENTER);
        }

        setVerticalAlignment(JLabel.CENTER);

    }

}
