package main;

import java.util.Scanner;

// N 찍기
public class Lv3_2741 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int k=0;
        for (int i = 0; i < N; i++) {
            k++;
            System.out.println(k);
        }
        scanner.close();
    }
}