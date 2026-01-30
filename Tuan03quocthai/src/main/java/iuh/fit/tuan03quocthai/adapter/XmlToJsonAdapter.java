package iuh.fit.tuan03quocthai.adapter;

//package com.example.demo.adapter;

public class XmlToJsonAdapter implements JsonService {
    private XmlSystem xmlSystem;

    public XmlToJsonAdapter(XmlSystem xmlSystem) {
        this.xmlSystem = xmlSystem;
    }

    @Override
    public String getJsonData() {
        return "{ \"data\": \"Converted from XML\" }";
    }
}
