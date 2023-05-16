package Return_Negative;

public class Main {
    public static void main (String args[]){
    makeNegative(-42);
    }

    public static int makeNegative(final int x){

        int i = (x > 0) ? x * -1 : x;
        System.out.println(i);
        return i;
    }
}
