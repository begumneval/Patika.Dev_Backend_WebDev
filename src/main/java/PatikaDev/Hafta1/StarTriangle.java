package PatikaDev.Hafta1;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        //kullanıcıdan basamak sayısını alan kod bloğu
        System.out.print("Basamak sayısını giriniz: ");
        int num = scanner.nextInt();

        /* ilk olarak * yazdırıp ikişer azaltarak
        alt satıra geçen patterni oluşturmak için kullanılan iç içe döngü */
        for (int i = num; i > 0; i--) {
            for (int j = 0; j < (i*2-1); j++) {
                System.out.print("*");

            }
            //alt satıra geçme işlemi burada yapılıyor.
            System.out.println();

        }

    }
}
