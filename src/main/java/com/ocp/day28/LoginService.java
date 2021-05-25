package com.ocp.day28;

import java.util.ArrayList;
import java.util.List;

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
    // user 資料庫
    private static final List<User> users = new ArrayList<>();
    static {
        users.add(new User("admin", "1234"));
        users.add(new User("john", "5678"));
        users.add(new User("mary", "0000"));
    }
    // check user
    public boolean login(String name, String password) throws LoginFailException {
        boolean check1 = users.stream()
                .filter(user -> user.getName().equals(name))
                .findAny() // 找到一筆
                .isPresent(); // 是否有找到
        if(!check1) { // 若沒找到
            LoginFailException e = new LoginFailException("使用者名稱錯誤");
            throw e; // 拋出 LoginFailException 例外物件
        }
        //-----------------------------------------------------------------------
        boolean check2 = users.stream()
                .filter(user -> user.getName().equals(name) && 
                                user.getPassword().equals(password))
                .findAny()
                .isPresent();
        if(!check2) {
            LoginFailException e = new LoginFailException("使用者密碼錯誤");
            throw e;
        }
        //-----------------------------------------------------------------------
        return true;
    }
}
