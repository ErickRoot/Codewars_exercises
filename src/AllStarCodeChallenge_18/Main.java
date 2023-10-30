package AllStarCodeChallenge_18;

public class Main {
    public static void main(String[] args) {
        /*Cree una función que acepte una cadena y un único carácter, y devuelva un entero con el número de veces que
        el segundo argumento se encuentra en el primero.
        Si no se encuentra ninguna ocurrencia, se devolverá un recuento de 0.*/

        strCount("Hella", 'l');
    }
    public static int strCount (String str, char letter){
        int pos = 0;
        String d = Character.toString(letter); //convertimos el char en un String para despues compararlos
        // tengo que recorrer la cadena
        // verificar cuantas veces ese char se encuentra dentro del String
        // almacenar el int
        for (int i = 0 ; i < str.length() ; i++){
            char b = str.charAt(i);
            String b1 = Character.toString(b);
            if (d.equals(b1)){
                pos++;
            }
        }
        System.out.println(pos);

        return pos;
    }
}
