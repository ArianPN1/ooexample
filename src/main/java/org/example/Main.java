package org.example;

public class Main {
    public static void main(String[] args) {
        Person aStudent = new Person("Max");
        Person aFriend = new Person("Zoe", 22);

        aStudent.sayName();
        aFriend.sayName();
        aStudent.increaseAgeBy(5);
        aFriend.increaseAgeBy(6);
        System.out.println("Students age is " + aStudent.getAge());
        System.out.println("Friends age is " + aFriend.getAge());

    }
}
