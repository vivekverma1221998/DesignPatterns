package org.design_patterns.behavioral.commandDp;

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
