package com.project.java_basic;

import java.util.Scanner;

public class EXAM_TEST_3 {
    public static void main(String[] args) {
        Double scoll_one;
        double scoll_two;
        System.out.println("โปรแกรมกรอกข้อมูลคะแนนและสรุปผล");
        Scanner wide = new Scanner(System.in);
        while (true){
            System.out.print("กรุณากรอกคะแนนกลางภาค (30 - 70): ");
            scoll_one = wide.nextDouble();
            if (scoll_one >= 30 && scoll_one <= 70) {
                break;
            } else {
                System.out.println("กรอกข้อมูลใหม่อีกครั้ง (ค่าคะแนนต้องอยู่ระหว่าง 30 ถึง 70)");
            }
        }
        System.out.println("คะแนนปกลางภาคของคุณคือ:"+scoll_one);
        Scanner WIDE = new Scanner(System.in);
        while (true){
            System.out.print("กรุณากรอกคะแนนปลายภาค (30 - 70): ");
            scoll_two = WIDE.nextDouble();
            if (scoll_two >= 30 && scoll_two <= 70) {
                break;
            } else {
                System.out.println("กรอกข้อมูลใหม่อีกครั้ง (ค่าคะแนนต้องอยู่ระหว่าง 30 ถึง 70)");
            }
        }
        System.out.println("คะแนนปลายภาคของคุณคือ:"+scoll_two);
        double totol = scoll_one + scoll_two;
        System.out.println("คะแนนรวมของคุณ" + totol);
        if (totol >= 70 ){
            System.out.println("PASS");
        }else {
            System.out.println("FAILED");
        }
    }
}
