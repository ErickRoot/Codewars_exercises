package DifferenceOf2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    /*The objective is to return all pairs of integers from a given array of integers that have a difference of 2.

The result array should be sorted in ascending order of values.

Assume there are no duplicate integers in the array. The order of the integers in the input array should not matter.*/
    public static void main(String[] args) {
        /*int[] arreglo = {1,2,56,4356,73,3,57,9,10,11,12};
        Arrays.sort(arreglo);
        System.out.println(Arrays.toString(arreglo));*/
        int [][] matriz = Kata.twosDifference(new int[]{1,4,2,3});
        for (int[] ints : matriz) { // Recorre cada fila
            for (int anInt : ints) { // Recorre cada columna de la fila
                System.out.print(anInt + " "); // Imprime el elemento seguido de un espacio
            }
            System.out.println(); // Nueva línea al final de cada fila
        }
    }

    public static class Kata {
        public static int[][] twosDifference(int[] array) {
            Arrays.sort(array); // se ordenan los arreglo de manera ascendente

            List<int[]> pairsList = new ArrayList<>(); // Se crea una lista que permita ir almacenando los datos que tienen diferencia de 2
            for (int i = 0 ; i < array.length-1 ; i++){ // recorro el arreglo asegurándome que no pase de su tamaño
                for (int j = i+1 ; j < array.length ; j++){ // se recorre pero una posicion adelante a la actual
                    if (array[j] - array[i] == 2){ // Comparamos si el sobrante es 2
                        pairsList.add(new int[]{array[i], array[j]}); // en caso de que si se almacena en la lista
                    }
                }
            }
            int[][] result = new int[pairsList.size()][2]; // se crea una matriz para almacenar los datos de la lista
            for (int i = 0; i < pairsList.size(); i++) { // recorremos la lista
                result[i] = pairsList.get(i); // en cada iteracion el elemento se va almacenando en una fila  la matriz resultante
            }


            return result;
        }
    }
}
