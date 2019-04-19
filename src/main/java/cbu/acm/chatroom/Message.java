package cbu.acm.chatroom;

import javax.persistence.*;
import java.text.*;
import java.util.*;

@Entity
@Table(name = "message")
public class Message {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userID;
    private String username;
    
    public Message(int userID, String username) {
        this.userID = userID;
        this.username = username;
        
    }
    
    public String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        return dateFormat.format(cal);
    }
    
    public String getUsername() {
        return username;
    }
    
}
