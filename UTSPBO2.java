package com.oopjava.utspbo;

import java.util.Scanner;

public class UTSPBO2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int positif = 0;
        int negatif = 0;
        int total = 0;
        int count = 0;

        System.out.println("Masukan bilangan integer, program akan berhenti jika memasukkan nilai 0:");

        while (true) {
            int angka = input.nextInt();

            if (angka == 0) {
                break;
            }

            if (angka > 0) {
                positif++;
            } else {
                negatif++;
            }

            total += angka;
            count++;
        }

        if (count == 0) {
            System.out.println("Tidak ada data yang dihitung.");
        } else {
            double rataRata = (double) total / count;
            System.out.println("Jumlah bilangan positif adalah " + positif);
            System.out.println("Jumlah bilangan negatif adalah " + negatif);
            System.out.println("Nilai total adalah " + (double) total);
            System.out.println("Nilai rata - rata " + rataRata);
        }
    }
}
