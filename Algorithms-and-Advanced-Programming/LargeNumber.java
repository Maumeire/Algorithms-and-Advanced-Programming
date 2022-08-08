/*
Algorithms and Advanced Prgraming
Meire de Jesus Torres
28/01/2022
*/

import java.util.Scanner;

public class LargeNumber {

    public static void main(String args[]) {

        int number1;
        int number2;

        try (Scanner sc = new Scanner(System.in)) {
            number1 = sc.nextInt();
            number2 = sc.nextInt();
        }
        if (number1 >= number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }

    }

}