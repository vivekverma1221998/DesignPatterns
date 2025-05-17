package org.design_patterns.behavioral.comand_dp;

public class DeleteFileCommand implements FileCommand{

    private File file;

    public DeleteFileCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.deleteFile();
    }
}
