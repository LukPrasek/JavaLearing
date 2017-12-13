package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MarkAverage {

    static Double[][] tab = new Double[3][4];// wielkosc tablicy a nie indeks, najpierw ilosc wierszy(od 0 do 2) i
    // kolumn

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("dlugosc: " + tab.length + tab[2].length);
        Scanner scanner = new Scanner(System.in);
        int i;
        int j;
        double a;
        double sum = 0;
        int quantity = 0;
        for (i = 0; i < tab.length; i++) {
            System.out.println("Podaj oceny dla przedmiotu nr: " + (i + 1));
            for (j = 0; j < tab[i].length; j++) {
                a = scanner.nextDouble();
                tab[i][j] = a;
                sum +=a;
                quantity++;
            }
        }
        System.out.println("Suma: " +  sum );
        System.out.println("Average: " + (double) (sum / quantity));
    }
}