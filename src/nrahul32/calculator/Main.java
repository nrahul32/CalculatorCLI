package nrahul32.calculator;

public class Main {

    public static void main(String[] args) {

        // Initializing the numbers and operator using parallel arrays
        double[] left_values = {1.0d, 10.0d, 100.0d, 500.0d};
        double[] right_values = {0.20d, 2.0d, 20.0d, 100.0d};
        double[] results = new double[4];
        char[] opCodes = {'d', 'm', 'a', 's'};

        // Calculating
        for(int i = 0; i<opCodes.length; i++){
            switch (opCodes[i]) {
                case 'a':
                    results[i] = left_values[i] + right_values[i];
                    break;
                case 's':
                    results[i] = left_values[i] - right_values[i];
                    break;
                case 'm':
                    results[i] = left_values[i] * right_values[i];
                    break;
                case 'd':
                    // Ternary operator
                    results[i] = (right_values[i] == 0 ? 0 : left_values[i] / right_values[i]);
                    break;
                default:
                    System.out.println("Invalid opCode: " + opCodes[i]);
                    results[i] = 0.0d;
                }
            }

        // Printing the results
        for(double result : results){
            System.out.println(result);
        }

    }
}
