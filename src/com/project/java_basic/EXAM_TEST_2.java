package com.project.java_basic;

import java.util.Scanner;

public class EXAM_TEST_2 {
    public static void main(String[] args) {
        System.out.println("โปรแกรมคำนวณราคาตั่วสวนสนุก");
        System.out.println("เด็ก    (อายุน้อยกว่า 12 ปี)");
        System.out.println("วันธรรมดา: 150 บาท");
        System.out.println("วันหยุด:    200 บาท");
        System.out.println("ผู้ใหญ่   (อายุ 12 - 59 ปี)");
        System.out.println("วันธรรมดา: 300 บาท");
        System.out.println("วันหยุด:    400 บาท");
        System.out.println("ผู้สูงอายุ (อายุ 60 ปีขึ้นไป)");
        System.out.println("เข้าชมฟรีทุกวัน");
        System.out.println("กรอกอายุผู้ต้องการจอง");
        Scanner wide = new Scanner(System.in);
        int age = wide.nextInt();
        System.out.println("อายุของคุณ" + age);
        System.out.println("ประเภทวัน");
        Scanner day = new Scanner(System.in);
        int sumday = wide.nextInt();
        if (sumday == 1) {
            if (age < 12) {
                System.out.println("ราคาตั๋ว 150 บาท");
            } else if (age >= 12 && age <= 59) {
                System.out.println("ราคาตั๋ว 300 บาท");
            } else if (age >= 60) {
                System.out.println("เข้าชมฟรีทุกวัน");
            } else {
                System.out.println("ไม่พบข้อมูล");
            }
        } else if (sumday == 2) {
            if (age < 12) {
                System.out.println("ราคาตั๋ว 200 บาท");
            } else if (age >= 12 && age <= 59) {
                System.out.println("ราคาตั๋ว 400 บาท");
            } else if (age >= 60) {
                System.out.println("เข้าชมฟรีทุกวัน");
            } else {
                System.out.println("ไม่พบข้อมูล");
            }
        } else {
            System.out.println("ERROR: กรอกประเภทวันไม่ถูกต้อง (ต้องเป็น 1 หรือ 2 เท่านั้น)");
        }
    }
}
