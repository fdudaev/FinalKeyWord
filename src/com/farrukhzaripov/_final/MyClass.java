package com.farrukhzaripov._final;

public class MyClass {

    //private final  int myNumber = 1; // because its made final, the value 1 will be constant (can not be changed anywhere else in the class)
    public static int classCounter;
    public final int instanceNumber;
    private final String name;

    public MyClass(String name) {
    //    myNumber = 1;
        this.name = name;
        classCounter ++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);

    }
    public int getInstanceNumber(){
        return instanceNumber;
    }
}
