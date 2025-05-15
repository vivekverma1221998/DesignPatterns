package org.design_patterns.behavioral.commandDp;

public class SaveFileCommand implements FileCommand{

    private File file;

    public SaveFileCommand(File file) {
        this.file = file;
    }


    @Override
    public void execute() {
        file.saveFile();
    }
}
