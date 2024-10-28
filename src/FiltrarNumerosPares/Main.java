package FiltrarNumerosPares;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Dada una lista de enteros, utiliza una expresión lambda para imprimir solo los números pares de la misma
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> num = numbers.stream().filter(a -> a%2==0).collect(Collectors.toList());
        System.out.println(num);

        // Transformar nombres a mayusculas
        List<String> names = Arrays.asList("Ana", "Carlos", "Luis", "María");
        List<String> nombres = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(nombres);

        // Calcular la suma de una lista
        List<Integer> numbers1 = Arrays.asList(10, 20, 30, 40);
        int suma = numbers1.stream().reduce(0, Integer::sum);
        System.out.println(suma);

        // Ordenar la lista de Cadenas por longitud
        List<String> words = Arrays.asList("Java", "Lambda", "Stream", "API");
        List<String> palabras = words.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        System.out.println(palabras);

        // Filtrar y Contar Palabras que Empiezan con una Letra
        List<String> words1 = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot");
        // Dada una lista de palabras, utiliza una expresión lambda para filtrar las palabras que empiezan con la letra "A" y contar cuántas cumplen con esta condición.
        long palabras1 = words1.stream().filter(w -> w.startsWith("A")).count();
        System.out.println(palabras1);


    }
}
