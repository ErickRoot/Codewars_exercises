package GravityFlip;

import javax.crypto.spec.PSource;
import java.sql.SQLOutput;

public class Main {
    /*There are some columns of toy cubes in the box arranged in a line. The i-th column contains a_i cubes.
    At first, the gravity in the box is pulling the cubes downwards. When Bob switches the gravity, it begins to pull all the cubes to a certain side of the box,
    d, which can be either 'L' or 'R' (left or right). Below is an example of what a box of cubes might look like before and after switching gravity.

    Examples (input -> output)
    * 'R', [3, 2, 1, 2]      ->  [1, 2, 2, 3]
    * 'L', [1, 4, 5, 3, 5 ]  ->  [5, 5, 4, 3, 1]
    */
    public static void main(String[] args) {
    flip('R', new int[]{1, 4, 5, 3, 5});
    }
    public static int[] flip(char dir, int[] arr) {
        String letra = String.valueOf(dir);
        if (letra.equals("L")) {
            for (int i = 0 ; i < arr.length ; i++){ // iterea sobre cada elemento del arreglo sin pasar su tamaño
                for (int j = arr.length - 1 ; j > i ; j--){ // itera en el arreglo desde la ultima posicion pero sin sobre pasar su tamaño
                    if (arr[j] > arr[j-1]){ // la condicion verifica si el valor de la ultima posicion es mayor que la penultima
                        int valor1 = arr[j]; // si es mayor que la penultima, se almacena en la variable para despues
                        arr[j] = arr[j-1]; // intercambiar el lugar de la ultima con la de la penultima y despues
                        arr[j-1] = valor1; // cambiar el valor de la penultima por el que donde esta posicionado arr[j]    ILBQ7Q7E9Nd
                    }

                }
            }
            for (int i = 0 ; i < arr.length ; i++){
                System.out.print(arr[i]+" ");
            }
        }
        else if (letra.equals("R")){
            for (int i = 0 ; i < arr.length ; i++){
                for (int j = arr.length - 1 ; j > i ; j--){
                    if (arr[j] < arr[j-1]){
                        int valor1 = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = valor1;
                    }

                }
            }
            for (int i = 0 ; i < arr.length ;  i++){
                System.out.print(arr[i]+" ");
            }
        }
        return arr;
    }
}
