package org.design_patterns.behavioral.commandDp;

public class File {
    String name;
    public File(String name) {
        this.name = name;
    }

    public void openFile(){
        System.out.println("Opening File: " + name);
    }

    public void saveFile(){
        System.out.println("Saving File: " + name);
    }

    public void deleteFile() {
        System.out.println("Delete file: " + name);
    }
}
