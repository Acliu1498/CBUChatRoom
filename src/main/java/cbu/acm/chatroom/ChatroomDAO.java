package cbu.acm.chatroom;

import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.*;

@Repository
@Transactional
public class ChatroomDAO implements DAO<Chatroom> {
    
    List<Chatroom> chatrooms;

    @PersistenceContext
    private EntityManager entityManager;
    
    public ChatroomDAO() {
        chatrooms = new LinkedList<>();
    }
    
    @Override
    public void create(Chatroom room) {
        entityManager.persist(room);
    }

    @Override
    public Chatroom retrieve(int id) {
        return entityManager.find(Chatroom.class, id);
    }

    @Override
    public void update(Chatroom room) {
        entityManager.merge(room);
    }

    @Override
    public void delete(Chatroom room) {
        chatrooms.remove(room);
    }
}
