package com.sr.creational.prototype;

public class Report implements Document{

    private String content;

    public Report(String content) {
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
try
{
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
