package de.springboot;

import de.springboot.dao.NotesDaoImpl;
import de.springboot.jg.NotesEntity;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class DataBaseMethods {
    private static ServiceRegistry serviceRegistry;
    private static SessionFactory sessionFactory;

    public NotesEntity getById(int i) {

        NotesDaoImpl notesDao = new NotesDaoImpl();
        Configuration configuration = new Configuration().configure();
        serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        notesDao.setSessionFactory(sessionFactory);


        NotesEntity notesbyID = notesDao.getNotesbyID(i);
        return notesbyID;
    }


}
