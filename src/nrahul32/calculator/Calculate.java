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
        switch (opCode) {
            case Add:
                result = left_value + right_value;
                symbol = '+';
                break;
            case Subtract:
                result = left_value - right_value;
                symbol = '-';
                break;
            case Multiply:
                result = left_value * right_value;
                symbol = '*';
                break;
            case Divide:
                if(right_value == 0){
                    throw new IllegalArgumentException("Denominator cannot be 0 while performing Divide action");
                }
                result = left_value / right_value;
                symbol = '/';
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
        }
    }

    public double getResult(){
        return this.result;
    }

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
