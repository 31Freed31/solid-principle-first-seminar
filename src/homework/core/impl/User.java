package homework.core.impl;

import homework.core.IUser;

public class User implements IUser {
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}