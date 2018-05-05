package com.prosay.pojo;

public class User {

    private  String name;
    public User(String name) {
        this.name = name;
    }

    public  void f1() {
        String str = String.format("name%s", name);
        System.out.println(str);
    }

}
