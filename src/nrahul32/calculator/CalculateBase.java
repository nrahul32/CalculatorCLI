package nrahul32.calculator;

public abstract class CalculateBase {

    protected double left_value;
    protected double right_value;
    protected double result;

    //public CalculateBase(){};
    public CalculateBase(double left_value, double right_value){
        this.left_value = left_value;
        this.right_value = right_value;
    };

    abstract double execute();
}
