package cbu.acm.chatroom;

public interface Controller<T> {
    
    void add(T obj);
    
    T get(int obj);

    void remove(T obj);
    
}
