package nrahul32.calculator;

public class InvalidCommand extends Exception {

    public InvalidCommand(String reason, String statement){
        super(reason + " : " + statement);
    }

    public InvalidCommand(String reason, String statement, Throwable cause){
        super(reason + " : " + statement, cause);
    }
}
