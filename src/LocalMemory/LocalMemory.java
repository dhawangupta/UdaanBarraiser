package LocalMemory;

import entities.Deal;
import entities.User;

import java.util.ArrayList;
import java.util.List;

public class LocalMemory {
    public List<Deal> dealList;
    public List<User> userList;

    public LocalMemory(){
        dealList = new ArrayList<>();
        userList = new ArrayList<>();
        userList.add(new User("abc"));
    }
}
