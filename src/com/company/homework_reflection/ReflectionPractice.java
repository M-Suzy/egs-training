package com.company.homework_reflection;


public final class ReflectionPractice {
    private int someField;
    private String name;

    public int getSomeField() {
        return someField;
    }

    public String getName() {
        return name;
    }
    ReflectionPractice(int someField, String name){
        this.name=name;
        this.someField = someField;
    }

    private void pFunction(){
    System.out.println("Just private");
    }

}
