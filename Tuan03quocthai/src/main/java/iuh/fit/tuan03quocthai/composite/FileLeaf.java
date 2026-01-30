package iuh.fit.tuan03quocthai.composite;

//package com.example.demo.composite;

public class FileLeaf implements FileSystemComponent {
    private String name;

    public FileLeaf(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("File: " + name);
    }
}
