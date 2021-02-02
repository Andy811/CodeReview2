package com.andeji;

import com.test.Implement;
import com.test.MyInterface;

import java.awt.*;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.List;

public class Main extends Implement implements MyInterface {
    protected String b;

    public static void main(String[] args) throws NoSuchAlgorithmException {

        JavaA1 a1 = new JavaA1();
        Implement im = new Implement();

        //A1
        //a1.a1();

        JavaA5 a5 = new JavaA5();



//        Scanner scanner = new Scanner(System.in);
//        System.out.println("請輸入密碼: ");
//        String passworld = scanner.nextLine();
//        System.out.println("選擇演算法 0=MD2、1=MD5、2=SHA-1、3=SHA-256、4=SHA-384、5=SHA-512");
//        int algorithm = scanner.nextInt();
//        System.out.println("是否使用salt (Y/N):");
//        Scanner sc2 = new Scanner(System.in);
//        String reqSalt = sc2.nextLine();
//        String salt = "";
//        if (reqSalt.equalsIgnoreCase("y")) {
//            salt = a5.getSalt();
//            System.out.println(a5.stringHash(passworld, algorithm, salt));
//        }
//        if (reqSalt.equalsIgnoreCase("n")) {
//            salt = "";
//            System.out.println(a5.stringHash(passworld, algorithm, salt));
//        }
//
//        System.out.println("salt: " + salt);




        // A2
//        Main main = new Main();
//
//        String pubString = im.pubString;  //This is public example
//        String proString = main.proString; //This is protected example
//        String defString ;
//
//        main.overloadMethod();
//        main.overloadMethod("overload");  //this is overload example




    }

}
