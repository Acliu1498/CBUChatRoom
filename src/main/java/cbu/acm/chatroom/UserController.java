package cbu.acm.chatroom;

import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.*;

@Repository
@Transactional
public class UserController implements Controller<User> {
    
    private List<User> users;
    /** This entity manager is in charge of beginning, committing, or rolling back the transaction
     *  This is also what makes interactions with our database */
    @PersistenceContext
    private EntityManager entityManager;
    
    public UserController() {
        users = new LinkedList<>();
    }
    
    @Override
    public void add(User user) {
        users.add(user);
        entityManager.persist(users);
    }
    
    @Override
    public User get(int userID) {
        for (User user : users) {
            if (user.getUserID() == userID) {
                return user;
            }
        }
        throw new IllegalArgumentException(userID + " does not exist");
    }
    
    @Override
    public void remove(User user) {
        users.remove(user);
    }
    
}
