package com.designpattern;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.command.NotepadBackupCommand;
import com.designpattern.command.NotepadCommandInvoker;
import com.designpattern.command.NotepadRecoverCommand;
import com.designpattern.memento.Notepad;

public class TestMemento {
    final static Logger LOGGER = LoggerFactory.getLogger(TestMemento.class);

    @Test
    public void testBackup() {
        Notepad notepad = new Notepad("Foo");
        NotepadCommandInvoker notepadCommandInvoker = new NotepadCommandInvoker(notepad);
        NotepadBackupCommand notepadBackupCommand = new NotepadBackupCommand();
        
        LOGGER.info("{}", notepad);
        notepadCommandInvoker.makeBackup(notepadBackupCommand);

        notepad.setTextString("Bar");
        LOGGER.info("{}", notepad);
        notepadCommandInvoker.makeBackup(notepadBackupCommand);

        notepad.setTextString("Gar");
        LOGGER.info("{}", notepad);
        notepadCommandInvoker.makeBackup(notepadBackupCommand);

        NotepadRecoverCommand notepadRecoverCommand = new NotepadRecoverCommand();
        notepadCommandInvoker.recoverBackup(notepadRecoverCommand);
    }
}
