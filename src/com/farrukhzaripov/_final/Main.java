package com.farrukhzaripov._final;

import java.math.MathContext;

public class Main {
    public static void main(String[] args) {

        MyClass one = new MyClass("one");
        MyClass two = new MyClass("two");
        MyClass three = new MyClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

//        one.instanceNumber = 4; // Cannot assign a value to final variable 'instanceNumber'

        int pw = 234456;
        Password onePw = new Password(pw);
        onePw.storePassword();
        onePw.letMeIn(1);
        onePw.letMeIn(997);
        onePw.letMeIn(-21);
        onePw.letMeIn(234456);



    }
}