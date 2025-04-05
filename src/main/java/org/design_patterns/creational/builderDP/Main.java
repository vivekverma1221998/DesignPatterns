package org.design_patterns.creational.builderDP;

public class Main {
    public static void main(String[] args) {

        User user = new User.UserBuilder()
                .setName("vivek")
                .setSal(1000)
                .setDepartment("developer")
                .build();

        System.out.println(user.getName() + ", "+ user.getSal());


        User user2 = new User.UserBuilder()
                .setName("verma")
                .setSal(2400)
                .setDepartment("backend")
                .build();

        System.out.println(user2.getName() + ", "+ user2.getSal());
    }
}
