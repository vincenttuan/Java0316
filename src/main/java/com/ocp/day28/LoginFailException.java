package com.ocp.day28;

public class LoginFailException extends Exception {

    public LoginFailException(String errorMessage) {
        super(errorMessage);
    }
    
    public void 怎麼辦() {
        System.out.println("請重新登入就好了~~");
    }
    
}
