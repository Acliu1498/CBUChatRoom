package cbu.acm.chatroom;

import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.*;

@Repository
@Transactional
public class ChatroomController implements Controller<Chatroom> {
    
    private List<Chatroom> chatrooms;
    @PersistenceContext
    private EntityManager entityManager;
    
    public ChatroomController() {
        chatrooms = new LinkedList<>();
    }

    @Override
    public void add(Chatroom room) {
        chatrooms.add(room);
        entityManager.persist(chatrooms);
    }

    @Override
    public Chatroom get(int roomID) {
        for (Chatroom chatroom : chatrooms) {
            if (chatroom.getRoomID() == roomID) {
                return chatroom;
            }
        }
        throw new IllegalArgumentException(roomID + " does not exist");
    }

    @Override
    public void remove(Chatroom room) {
        chatrooms.remove(room);
    }
}
