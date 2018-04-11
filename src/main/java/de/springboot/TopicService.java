package de.springboot;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {
    ArrayList<Topic> topics = new ArrayList<>();

    {
        topics.add(new Topic("spring", "one", "two"));
        topics.add(new Topic("java", "qw", "er"));
    }

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {

       return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
public void addTopic(Topic topic)
{
    topics.add(topic);
}


    public void updateTopic(String id, Topic topic) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getId().equals(id))
            {
                topics.set(i,topic);
            }
        }
    }


    public void deleteTopic(String id) {
topics.removeIf(t->t.getId().equals(id));

    }

}
