package com.oopjava.utspbo;

import java.util.Scanner;

public class UTSPBO3 {

    public static int sumDigits(long n) {
        int total = 0;

        while (n != 0) {
            total += n % 10; 
            n = n / 10;       
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        long angka = input.nextLong();

        int hasil = sumDigits(angka);
        System.out.println("Jumlah semua digitnya adalah: " + hasil);
    }
}

