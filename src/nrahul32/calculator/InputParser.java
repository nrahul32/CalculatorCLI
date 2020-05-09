package nrahul32.calculator;

public class InputParser {

    public static Calculate parse(String input) throws InvalidCommand {

        Double left_value;
        Double right_value;

        String[] inputs = input.split(" ");

        if(inputs.length != 3){
            throw new InvalidCommand("The number of arguments must be 3", input);
        }

        try{
            left_value = Double.valueOf(inputs[1]);
            right_value = Double.valueOf(inputs[2]);
        } catch (Exception e){
            throw new InvalidCommand("One of the values is non-numeric", input, e);
        }

        Command c = setCommandFromString(inputs[0]);

        return new Calculate(left_value, right_value, c);
    }

    private static Command setCommandFromString(String input) throws InvalidCommand {
        Command c = null;

        if(input.equalsIgnoreCase(Command.Add.toString())){
            c = Command.Add;
        } else if(input.equalsIgnoreCase(Command.Subtract.toString())){
            c = Command.Subtract;
        } else if(input.equalsIgnoreCase(Command.Multiply.toString())){
            c = Command.Multiply;
        } else if (input.equalsIgnoreCase(Command.Divide.toString())) {
            c = Command.Divide;
        };

        if(c == null){
            throw new InvalidCommand("The command entered is not supported", input);
        }
        return c;
    }
}
