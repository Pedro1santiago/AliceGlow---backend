package aliceGlow.example.aliceGlow.exception;

public class SaleWithoutItemsException extends RuntimeException {

    public SaleWithoutItemsException(){
        super("Sale must have at least one item");
    }
}
