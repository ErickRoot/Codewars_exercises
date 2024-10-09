package Number_of_People_in_the_Bus;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*You are provided with a list (or array) of integer pairs. Elements of each pair represent the number of people that get on the bus
        (the first item) and the number of people that get off the bus (the second item) at a bus stop*/
        ArrayList<int[]> stops = new ArrayList<>();
        stops.add(new int[]{10, 0});
        stops.add(new int[]{3, 5});
        stops.add(new int[]{2, 8});
        int total = Metro.countPassengers(stops);
        System.out.println(total);
    }
    class Metro {
        public static int countPassengers(ArrayList<int[]> stops){
            int pasajerosArriba = 0;
            int pasajerosBajaron = 0;
            for (int i = 0 ; i < stops.size() ; i++){
                int[] primer = stops.get(i);
                pasajerosArriba += primer[0];
                pasajerosBajaron += primer[1];
            }
            int pasajeros = pasajerosArriba - pasajerosBajaron;
            return pasajeros;
        }
    }
}
