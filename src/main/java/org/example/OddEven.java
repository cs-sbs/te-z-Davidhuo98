package org.example;
import java.util.Scanner;

public class OddEvenCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddCount = 0;
        int evenCount = 0;

       

        while (true) {




            int num = scanner.nextInt();


            if (num == -1) {
                break;
            }


            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }


        System.out.println(oddCount);
        System.out.println(evenCount);


        scanner.close();
    }
}
