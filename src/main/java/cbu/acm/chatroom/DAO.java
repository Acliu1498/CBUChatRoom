package cbu.acm.chatroom;

public interface DAO<T> {
    
    void create(T obj);
    
    T retrieve(int id);
    
    void update(T obj);
    
    void delete(T obj);
    
}
