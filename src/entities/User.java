package entities;

import java.util.List;

public class User {
    public String id;
    public List<Deal> dealList;
    public User(String id){
        this.id = id;
    }
}
