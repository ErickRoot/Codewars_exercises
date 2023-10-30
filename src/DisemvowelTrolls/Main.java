package DisemvowelTrolls;
public class Main {
    public static void main(String[] args) {
        /* Your task is to write a function that takes a string and return a new string with all vowels removed.
        For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
        Note: for this kata y isn't considered a vowel.*/

        // Recorrer el String para verificar donde estan las vocales
        //
        disemvowel("What are you, a communist?");

    }
    public static String disemvowel(String str){
        String vocals = "aeiouAEIOU";
        StringBuilder c1 = new StringBuilder();
        for (int i = 0 ; i < str.length() ; i++){ // recorriendo el string ingresado
            char c = str.charAt(i); // almacenar el caracter
            if (vocals.indexOf(c) == -1){ // indexOf determina la posicion de una subcadena y en este caso verifica si la letra almacenada en c esta en el string vocales,
                                            // si es que no esta entonces lo que hace es agregarla a la cadena c1
                c1.append(c); // En caso de que la comprobacion sea true se agrega (en caso de que la letra verificada no sea una vocal
            }                 // si es una vocal es false y no lo agrega.
        }
        return c1.toString();
    }
}
