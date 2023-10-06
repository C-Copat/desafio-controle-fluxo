public class ParametrosInvalidosException extends Exception {


    //First constructor

    public ParametrosInvalidosException(String message){
        super (message);
    }

    // 'null' constructor
    public ParametrosInvalidosException(){

    }

    // Throwable constructor
    // If the custom exception can be caused by some other exception. You can pass in the Throwable that actually caused it.
    public ParametrosInvalidosException(Throwable cause){
        super(cause);
    }

    // Throwable + message constructor

    public ParametrosInvalidosException(String message, Throwable cause){
        super(message, cause);
    }
}
