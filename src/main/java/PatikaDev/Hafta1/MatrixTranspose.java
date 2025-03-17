package PatikaDev.Hafta1;

import java.util.Scanner;

public class MatrixTranspose {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //kullanıcıdan matris boyutlarını alan kod bloğu
            System.out.print("Satır sayısını girin: ");
            int satir = scanner.nextInt();
            System.out.print("Sütun sayısını girin: ");
            int sutun = scanner.nextInt();

            //matrislerin boyutunu tanımlayan kod bloğu
            int[][] matrix = new int[satir][sutun];
            int[][] transpose = new int[sutun][satir];

            //kullanıcıdan matris elemanlarını alan kod bloğu
            System.out.println("Matris elemanlarını girin:");
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            //matrisin transpozunu hesaplama
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            }

            //orijinal matrisi yazdırma
            System.out.println("Orijinal Matris:");
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }

            //transpoz matrisi yazdırma
            System.out.println("Transpoz Matris:");
            for (int i = 0; i < sutun; i++) {
                for (int j = 0; j < satir; j++) {
                    System.out.print(transpose[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }


