package PatikaDev.Hafta1;

import java.util.Scanner;

public class OrtalamaHesabi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int num = scanner.nextInt();
        int sum = 0;
        int count = 0;

        for (int i = 1; i < num; i++) {
            if ((i % 3==0) || (i%4==0) ){
                sum += i;
                count++;
            }

        }
        int ort = sum / count;
        System.out.println("Ortalama: " + ort);

    }
}

