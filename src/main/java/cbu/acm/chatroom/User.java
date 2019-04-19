package cbu.acm.chatroom;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userID;
    private String name;
    private String description;
    
    public User() {
        this.userID = userID;
        this.name = name;
        this.description = description;
    }
    
    public User(String name) {
        this.userID = userID;
        this.name = name;
        description = "";
    }
    
    public User(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    protected int getUserID() {
        return userID;
    }
    
    public String getName() {
        return name;
    }
    
    public String getUserDescription() {
        return description;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    //@restcontroller
    //all the daos are @autowired
    //@requestmapping
    //@requestbody
    //@pathvariable
    
}
