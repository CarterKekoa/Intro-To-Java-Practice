package com.jetbrains;

public class Quintiles {

    public static void main(String[] args) {
        double test = (double)(Math.random() * 1);
        double quintile1 = 1 / 5;
        double quintile2 = 2 / 5;
        double quintile3 = 3 / 5;
        double quintile4 = 4 / 5;
        double quintile5 = 1;

        if (test <= quintile1)
            System.out.println("Your random value, " + test + ", is in quintile 1");
        else if (test <= quintile2)
            System.out.println("Your random value, " + test + ", is in quintile 2");
        else if (test <= quintile3)
            System.out.println("Your random value, " + test + ", is in quintile 3");
        else if (test <= quintile4)
            System.out.println("Your random value, " + test + ", is in quintile 4");
        else if (test <= quintile5)
            System.out.println("Your random value, " + test + ", is in quintile 5");
        else
            System.out.println("There was an error with your value");
    }
}

