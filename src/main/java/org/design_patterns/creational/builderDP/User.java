package org.design_patterns.creational.builderDP;

public class User {

    private final String name;

    private final int sal;

    private final String department;


    public User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.sal = userBuilder.sal;
        this.department = userBuilder.department;
    }


    public String getName() {
        return name;
    }

    public int getSal() {
        return sal;
    }

    public String getDepartment() {
        return department;
    }

    static class UserBuilder{

        private String name;

        private int sal;

        private String department;

        public UserBuilder() {
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setSal(int sal) {
            this.sal = sal;
            return this;
        }

        public UserBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }


    }
}
