package CommonDenominators;

public class Main {
    /*We need to find the least common denominator and return the fractions with the same denominator
     * convertFracs [(1, 2), (1, 3), (1, 4)] `shouldBe` [(6, 12), (4, 12), (3, 12)]*/
    public static void main(String[] args) {

        long[][] fraccion = {{1, 2}, {1, 3}, {10, 40}};
        String resultado = Fract.convertFracs(fraccion);
        System.out.println(resultado);
        /*long[][] fraccion = {{1, 2}, {1, 3}, {1, 4}};
        int multi = 1;
        for (int i = 0; i < fraccion.length; i++) {
            int denominador = (int) fraccion[i][1];
            multi *= denominador;
        }
        multi /=2;
        for (int j = 0 ; j < fraccion.length ; j++){
            int numerador = (int) fraccion[j][0];
            int denominador = (int) fraccion[j][1];
            numerador = (multi / denominador)* numerador;
            denominador = multi;
            System.out.println(numerador+""+","+denominador);
        }*/


    }

    public class Fract {
        public static String convertFracs(long[][] fractions) {
            long multi = 1;
            for (int i = 0; i < fractions.length; i++) {
                long denominador = fractions[i][1];
                multi = lcm(multi, denominador);
            }

            StringBuilder resultado = new StringBuilder();

            for (int j = 0; j < fractions.length; j++) {
                long numerador = fractions[j][0];
                long denominador = fractions[j][1];

                numerador = (multi / denominador) * numerador;
                denominador = multi;

                resultado.append("(").append(numerador).append(",").append(denominador).append(")");

                if (j<fractions.length-1){
                    resultado.append(" ");
                }
            }
            return resultado.toString();
        }

        private static long lcm(long a, long b) {
            return (a * b) / gcd(a, b);
        }

        // Método para calcular el MCD
        private static long gcd(long a, long b) {
            while (b != 0) {
                long temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }
}