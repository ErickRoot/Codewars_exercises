package SumOfPositive;
public class Main {
    public static void main(String[] args) {
        /*You get an array of numbers, return the sum of all of the positives ones.

        Example [1,-4,7,12] => 1 + 7 + 12 = 20

        Note: if there is nothing to sum, the sum is default to 0.*/
        int[] arreglo = {1,7,12, -5, 10 , -50};
        System.out.println(sum(arreglo));


    }

    public static int sum (int[] arr){
        int suma = 0;
        for (int j : arr) {
            if (j > 0) {
                suma += j;
            }
        }
        return suma;
    }
}
