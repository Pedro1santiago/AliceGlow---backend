package aliceGlow.example.aliceGlow.exception;

public class DefaultUserProfileNotFoundException extends RuntimeException{

    public DefaultUserProfileNotFoundException(){
        super("Default profile USER not found");
    }
}
