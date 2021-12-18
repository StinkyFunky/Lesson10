package org.itstep;

import java.util.List;


public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	// Interface

//        SomeClass someClass = new SomeClass();
//        someClass.clone();

        UserBeanImpl service = new UserBeanImpl();

        List<User> allUser = service.getAllUser();

        allUser.stream().forEach(System.out::println);

        System.out.println();
        System.out.println("---------------------");

        System.out.println(service.getUserByName("karina"));
        System.out.println(service.getUserBySurname("Karaeva"));
    }
}
