package com.test;

public class Implement implements MyInterface {

    public String pubString = "public string";

    protected String proString = "protected string";

    private String priString = "private string";

    String defString = "default string";
    // default String defString = "default string";

    @Override  //this is override example
    public void publicMethod(String a) {
        System.out.println("publicMethod");
        defMethod();
    }

    public void overloadMethid(){
        System.out.println("this is method one");
    }
    public void overloadMethid(String str){
        System.out.println("this is method two");
    }


}
