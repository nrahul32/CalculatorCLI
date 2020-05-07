package nrahul32.calculator;

public class Calculate {

    private double left_value;
    private double right_value;
    private double result;
    private Command opCode;
    
    public Calculate(double left_value, double right_value, Command opCode){
        this.left_value = left_value;
        this.right_value = right_value;
        this.opCode = opCode;
    }
    
    public void execute(){
        switch (opCode) {
            case Add:
                result = left_value + right_value;
                break;
            case Subtract:
                result = left_value - right_value;
                break;
            case Multiply:
                result = left_value * right_value;
                break;
            case Divide:
                // Ternary operator
                result = (right_value == 0 ? 0 : left_value / right_value);
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
        }
    }

    public double getResult() {
        return this.result;
    }
}
