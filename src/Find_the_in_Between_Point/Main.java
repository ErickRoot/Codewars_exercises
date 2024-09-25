package Find_the_in_Between_Point;

public class Main {
    public static void main(String[] args) {

    }
    public static int middle_point(double x1, double y1, double z1,
                                   double x2, double y2, double z2,
                                   double x3, double y3, double z3){
        double dif12 = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2) + Math.pow(z2-z1,2));
        double dif23 = Math.sqrt(Math.pow(x3-x2,2) + Math.pow(y3-y2,2) + Math.pow(z3-z2,2));
        double dif13 = Math.sqrt(Math.pow(x3-x1,2) + Math.pow(y3-y1,2) + Math.pow(z3-z1,2));

        if (Math.abs(dif12 + dif13 - dif23)<0.0000001){
            return 1;
        }else if (Math.abs(dif12 + dif23 - dif13)<0.0000001){
            return 2;
        }else {
            return 3;
        }

    }
}
