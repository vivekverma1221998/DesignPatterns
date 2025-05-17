package org.design_patterns.behavioral.comand_dp;

public class Main {
    public static void main(String[] args) {

        FileCommand fileCommand = new OpenFileCommand(new File("abc.txt"));

        FileCommand fileCommand1 = new SaveFileCommand(new File("abc.txt"));

        FileCommand fileCommand2 = new DeleteFileCommand(new File("xyz.txt"));

        fileCommand.execute();
        fileCommand1.execute();
        fileCommand2.execute();
    }
}
