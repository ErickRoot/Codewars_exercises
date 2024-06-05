package StringEndsWith;
public class Main {
    public static void main(String[] args) {
        /*Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string). */
    boolean valor = Kata.solution("samurai","ai");
        System.out.println(valor);
    }

    public class Kata {
        public static boolean solution (String str, String ending){
            // Se puede simplicficar con el metodo .endsWith de la calase String
            int cadena1 = str.length(), cadena2 = ending.length(), resta = cadena1 - cadena2;
            String subcadena = str.substring(resta);
            return subcadena.equals(ending);
        }
    }
}
