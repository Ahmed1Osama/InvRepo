/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @ Ahmed_Osama
 */
public class LineTableModel extends AbstractTableModel {

    private String[] cols = {"NO.","Item Name", "Item Price", "Count", "Item Total"};
    private List<InvoiceLines> lines;
    private List<InvoiceHeader> hD ;

    public LineTableModel(List<InvoiceLines> lines) {
        this.lines = lines;
    }

    public List<InvoiceLines> getLines() {
        return lines;
    }
    
    @Override
    public int getRowCount() {
        return lines.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public String getColumnName(int column) {
        return cols[column];
    }
    
   
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceLines line = lines.get(rowIndex);
              
        switch (columnIndex) {
            case 0: return line.getInvNo();
            case 1: return line.getItemName();
            case 2: return line.getItemPrice();
            case 3: return line.getCount();
            case 4: return line.getTotal(); 
        }
        return "";
    }
}
