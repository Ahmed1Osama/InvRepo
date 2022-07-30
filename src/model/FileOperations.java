package model;

import java.util.ArrayList;

import static controller.SalesInvoiceListener.frame;

public class FileOperations {

    static ArrayList<InvoiceHeader> invoicesArray = frame.getInvoices();
    static String headers = "";
    static String lines = "";

    public static void readFilesData() {
       for (InvoiceHeader invoice : invoicesArray) {
            headers += invoice.toString();
        headers += "\n";
           System.out.println("{Invoice Num:" + invoice.getInvoiceNum() + "\n");
          writeFilesHeaderData(invoice);
           for (InvoiceLines line : invoice.getLines()) {
               lines += line.toString();
                lines += "\n";
                writeFilesItemData(line);

            }
           System.out.println("}" + "\n" + "------------------------------------");
        System.out.println("welcom");
        }
    }

    public static void writeFilesItemData(InvoiceLines x) {
        System.out.println(x);
    }

    public static void writeFilesHeaderData(InvoiceHeader x) {
        System.out.println(x);

    }

}


