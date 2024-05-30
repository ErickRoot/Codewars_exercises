package StringEndsWith;

public class Main {
    public static void main(String[] args) {
        /*Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string). */
    boolean valor = Kata.solution("samurai","ra");
        System.out.println(valor);
    }

    public class Kata {
        public static boolean solution (String str, String ending){
            int p1 = str.lastIndexOf(ending);
            return p1 >= 1;
        }
    }
}
