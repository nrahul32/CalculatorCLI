package nrahul32.calculator;

public class Adder extends CalculateBase {

    public Adder(double left_value, double right_value){
        super(left_value, right_value);
    }

    @Override
    public double execute() {
        result = left_value + right_value;
        return result;
    }

}
