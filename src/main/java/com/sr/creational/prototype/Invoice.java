package com.sr.creational.prototype;

public class Invoice implements Document {
    private String content;
    public Invoice(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @Override
    public Document clone() {
       try{
           return (Invoice)super.clone();
       }catch (CloneNotSupportedException e){
           throw new RuntimeException(e);
       }
    }
    @Override
    public void printDocument() {
        System.out.println("Invoice Content: " + content);
    }

    @Override
    public String toString() {
        return "Invoice [content=" + content + "]";
    }
}
