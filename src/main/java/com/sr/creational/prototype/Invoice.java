package com.sr.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Invoice implements Document {

    private String content;

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
