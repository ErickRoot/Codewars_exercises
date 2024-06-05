package CountByX;

public class Main {
    public static void main(String[] args) {
        /*Create a function with two arguments that will return an array of the first n multiples of x.

Assume both the given number and the number of times to count will be positive numbers greater than 0.

Return the results as an array or list ( depending on language ).*/
        Kata.countBy(2,10);

    }

    public class Kata {
        public static int[] countBy (int x , int n){
            int[] resultado = new int[n];
            for (int i = 0 ; i < n ; i++){
                resultado[i] = x * (i + 1);
                System.out.print(resultado[i]);
            }
            return resultado;
        }
    }

}
