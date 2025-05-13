package com.pluralsight;

public class Main {
    public static void main(String[] args) {


        Dog d = new Dog("rover", true);
        d.setBreed("poodle");
        d.setName("rover");

        d.bark();

        System.out.println(d);


        Animal a = new Animal("rover");



    }
}