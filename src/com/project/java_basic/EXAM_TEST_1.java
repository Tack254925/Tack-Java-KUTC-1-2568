package com.project.java_basic;
import java.util.Scanner;
public class EXAM_TEST_1 {
    public static void main(String[] args) {
        System.out.println("โปรแกรมรับส่งพัสดุ");
        System.out.println("กรอกน้ำหนักส่งพัสดุของคุณ");
        Scanner wide = new Scanner(System.in);
        Double Wihgt = wide.nextDouble();
        System.out.println("------------------------------------------------");
        System.out.println("น้ำหนักส่งพัสดุของคุณ" + Wihgt+("กก."));
        System.out.println("เงื่อนไขของการส่งพัสดุ + ค่าส่งพ์้นฐานตามน้ำหนัก");
        System.out.println("ไม่เกิน  1  กก. : 50");
        System.out.println("มากกว่า 1  กก.แต่ไม่เกิน 5 กก. : 80");
        System.out.println("มากกว่า 5  กก.แต่ไม่เกิน 10 กก. : 150");
        System.out.println("มากกว่า 20 กก. : 200");
//        System.out.println("ส่งด่วน กด 2 เพิ่ม 50");
        System.out.println("------------------------------------------------");
        if (Wihgt <=1) {
            System.out.println("ค่าส่งของคุณ 50 บาท-.");
        } else if (Wihgt <=5 ) {
            System.out.println("ค่าส่งของคุณ 80 บาท-.");
        } else if (Wihgt <=10) {
            System.out.println("ค่าส่งของคุณ 150 บาท-.");
        } else if (Wihgt >10) {
            System.out.println("ค่าส่งของคุณ 200 บาท-.");
        }else{
            System.out.println("ไม่มีน้ำหนัก");
        }
        System.out.println("ส่งด่วน กด 2 เพิ่ม 50 บาท-.");
        Scanner Sand = new Scanner(System.in);
        Double Totol = wide.nextDouble();
        if (Totol ==2 ){
            if (Wihgt ==1){
                System.out.println("ค่าส่งของคุณ 50 บาท-. + ส่งด่วน 50 บาท-. ทั้งหมด = 100 ");
            } else if (Wihgt <=5 ) {
                System.out.println("ค่าส่งของคุณ 80 บาท-. + ส่งด่วน 50 บาท-. ทั้งหมด = 130 ");
            }else if (Wihgt <=10){
                System.out.println("ค่าส่งของคุณ 150 บาท-. + ส่งด่วน 50 บาท-. ทั้งหมด = 200 ");
            }else if (Wihgt >10){
                System.out.println("ค่าส่งของคุณ 200 บาท-. + ส่งด่วน 50 บาท-. ทั้งหมด = 250 ");
            }
        }else {
            System.out.println("คุณไม่ได้ใช้บริการส่งด่วน");
        }
    }
}