package com.test;

public interface MyInterface {

    public void publicMethod(String a);

    default void defMethod() {
        System.out.println("default method");
    }


}
