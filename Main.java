
package com.manafprogramming.practicing;

import java.util.Scanner;
//İlk altı sadə rəqəmi sadalasaq: 2, 3, 5, 7, 11 və 13, biz 6-cı sadə rəqəmin 13 olduğunu görə bilərik. 10001-ci sadə ədəd nədir?

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1; // Axtarılacaq sadə ədədin sirası

        int count = 0; // Tapılan sadə ədədlərin sayı
        int number = 2; // Axtarışın başlandığı ədəd

        while (count < n) {
            if (isPrime(number)) {
                count++;
                if (count == n) {
                    System.out.println(n + "th prime number is: " + number);
                    break;
                }
            }
            number++;
        }
    }
   public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
            
        }
        return true;
    }
}