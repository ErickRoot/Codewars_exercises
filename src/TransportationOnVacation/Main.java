package TransportationOnVacation;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

    rentalCarCost(9);
    }
    public static int rentalCarCost(int d) { // Metodo
        /*Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total. Alternatively, if you rent the car for 3 or more days, you get $20 off your total.
            Write a code that gives out the total amount for different days(d).*/
        // Your solution here
        return d * 40 - (d > 6 ? 50 : d > 2 ? 20 : 0 ); // SE UTILIZA EL OPERADOR TERNARIO PARA INDICAR LAS CONDICIONES DE LA SUMA.
        // NO ES NECESARIO QUE YO MUESTRE EN CONSOLA TODAS LAS RESPUESTAS DEL SAMPLE TEST, MAS BIEN ESAS SON LAS PRUEBAS QUE TIENE QUE
        // PASAR MI CODIGO.

    }
}
