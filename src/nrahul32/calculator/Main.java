package nrahul32.calculator;

public class Main {

    public static void main(String[] args){

        // Getting inputs as readable strings in an array
        String[] inputs = {
                "Add 100d 20d",
                "Divide 1 0.2",
                "Multiply 10.0d 2d",
                "Subtract 500 100"
        };

        System.out.println("The inputs given are:");
        for(String input : inputs){
            System.out.println(input);
        }

        System.out.println("\nComputing...");
        // Creating Calculate objects for each of the input string by parsing it
        Calculate[] expressions = new Calculate[inputs.length];

        int i = 0;
        for (String input : inputs){
            try{
                expressions[i++] = InputParser.parse(input);
            } catch (InvalidCommand e){
                System.out.println(e.getMessage());
                if(e.getCause() != null){
                    System.out.println(e.getCause().getMessage());
                }
            }
        }

        // Performing the calculation on each entry and then printing the result
        System.out.println("\nResults:");
        for(Calculate expression : expressions){
            try{
                expression.execute();
                expression.printResult();
            }catch (NullPointerException e){
                System.out.println("The entry was invalid, so skipping it's result");
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

        }

    }
}
