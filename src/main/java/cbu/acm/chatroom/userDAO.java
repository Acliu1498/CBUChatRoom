package cbu.acm.chatroom;

import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.*;

@Repository
@Transactional
public class userDAO implements DAO<User> {
    
    private Set<User> users;
    @PersistenceContext
    private EntityManager entityManager;
    
    public userDAO() {
        users = new HashSet<>();
    }

    @Override
    public void create(User obj) {
        entityManager.persist(obj);
    }

    @Override
    public User retrieve(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void update(User obj) {
        entityManager.merge(obj);
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }
    
}
