package cbu.acm.chatroom;

import javax.persistence.*;

@Entity
@Table(name = "chatroom")
public class Chatroom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roomID;
    
    public Chatroom() {
        this.roomID = roomID;
    }
    
    public int getRoomID() {
        return roomID;
    }
    
}
