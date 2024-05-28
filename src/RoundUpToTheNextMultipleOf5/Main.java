package RoundUpToTheNextMultipleOf5;

public class Main {
    public static void main(String[] args) {
        int resultado = RoundToNextMultipleOf5.roundToNext5(14);
        System.out.println(resultado);
    }

    public static class RoundToNextMultipleOf5 {
        public static int roundToNext5(int number) {
            int sobrante = number % 5;
            System.out.println(sobrante);
            if (sobrante == 0 ){
                return number;
            }
            if (number < 0){
                return number - sobrante; // la operacion se ve asi -577088 - (-3)
            }
            return number + (5 - sobrante);
        }
    }
}
