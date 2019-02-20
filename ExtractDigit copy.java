package com.jetbrains;

public class ExtractDigit{

    public static void main(String[] args) {

        int n = 5814;
        int store;

        store = n / 1000;
        System.out.print("The digits of n are " + store + ", ");
        n = n % 1000;
        store = n / 100;
        System.out.print(store + ", ");
        n = n % 100;
        store = n / 10;
        System.out.print(store + ", ");
        n = n % 10;
        store = n;
        System.out.print("and " + store);


    }
}