package PatikaDev.Hafta2;

import java.util.Scanner;

public class Yuvarlama {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //kullanıcıdan ondalıklı bir sayı al
            System.out.print("Bir ondalıklı sayı giriniz: ");
            double sayi = scanner.nextDouble();

            //aşağı yuvarlama
            int asagi = (int) Math.floor(sayi);

            //yukarı yuvarlama
            int yukari = (int) Math.ceil(sayi);

            //en yakın tam sayıya yuvarlama
            int tamSayi = (int) Math.round(sayi);

            //sonuçları ekrana yazdır
            System.out.println("Aşağı yuvarlama: " + asagi);
            System.out.println("Yukarı yuvarlama: " + yukari);
            System.out.println("En yakın tam sayı: " + tamSayi);

            scanner.close();
        }
    }


