package CommonDenominators;

import java.util.HashSet;

public class Main {
    /*We need to find the least common denominator and return the fractions with the same denominator
     * convertFracs [(1, 2), (1, 3), (1, 4)] `shouldBe` [(6, 12), (4, 12), (3, 12)]*/
    public static void main(String[] args) {
        long[][] myMatrix = {{1, 2}, {1, 3}, {1, 4}};
        String[][] converted = Fract.convertFracs(myMatrix);
        for (String[] strings : converted) {
            System.out.println(strings[0] + "/" + strings[1]);
        }

    }

    public class Fract {

        public static String[][] convertFracs(long[][] fractions) {
            int lcm = calculateLCM(fractions); // Find LCM of denominators

            String[][] convertedFractions = new String[fractions.length][2]; // Allocate space for converted fractions
            for (int i = 0; i < fractions.length; i++) {
                long numerator = fractions[i][0];
                long denominator = fractions[i][1];
                long multiplier = lcm / denominator; // Calculate multiplier for current fraction
                convertedFractions[i][0] = String.valueOf(numerator * multiplier); // New numerator with LCM denominator
                convertedFractions[i][1] = String.valueOf(lcm); // Set common denominator for all fractions
            }
            return convertedFractions;
        }

        private static int calculateLCM(long[][] fractions) {
            HashSet<Long> uniquePrimeFactors = new HashSet<>();
            for (long[] fraction : fractions) {
                // Find prime factors of the denominator
                long temp = fraction[1];
                for (long i = 2; i * i <= temp; i++) {
                    while (temp % i == 0) {
                        uniquePrimeFactors.add(i);
                        temp /= i;
                    }
                }
                if (temp > 1) {
                    uniquePrimeFactors.add(temp);
                }
            }

            int lcm = 1;
            for (long primeFactor : uniquePrimeFactors) {
                int maxPower = 0;
                for (long[] fraction : fractions) {
                    long denominator = fraction[1];
                    int power = 0;
                    long temp = denominator;
                    while (temp % primeFactor == 0) {
                        power++;
                        temp /= primeFactor;
                    }
                    maxPower = Math.max(maxPower, power);
                }
                lcm *= (int) Math.pow(primeFactor, maxPower);
            }
            return lcm;
        }


    }
}