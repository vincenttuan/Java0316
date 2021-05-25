package com.ocp.day28;

public class LoginCheckMain {
    public static void main(String[] args) {
        
        String name = "admin";
        String password = "1234";
        
        LoginService service = new LoginService();
        
        try {
            System.out.println(service.login(name, password));
        } catch (LoginFailException e) {
            System.out.println(e.getMessage());
            e.怎麼辦();
        }
        
    }
}
