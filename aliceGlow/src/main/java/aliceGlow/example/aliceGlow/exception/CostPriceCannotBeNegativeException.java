package aliceGlow.example.aliceGlow.exception;

public class CostPriceCannotBeNegativeException extends IllegalArgumentException{

    public CostPriceCannotBeNegativeException(){
        super("Cost Price cannot be negative");
    }
}
