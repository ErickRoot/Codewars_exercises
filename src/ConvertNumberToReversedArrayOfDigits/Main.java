package ConvertNumberToReversedArrayOfDigits;
public class Main {
    public static void main(String[] args) {
        // Convert number to reversed array of digits
       // Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
        // 35231 => [1,3,2,5,3]
        //0 => [0]
        int[] arreglo = new int[] {10, 11, 12, 13, 14}; // Ingreso de que tamaño es el arreglo

        for (int i = 0 ; i < arreglo.length ; i ++){
            System.out.print(arreglo[i]);
        }
        System.out.print(" => ");
        for (int j = 4 ; j >= 0 ; j--){
            System.out.print(arreglo[j]);
        }
    }
}
