package Basics08_FindNextHigerNumberWithSameBit;

public class Main {
    public static void main(String[] args) {

        System.out.println(nextHigher(128));

    }

    public static int nextHigher(int n) {
        String numBin = Integer.toBinaryString(n); // convertimos el numero decimal en binario
        int cuenCeros1 = numBin.replace("0","").length(); // ya se cuantos 1s tiene el numero ingresado
        int cuenCeros2 = n + 1 ;
        while (Integer.bitCount(cuenCeros2) != cuenCeros1){
            cuenCeros2++;
        }
        return cuenCeros2;
    }
}

/*public static int siguienteNumeroConMismaCantidadDeUnos(int n) {
    int c = n;
    int c0 = 0;
    int c1 = 0;

    // Contar ceros a la derecha del primer uno
    if (n == 0) {
        return -1; // No hay número mayor con la misma cantidad de 1s
    }

    // Contar ceros y unos a la derecha del primer bit cero que se encuentra
    while ((c & 1) == 0 && c != 0) {
        c0++;
        c >>= 1;
    }
    while ((c & 1) == 1) {
        c1++;
        c >>= 1;
    }

    // Verificar si el número es el mayor con sus bits de la misma longitud
    if (c0 + c1 == 31 || c0 + c1 == 0) {
        return -1; // No hay número mayor con la misma cantidad de 1s
    }

    // Posición del bit a cambiar
    int p = c0 + c1;

    // Cambiar el bit p
    n |= (1 << p);

    // Limpiar todos los bits a la derecha de p
    n &= ~((1 << p) - 1);

    // Colocar los bits 1s más a la derecha
    n |= (1 << (c1 - 1)) - 1;

    return n;
}

public static void main(String[] args) {
    int numero = 128; // Cambia este valor para probar con diferentes números
    int resultado = siguienteNumeroConMismaCantidadDeUnos(numero);

    System.out.println("El siguiente número con la misma cantidad de 1s es: " + resultado);
}
*/
