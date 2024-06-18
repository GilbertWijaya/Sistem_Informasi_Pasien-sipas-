package com.partials;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class cTable extends JTable {

    public cTable(javax.swing.table.TableModel dm){

        super(dm);
        getTableHeader().setBackground(cColor.BLUE_1);
        getTableHeader().setForeground(cColor.BLACK_1);
        setRowHeight(30);
        getTableHeader().setReorderingAllowed(false);
        setShowVerticalLines(false);
        setShowHorizontalLines(false);
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setDragEnabled(true);
        setSelectionBackground(cColor.GREEN_TOSKA);
        setSelectionForeground(cColor.BLACK_1);


    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

}
