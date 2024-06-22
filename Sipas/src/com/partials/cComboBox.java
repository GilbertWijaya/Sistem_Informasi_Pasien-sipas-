package com.partials;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class cComboBox extends JComboBox {

    public cComboBox(DefaultComboBoxModel model,int x,int y,int width,int height){
        super(model);
        setActionCommand(model.getSelectedItem().toString());
        setBounds(x, y, width, height);
    }

}
