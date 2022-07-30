/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import view.SalesInvoiceFrame;

/**
 *
 * @ Ahmed_Osama
 */
public class HeaderTableModel extends AbstractTableModel {
    private String[] cols = {"Num", "Customer", 
        "Date", "Total"};
    private List<InvoiceHeader> invoices;
    
    public HeaderTableModel(List<InvoiceHeader> invoices) {
        this.invoices = invoices;
    }
    
    @Override
    public int getRowCount() {
        return invoices.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return cols[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceHeader inv = invoices.get(rowIndex);
        switch (columnIndex) {
            case 0: return inv.getInvoiceNum();
            case 1: return inv.getCustomerName();
            case 2: return SalesInvoiceFrame.sdf.format(inv.getInvoiceDate());
            case 3: return inv.getTotal();
        }
        return "";
      
    }
    
}
