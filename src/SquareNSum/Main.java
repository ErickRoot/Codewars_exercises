package SquareNSum;

public class Main {
    public static void main(String[] args) {
    int[] suma = new int[]{1,2,2};
    int sum = squareSum(suma);
        System.out.println(sum);
    }

    public static int squareSum(int [] n){
        int suma = 0;
        for (int j : n) {
            int num = j * j;
            suma += num;
        }
        return suma;
    }
}
