package LogicalOperator;

public class Main {
    public static void main(String[] args) {
    xor(false, true);
    }

    public static boolean xor(boolean a, boolean b) {
        if (a!=b){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        return false;
    }
    // la respuesta al problema era solo poner en el retur a!=b
}
