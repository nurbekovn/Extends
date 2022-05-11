package com.company;

public  class Person {
    private String name;
    private String  designation;

    public Person() {
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void learn(){
        System.out.println(name+"  can  learn");
    }

    public void walk(){
        System.out.println(name+"  can   walk");
    }

    public void eat(){
        System.out.println(name+ "  can  eat");
    }

    @Override
    public String toString() {
        return "Person: {" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
