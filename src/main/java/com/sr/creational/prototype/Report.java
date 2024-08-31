package com.sr.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Report implements Document{

    private String content;

    @Override
    public Document clone() {
        try {
            return (Report)super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void printDocument() {
        System.out.println("Report Content: " + content);

    }
    @Override
    public String toString() {
        return "Report [content=" + content + "]";
    }
}
