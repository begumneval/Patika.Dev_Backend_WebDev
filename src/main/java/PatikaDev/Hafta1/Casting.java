package PatikaDev.Hafta1;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz: ");
        int tamSayi = scanner.nextInt();

        System.out.print("Ondalıklı bir sayı giriniz: ");
        double ondalikliSayi = scanner.nextDouble();

        System.out.println("Tam sayı -> Ondalıklı sayı: " + (double)tamSayi);
        System.out.println("Ondalıklı sayı -> Tam sayı: " + (int)ondalikliSayi);
    }
}
