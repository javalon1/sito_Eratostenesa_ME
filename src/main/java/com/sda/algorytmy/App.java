package com.sda.algorytmy;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj przedział liczb ");
        int n = scanner.nextInt();
        while(n<200) {
            int licznik = 0;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    //System.out.println("jest dzielnik: " + i);
                    licznik++;
                }
            }
            if (licznik == 0) {
                System.out.println(n + " jest liczba pierwsza");
            } else {
                //System.out.println(n + " nie jest liczba pierwsza");
            }
         n++;
        }
    }
}