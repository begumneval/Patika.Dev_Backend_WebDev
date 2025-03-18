package PatikaDev.Hafta2;

import java.util.Scanner;

public class GecerliSifre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //şifre kuralları
        System.out.println("Aşağıdaki kurallara göre bir şifre giriniz: \n" +
                "1-En az 8 karakter içermeli\n" +
                "2-Space karakteri içermemeli\n" +
                "3-İlk harf büyük harf olmalı\n" +
                "4-Son karakteri ? olmalı");

        String sifre = scanner.next();

        //şifre geçerli mi değil mi?
        if (sifre.length()<8 || //min 8 karakter
                sifre.contains(" ") || //boşluk içermemeli
                (!sifre.endsWith("?")) || //? ile bitmeli
                Character.isLowerCase(sifre.charAt(0))) { //büyük harfle başlamalı
            System.out.println("Geçersiz Şifre"); //herhangi biri sağlanmazsa geçersiz
        }
         else {
            System.out.println("Geçerli şifre"); //hepsi sağlanırsa geçerli
        }

         scanner.close();

    }
}
