package com.oopjava.utspbo;

public class UTSPBO4main {
    public static void main(String[] args) {
        UTSPBO4 limas1 = new UTSPBO4();
        System.out.println("Limas segi empat dengan luas alas : " + limas1.getLuasAlas() +
                ", luas selubung limas : " + limas1.getLuasSelubung() +
                " dan tinggi : " + limas1.getTinggi() +
                ". Luasnya : " + String.format("%.2f", limas1.getLuas()) +
                ", sedangkan volumenya : " + String.format("%.1f", limas1.getVolume()));

        UTSPBO4 limas2 = new UTSPBO4(30.0, 40.0, 50.0);
        System.out.println("Limas segi empat dengan luas alas : " + limas2.getLuasAlas() +
                ", luas selubung limas : " + limas2.getLuasSelubung() +
                " dan tinggi : " + limas2.getTinggi() +
                ". Luasnya : " + String.format("%.2f", limas2.getLuas()) +
                ", sedangkan volumenya : " + String.format("%.1f", limas2.getVolume()));

        UTSPBO4 limas3 = new UTSPBO4(25.0, 35.0, 45.0);
        System.out.println("Limas segi empat dengan luas alas : " + limas3.getLuasAlas() +
                ", luas selubung limas : " + limas3.getLuasSelubung() +
                " dan tinggi : " + limas3.getTinggi() +
                ". Luasnya : " + String.format("%.2f", limas3.getLuas()) +
                ", sedangkan volumenya : " + String.format("%.1f", limas3.getVolume()));
    }
}
