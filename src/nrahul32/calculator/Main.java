package nrahul32.calculator;

public class Main {

    public static void main(String[] args) {

        // Initializing the numbers and operator
        double val1 = 100.0d;
        double val2 = 20.0d;
        double result;
        char opCode = 'd';
        // a - addition, can use d,m,a,s

        // Calculating
        if(opCode == 'a'){
            result = val1 + val2;
        } else if(opCode == 's'){
            result = val1 - val2;
        } else if(opCode == 'm'){
            result = val1 * val2;
        } else if(opCode == 'd'){
            // Ternary operator
            result = (val2 == 0 ? 0 : val1/val2);

//            Or using if-else:
//            if(val2 == 0){
//                System.out.println("val2 cannot be 0");
//                result = 0;
//            } else {
//                result = val1 / val2;
//            }
        } else {
            System.out.println("Invalid opCode: " + opCode);
            result = 0.0d;
        }

        // Printing the result
        System.out.println(result);


    }
}
