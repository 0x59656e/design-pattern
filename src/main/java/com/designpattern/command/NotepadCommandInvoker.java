package com.designpattern.command;

import java.util.ArrayList;
import java.util.List;

import com.designpattern.memento.Notepad;
import com.designpattern.memento.NotepadBackup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotepadCommandInvoker {
    private Notepad notepad;
    private List<Command> notepadCmdList = new ArrayList<>();
    private List<NotepadBackup> notepadBackupList = new ArrayList<>();
    static final Logger LOGGER = LoggerFactory.getLogger(NotepadCommandInvoker.class);

    public NotepadCommandInvoker(Notepad notepad) {
        this.notepad = notepad;
    }

    public void makeBackup(Command notepadBackupCmd) {
        LOGGER.info("Executing backup {} ...", notepadBackupCmd);
        notepadCmdList.add(notepadBackupCmd);
        notepadBackupList.add(notepadBackupCmd.execute(this.notepad));
        LOGGER.info("Current Backups: {}", notepadBackupList.size());
        for (NotepadBackup notepadBackup : notepadBackupList) {
            LOGGER.info("{}", notepadBackup);
        }
    }

    public void recoverBackup(Command notepadRecoverCmd) {
        NotepadBackup lastBackup = notepadBackupList.get(0);
        LOGGER.info("Getting last backup {} ...", lastBackup);
        notepadCmdList.add(notepadRecoverCmd);
        LOGGER.info("Executing recover {} ...", notepadRecoverCmd);
        this.notepad.setTextString(lastBackup.getTextString());
        LOGGER.info("Rollback finished {} ...", this.notepad);
    }
}
