package EvenOrOdd;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main (String args[]){

        even_or_odd(-1);
    }

    public static String even_or_odd(int number){

        if (number % 2 == 0){
            System.out.println("Even");
            return "Even";
        }else
        {
            System.out.println("Odd");
            return "Odd";
        }

    }

}
