package Summation;

public class Main {
    public static void main(String[] args) {
    /*
    Write a program that finds the summation of every number from 1 to num.
    The number will always be a positive integer greater than 0.
     */
    numeros(10);
    }
    public static int numeros(int num) {
        int suma = 0;
        for (int i = 1 ; i <= num ; i++){
            suma = i + suma;
        }

        System.out.println(suma);
        return suma;
    }
}
