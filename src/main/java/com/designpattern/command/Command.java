package com.designpattern.command;

import com.designpattern.memento.Notepad;
import com.designpattern.memento.NotepadBackup;

public interface Command {
    NotepadBackup execute(Notepad notepad);
}
