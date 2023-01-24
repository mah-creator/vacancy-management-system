package user;

public class WrongUserCredentialsException extends IllegalStateException {
    public WrongUserCredentialsException(){
        super("Wrong Email or Password");
    }
}