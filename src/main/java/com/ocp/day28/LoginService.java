package com.ocp.day28;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class User {
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}

public class LoginService {
    private static final List<User> users = new ArrayList<>();
    static {
        users.add(new User("admin", "1234"));
        users.add(new User("john", "5678"));
        users.add(new User("mary", "0000"));
    }
}
