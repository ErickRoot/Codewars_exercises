package SumOfMultiples;

public class Main {
    /* Your Job
    Find the sum of all multiples of n below m
    Keep in Mind
    n and m are natural numbers (positive integers)
    m is excluded from the multiples
    Kata.sumMul(2, 9)   ==> 2 + 4 + 6 + 8 = 20
    Kata.sumMul(3, 13)  ==> 3 + 6 + 9 + 12 = 30
    Kata.sumMul(4, 123) ==> 4 + 8 + 12 + ... = 1860
    Kata.sumMul(4, -7)  // throws IllegalArgumentException
     */
    /**
     * Calcula la suma de los múltiplos de n que son menores que m.
     *
     * @param "n" El número cuyos múltiplos se sumarán.
     * @param "m" El valor límite hasta el cual se sumarán los múltiplos.
     * @return La suma de los múltiplos de n menores que m.
     * @throws IllegalArgumentException Si n o m son valores no aceptados (menores o iguales a cero).
     */
    public static void main(String[] args) {
        sumMul(-4, 0);
    }

    public static int sumMul(int n, int m) {
        int suma = 0, sum = 0;
        if (n <=0 || m <= 0){
            throw new IllegalArgumentException("Valor no aceptado");
        }
        for (int i = 1; suma < m; i++) {
            sum = suma + sum;
            suma = i * n;
        }
        System.out.println(sum);
        return suma;
    }
}
