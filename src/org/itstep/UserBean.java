package org.itstep;

import java.util.List;

public interface UserBean {

    List<User> getAllUser();
    User getUserByName(String name);
    User getUserBySurname(String surname);
}
