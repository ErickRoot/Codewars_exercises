package TwiceAsOld;

public class Main {

    public static void main(String[] args) {
        TwiceAsOld(30, 7);
    }
    public static int TwiceAsOld(int dadYears , int sonYears){
        int dif = (dadYears-(sonYears*2) > 0 ) ? dadYears-(sonYears*2) : (dadYears-(sonYears*2))*-1;

        return dif;
    }
}
