package com.pluralsight;

public class Animal {

    protected String name;

    public Animal(String name, boolean isAlive){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
