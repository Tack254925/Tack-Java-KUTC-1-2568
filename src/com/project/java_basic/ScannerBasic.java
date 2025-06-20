package com.project.java_basic;

import java.util.Scanner;

public class ScannerBasic {
    public static void main(String[] args) {
        Scanner MyScaner = new Scanner(System.in);
        System.out.println("Please inout your number :");
        int number = MyScaner.nextInt();
        System.out.println(" Your  number"+ number );
    }
    ;
}
