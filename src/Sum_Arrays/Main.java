package Sum_Arrays;

public class Main {

    public static void main (String args[]){
      sum (new double[]{-2.398});
    }
    /*
    Write a function that takes an array of numbers and returns the sum of the numbers. The numbers can be negative or non-integer.
    If the array does not contain any numbers then you should return 0.
     */
    public static double sum(double[] numbers){
        double suma = 0;
        for(int i = 0 ; i < numbers.length ; i++){
            double val1 = numbers[i];
            suma = val1 + suma;
        }
        System.out.println(suma);
        return suma;
    }
}
