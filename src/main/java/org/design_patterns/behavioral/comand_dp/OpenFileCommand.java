package org.design_patterns.behavioral.comand_dp;

public class OpenFileCommand implements FileCommand{

    private File file;

    public OpenFileCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.openFile();
    }
}
