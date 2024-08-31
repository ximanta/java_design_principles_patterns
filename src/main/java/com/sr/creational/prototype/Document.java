package com.sr.creational.prototype;

public interface Document extends Cloneable {
    Document clone();
    void printDocument();
}