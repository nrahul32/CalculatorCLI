package nrahul32.calculator;

public class Main {

    public static void main(String[] args) {

        // Creating 4 objects of calculate class to store data for computation
        Calculate[] list = new Calculate[4];
        list[0] = new Calculate(1.0d, 0.20d, Command.Divide);
        list[1] = new Calculate(10.0d, 2.0d, Command.Multiply);
        list[2] = new Calculate(100.0d, 20.0d, Command.Add);
        list[3] = new Calculate(500.0d, 100.0d, Command.Subtract);

        // Calculating the result for each of the data set
        for(int i = 0; i<list.length; i++){
            list[i].execute();
        }

        // Printing the results
        for(Calculate entry : list){
            entry.printResult();
        }

    }
}
