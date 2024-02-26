package Get_the_Middle_Character;

public class Main {
    public static void main(String[] args) {
        // You are going to be given a word. Your job is to return the middle character of the word.
        // If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.
        getMiddle("A");
    }
        public static String getMiddle (String word){

            if (word.length()%2 == 1){
                int medio = word.length()/2;
                return String.valueOf(word.charAt(medio)); // con valueOf nos permite convertir el dato que se le asigna en una cadena de un tipo de dato determinado
            }
            else {
               int medio = word.length()/2-1;
               return word.substring(medio, medio+2);// con substring podemos generar una cadena de unas sub cadenas que en este caso sera los char, pero se le tiene que informar del final
            }

        }
}
