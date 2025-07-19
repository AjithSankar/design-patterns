package behavioral.command.example.commands;

import behavioral.command.example.editor.Editor;

public abstract class Command {

    protected Editor editor;
    protected String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
