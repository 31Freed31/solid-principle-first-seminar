package homework;

import homework.core.impl.User;
import homework.core.impl.User;
import homework.core.UserRunner;

public class Main{
    public static void main(String[] args){
        UserRunner userRunner1 = new UserRunner(new User("Bob"));
        userRunner1.run();
        UserRunner userRunner2 = new UserRunner(new User("Alice"));
        userRunner2.run();
    }
}