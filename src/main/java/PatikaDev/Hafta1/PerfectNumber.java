package PatikaDev.Hafta1;

import java.util.Scanner;

public class PerfectNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir sayı giriniz: ");
            int number = scanner.nextInt();
            int sum = 0;

            for (int i = 1; i < number ; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            if (sum == number && number > 1) {
                System.out.println(number + " Mükemmel sayıdır.");
            } else {
                System.out.println(number + " Mükemmel sayı değildir.");
            }
        }

}
