package com.sr.creational.prototype;

public class DocClient {
    public static void main(String[] args) {
        DocPrototypeManager docPrototypeManager = new DocPrototypeManager();
      //  docPrototypeManager.printMapElements();
        Document invoiceClone =  docPrototypeManager.getPrototype("Invoice");
//        invoiceClone.setContent("Rewriting Invoice Content");
//        docPrototypeManager.printMapElements();
        invoiceClone.printDocument();
        Document reportClone = docPrototypeManager.getPrototype("Report");
        reportClone.printDocument();
        docPrototypeManager.addPrototype("Summary", new Report("Summary Report Content"));
        Document summaryClone = docPrototypeManager.getPrototype("Summary");
        summaryClone.printDocument();
    }
}
