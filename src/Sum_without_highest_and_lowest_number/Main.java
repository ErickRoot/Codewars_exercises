package Sum_without_highest_and_lowest_number;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).
        The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.*/
        int[] numeros = {1, 2, 1, 3, 10, 10};
        System.out.println(Kata.sum(numeros));

    }

    public class Kata {

        public static int sum(int[] numbers) {
            if (numbers == null || numbers.length < 1) {
                return 0;
            }
            for (int numero : numbers) {
                if (numero == 0) {
                    return 0;
                }
            }
            Integer[] numeros = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
            Arrays.sort(numeros);
            int menor = numeros[0];
            int mayor = numeros[numeros.length-1];
            int suma = 0;
            for (int i = 1; i < numeros.length - 1; i++) {
                if (menor != numeros[i] && mayor != numeros[i])
                suma += numeros[i];
            }
            return suma;
        }
    }
}
