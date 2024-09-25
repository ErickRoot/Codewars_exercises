package Data_Reverse;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        // 11111111  00000000  00001111  10101010
        // (byte1)   (byte2)   (byte3)   (byte4)
        // should become:
        // 10101010  00001111  00000000  11111111
        // (byte4)   (byte3)   (byte2)   (byte1)
        DataReverse(new int[]{0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0});
        //                    1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1

    }

    public static int[] DataReverse(int[] data){
        System.out.println(data.length);
        int nuevo[] = new int[data.length];
        int numero = 0;
        int valor = data.length / 8 - 1;
        int multi = valor * 8;
        for (int i = multi ; i <= data.length ; i++){
            numero = data[i] -1;
            valor -= 1;
        }
        for (int j = 0 ; j < multi ; j++){
            nuevo[j] = numero;
        }

        return nuevo;
    }
}
