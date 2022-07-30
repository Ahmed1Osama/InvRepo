/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.ArrayList;
import view.SalesInvoiceFrame;

/**
 *
 * @ Ahmed_Osama
 */
public class InvoiceHeader {
    private int invoiceNum;
    private String customerName;
    private Date invoiceDate;
    private ArrayList<InvoiceLines> lines;

    public InvoiceHeader(int num, String customer, Date date) {
        this.invoiceNum = num;
        this.customerName = customer;
        this.invoiceDate = date;
    }
    
    public String toCSV() {
        return invoiceNum + "," + SalesInvoiceFrame.sdf.format(invoiceDate) + "," + customerName;
    }
    
    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public ArrayList<InvoiceLines> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }

    public void setLines(ArrayList<InvoiceLines> lines) {
        this.lines = lines;
    }
    
    public double getTotal() {
        double total = 0.0;
        for (InvoiceLines line : getLines()) {
            total += line.getTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Invoice{" + "num=" + invoiceNum + ", customer=" + customerName + ", date=" + invoiceDate + '}';
    }
    
    
    
}
