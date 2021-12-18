package org.itstep;

import java.util.ArrayList;
import java.util.List;

public class UserDataBase {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User("Amir","Amirov"));
        users.add(new User("Erbol","Isaev"));
        users.add(new User("Karina", "Karaeva"));
    }

    public static List<User> getUsers(){
        return users;
    }
}
