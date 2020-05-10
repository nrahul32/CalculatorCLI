package nrahul32.calculator;

public class Calculate {

    private double left_value;
    private double right_value;
    private double result;
    private Command opCode;
    private char symbol;
    private char space = ' ';
    
    public Calculate(double left_value, double right_value, Command opCode){
        this.left_value = left_value;
        this.right_value = right_value;
        this.opCode = opCode;
    }
    
    public void execute(){
        CalculateBase c = null;
        switch (opCode) {
            case Add:
                c = new Adder(left_value, right_value);
                symbol = '+';
                break;
            case Subtract:
                c = new Subtractor(left_value, right_value);
                symbol = '-';
                break;
            case Multiply:
                c = new Multiplier(left_value, right_value);
                symbol = '*';
                break;
            case Divide:
                c = new Divider(left_value, right_value);
                symbol = '/';
                break;
            default:
                System.out.println("This will never execute as opCode cannot have any other values");
        }
        result = c.execute();
    }

    public double getResult(){
        return this.result;
    }

    /**
     * This prints the result in the form:
     * 1.0 / 0.2 = 5.0
     * 10.0 * 2.0 = 20.0
     */
    public void printResult(){
        StringBuilder sb = new StringBuilder(20);
        sb.append(left_value)
            .append(space)
            .append(symbol)
            .append(space)
            .append(right_value)
            .append(space)
            .append('=')
            .append(space)
            .append(result);
        System.out.println(sb);
    }
}
