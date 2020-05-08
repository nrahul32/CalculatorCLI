package nrahul32.calculator;

public class Main {

    public static void main(String[] args) {

        // Getting inputs as readable strings in an array
        String[] inputs = {
                "Add 100d 20d",
                "Divide 1 0.2",
                "Multiply 10.0d 2d",
                "Subtract 500 100"
        };

        // Creating Calculate objects for each of the input string by parsing it
        Calculate[] expressions = new Calculate[inputs.length];

        int i = 0;
        for (String input : inputs){
            expressions[i++] = InputParser.parse(input);
        }

        // Performing the calculation on each entry and then printing the result
        for(Calculate expression : expressions){
            expression.execute();
            expression.printResult();
        }

    }
}
