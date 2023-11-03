package ConvertNumberToReversedArrayOfDigits;
public class Main {
    public static void main(String[] args) {
        // Convert number to reversed array of digits
       // Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
        // 35231 => [1,3,2,5,3]
        //0 => [0]
         long numberToConvert = 35321;
         int[] reversedDigits = digitize(numberToConvert);
    }
    public static int[] digitize(long n){
            String number = Long.toString(n);
            int[] digits = new int[number.length()];
            for (int i = number.length()-1 ; i >= 0 ; i--){ // Vamos a recorrer el arreglo desde el final al inicio
                 char dgits = number.charAt(i); // almacenamos el valor en una variable de tipo char
                 int digit = Character.getNumericValue(dgits); // Convertimos el valor char a uno de tipo int
                 digits[number.length()-1-i] = digit;
            }
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        return digits;
    }
}
