package com.designpattern.command;

import com.designpattern.memento.Notepad;
import com.designpattern.memento.NotepadBackup;

public class NotepadRecoverCommand implements Command {
    @Override
    public NotepadBackup execute(Notepad notepad) {
        return new NotepadBackup(notepad.getTextString(), notepad.getCreatedDate(), notepad.getUpdatedDate());
    }
}
