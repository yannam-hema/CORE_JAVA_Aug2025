package com.gqt.challenges.Interface;

interface comparable {
    void compareTo();
}
interface Cloneable {
    Object clone();
}
class Number implements Cloneable {
    @Override
    public Object clone() {
        System.out.println("Number is cloned");
        return this; 
    }
}
class Person implements comparable {
    @Override
    public void compareTo() {
        System.out.println("Person is compared");
    }
}
public class Challenge5 {
    public static void main(String[] args) {
        Number n = new Number();
        Person p = new Person();
        Object obj = n.clone();
        p.compareTo();    

    }
}
