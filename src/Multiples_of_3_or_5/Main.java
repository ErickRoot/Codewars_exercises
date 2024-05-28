package Multiples_of_3_or_5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
          Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
          Note: If the number is a multiple of both 3 and 5, only count it once.*/
        solution(23);
    }

    public static int solution(int number) {
        ArrayList<Integer> numeros = new ArrayList<>(); // Es mejor utilizar un arraylist debido a que no se conoce el tamaño que tendra
        for (int i = 1; i < number; i++) {// se recorre el numero
            if (i % 3 == 0 || i % 5 == 0) { // Se hace comprobacion de si es multiplo de 3 o 5
                numeros.add(i); // si es multiplo se agrega al arraylist
            }
        }
        int suma = 0; // variable donde se agregara la suma de los numeros
        for (int sumaNumeros : numeros){ // se recorre el arraylist con un "for each" y cada uno de los valores se almacenara en la variable sumaNumeros
            suma+= sumaNumeros; // el valor actual se suma al valor almacenado en la variable "suma"
        }
        System.out.println(suma);
        return suma;
    }
}