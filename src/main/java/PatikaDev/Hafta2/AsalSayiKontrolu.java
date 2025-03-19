package PatikaDev.Hafta2;

import java.util.Scanner;

public class AsalSayiKontrolu {

        //Kullanıcıdan bir sayı alır ve asal olup olmadığını kontrol eder
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir sayı giriniz: ");
            int number = scanner.nextInt();
            scanner.close();

            boolean result = isPrime(number, number - 1);

            printResult(number, result);
        }

        public static boolean isPrime(int number, int divisor) {
            if (number < 2) {
            return false; // 1 ve 0 asal değildir.
            }
            if (divisor == 1) {
            return true; //1 e kadar ulaştıysa asaldır.
            }
            if (number % divisor == 0) {
            return false; //eğer kalansız bölünebiliyorsa asal değildir.
            }
            return isPrime(number, divisor - 1); // Recursive olarak devam et.
        }

        //Sonucu ekrana yazdıran metod.
        private static void printResult(int number, boolean isPrime) {
            if (isPrime) {
                System.out.println(number + " bir asal sayıdır.");
            } else {
                System.out.println(number + " bir asal sayı değildir.");
            }
        }
    }

