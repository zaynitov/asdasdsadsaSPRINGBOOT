package de.springboot;


import de.springboot.dao.NotesDaoImpl;
import de.springboot.jg.NotesEntity;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics/{id}")
    public String getTopics(@PathVariable String id) {

        DataBaseMethods dataBaseMethods = new DataBaseMethods();
        return  dataBaseMethods.getById(Integer.parseInt(id)).toString();
    }



    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(id, topic);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void updateTopic(@PathVariable String id) {
        topicService.deleteTopic(id);

    }


}
