package caseBase;

public class MonteCarloSimulation {
    public static void main(String[] args) {

        final int TRIALS = 1000000;
        int countOddRegions = 0;

        for (int i = 0; i < TRIALS; i++) {

            double x = Math.random() * 2 - 1;
            double y = Math.random() * 2 - 1;

            // Region 1
            if (x < 0 && y < 0) {
                countOddRegions++;
            }

            // Region 3: top-right above diagonal
            else if (x > 0 && y > 0 && y > -x + 1) {
                countOddRegions++;
            }
        }

        double probability = (double) countOddRegions / TRIALS;

        System.out.println("Probability of falling into an odd-numbered region: " + probability);
    }
}
