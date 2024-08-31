package com.sr.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class DocPrototypeManager {
    Map<String, Document> documentMap = new HashMap<>();

    public DocPrototypeManager() {
        documentMap.put("Invoice", new Invoice("Default Invoice Content"));
        documentMap.put("Report", new Report("Default Report Content"));
    }
    public void addPrototype(String type, Document document) {
        documentMap.put(type, document);
    }
    public Document getPrototype(String type) {
       Document prototype = documentMap.get(type);
       /*Ensures that every time the client requests a document,
       they receive a new copy of the original.*/
       return (prototype != null) ? prototype.clone() : null;
    }

    public void printMapElements() {
        for (Map.Entry<String, Document> entry : documentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }

       }
    }

