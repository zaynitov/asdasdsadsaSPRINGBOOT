package de.springboot.dao;


import de.springboot.*;
import de.springboot.jg.NotesEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class NotesDaoImpl implements NotesDao {
    private SessionFactory sessionFactory;

    @Override
    public void addNote(NotesEntity notesEntity) {
        
    }

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    public NotesEntity getNotesbyID(long id) {

        Session session = this.sessionFactory.getCurrentSession();


        session.beginTransaction();
        NotesEntity p = (NotesEntity) session.load(NotesEntity.class, id);
        return p;
    }


}
