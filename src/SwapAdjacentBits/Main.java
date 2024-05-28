package SwapAdjacentBits;

public class Main {
    public static void main(String[] args) {
       int resultado = kata.swapAdjacentBits(13);
        System.out.println(resultado);
    }

    public static class kata {
        public static int swapAdjacentBits(int n) {
            String binary = Integer.toBinaryString(n); // convierto el numero en un binario almacenado en una cadena
            if (binary.length()%2 != 0){ // verificamos que el binario sea par
                binary = "0" + binary; // si no es par se agrega un cero
            }
            char[] caracteres = binary.toCharArray(); // convertimos el string en un array de char
            for (int i = 0 ; i < caracteres.length - 1 ; i+=2){ // recorremos el arreglo pero indicando el -1 para que no se pase de su tamño  y lo incrementamos en 2 que salte con el digito adyacente
                char caracter = caracteres[i]; // cremos una variable que almacena el valor de la posicion de i
                caracteres[i]= caracteres[i+1]; // intercambiamos el caracter de la posicion acutal por la que le sigue
                caracteres[i+1] = caracter; // en la posicion que le sigue almacenamos el caracter en que se encuentra la posicion actual.
            }

            String nuevo = new String(caracteres); // convertimos el array de chars en una cadena

            // System.out.println(binary); // imprimimos el binario original
            // System.out.println(nuevoNumero); // imprimimos el binario que se genero


            return Integer.parseInt(nuevo, 2);
        }
    }
}
