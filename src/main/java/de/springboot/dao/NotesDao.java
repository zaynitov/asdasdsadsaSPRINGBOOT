package de.springboot.dao;

import de.springboot.*;
import de.springboot.jg.NotesEntity;

import java.sql.SQLException;

public interface NotesDao {
    public NotesEntity getNotesbyID(long id);
public void addNote(NotesEntity notesEntity);
}
