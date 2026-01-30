package iuh.fit.tuan03quocthai.composite;
//package com.example.demo.composite;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public FolderComposite(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void showInfo() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent c : children) {
            c.showInfo();
        }
    }
}
