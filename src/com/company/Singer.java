package com.company;

public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void singing(){
        System.out.println("can singing");
    }

    public void playGitar(){
        System.out.println("play gitar");
    }

    @Override
    public String toString() {
        return "Singer: {" +
                "bandName='" + bandName + '\'' +
                "} " + super.toString();
    }
}
