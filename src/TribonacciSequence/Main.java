package TribonacciSequence;

public class Main {
    public static void main(String[] args) {
        double[] arreglo = new double[]{1,1,1};
        int n = 10;
        double[] resultado = new kata().tribonacci(arreglo, n);

        for (double numero : resultado){
            System.out.print(numero+" ");
        }
    }

    public static class kata {
        public double[] tribonacci(double[] s, int n) {
            double[] arre = new double[n];
            if (n < 3) {
                double[] result = new double[n];
                for (int i = 0; i < n; i++) {
                    result[i] = s[i];
                }
                return result;
            }
            if (n != 0) {
                for (int i = 0; i < s.length; i++) {
                    arre[i] = s[i];
                }
                for (int j = 3; j < n; j++) { // [1,1,1] ->
                    arre[j] = arre[j-1] + arre[j-2] + arre[j-3]; // [1,1,1,3] ->
                }
            }else {
                return new double[0];
            }
            return arre;
        }
    }
}
