package Test1_2_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    /*Write a function which takes a list of strings and returns each line prepended by the correct number.
        The numbering starts at 1. The format is n: string. Notice the colon and space in between.
        ["a", "b", "c"] --> ["1: a", "2: b", "3: c"]*/
        List<String> lines = new ArrayList<>();
        lines.add("a");
        lines.add("b");
        lines.add("c");
        List<String> nuevaLista = LineNumbering.number(lines);
        for (String line : nuevaLista){
            System.out.print(line);
        }
    }

    public class LineNumbering {
        public static List<String> number(List<String> lines) {
            List<String> resultado = new ArrayList<>();
            for (int i = 0 ; i < lines.size() ; i++){
                resultado.add((i+1) + ": " + lines.get(i)+" ");
            }
            return resultado;
        }
    }
}
