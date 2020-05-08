package nrahul32.calculator;

public class InputParser {

    public static Calculate parse(String input) {
        String[] inputs = input.split(" ");
        Double left_value = Double.valueOf(inputs[1]);
        Double right_value = Double.valueOf(inputs[2]);
        Command c = Command.Add; // Currently default c = Add

        if(inputs[0].equalsIgnoreCase(Command.Add.toString())){
            c = Command.Add;
        } else if(inputs[0].equalsIgnoreCase(Command.Subtract.toString())){
            c = Command.Subtract;
        } else if(inputs[0].equalsIgnoreCase(Command.Multiply.toString())){
            c = Command.Multiply;
        } else if (inputs[0].equalsIgnoreCase(Command.Divide.toString())) {
            c = Command.Divide;
        };

        return new Calculate(left_value, right_value, c);
    }
}
