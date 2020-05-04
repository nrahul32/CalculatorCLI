package nrahul32.calculator;

public class Calculate {

    private double left_value;
    private double right_value;
    private double result;
    private char opCode;
    
    public Calculate(double left_value, double right_value, char opCode){
        this.left_value = left_value;
        this.right_value = right_value;
        this.opCode = opCode;
    }
    
    public void execute(){
        switch (opCode) {
            case 'a':
                result = left_value + right_value;
                break;
            case 's':
                result = left_value - right_value;
                break;
            case 'm':
                result = left_value * right_value;
                break;
            case 'd':
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
