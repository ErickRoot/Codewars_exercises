package RemoveExclamationMarks;
public class Main {
    public static void main(String[] args) {

    String respuesta = Solution.removeExclamationMarks("Hola! Mundo!");

        System.out.println(respuesta);
    }
     public static class Solution {
        static String removeExclamationMarks(String s){
            char simbol = '!';
            StringBuilder newWord = new StringBuilder();
            for (int i = 0 ; i < s.length() ; i++){
                char character = s.charAt(i);
                if (character != simbol){
                    newWord.append(character);
                }
            }
            return newWord.toString();
        }
     }
}
