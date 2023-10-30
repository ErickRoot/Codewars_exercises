package Welcome_to_the_City;

public class Main {
    public static void main(String[] args) {
        String name[] = {"Erick", "Flores"};
        sayHello (name, "mexico", "estado");

    }


    public static String sayHello(String[] name, String city, String state){
        StringBuilder ca = new StringBuilder();
        String datArray1 = "";
        for (String datArray : name){
            datArray1 += datArray+" ";
        }
        if (datArray1.endsWith(" ")) {
            datArray1 = datArray1.substring(0, datArray1.length() - 1);
        }
        ca.append("Hello, ").append(datArray1).append("! ").append("Welcome to ").append(city ).append(", ").append(state).append("!");
        String mensaje = ca.toString();
        System.out.println(mensaje);
        return mensaje;
    }
}
