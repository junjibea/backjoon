package main;

import java.util.Scanner;

// 윤년 구하기
public class Lv2_2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year%4==0 && year%100!=0) || (year%400==0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        scanner.close();
    }
}
