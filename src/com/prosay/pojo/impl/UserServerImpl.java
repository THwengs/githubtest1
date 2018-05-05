package com.prosay.pojo.impl;
import com.prosay.pojo.UserServer;
public class UserServerImpl implements UserServer {
    @Override
    public void say() {
        String zhansna = "zhansna";
        String abc1 = "zhansna";
        System.out.println(zhansna);
        System.out.println("HelloWord");
        String hello = "hello";
        say(hello);
        say(hello);
        say(hello);
        say(hello);
        say(hello);
        say(hello);
    }


    public void say(String name) {
        System.out.println(name);
    }
}
