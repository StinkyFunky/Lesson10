package org.itstep;

import java.util.List;

public class UserBeanImpl implements UserBean{

    @Override
    public List<User> getAllUser() {
        return UserDataBase.getUsers();
    }

    @Override
    public User getUserByName(final String name) {
        User user = null;
        for (User u: UserDataBase.getUsers()) {
            if(u.getName().equalsIgnoreCase(name)){
                user= u;
            }
        }
        return user;
    }

    @Override
    public User getUserBySurname(final String surname) {
        User user = null;
        for (User u: UserDataBase.getUsers()) {
            if(u.getName().equalsIgnoreCase(surname)){
                user= u;
            }
        }
        return user;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
