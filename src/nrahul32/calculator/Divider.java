package nrahul32.calculator;

public class Divider extends CalculateBase {

    public Divider(double left_value, double right_value){
        super(left_value, right_value);
    }

    @Override
    public double execute() {
        if(right_value == 0){
            throw new IllegalArgumentException("Denominator cannot be 0 while performing Divide action");
        }
        result = left_value / right_value;
        return result;
    }

}
