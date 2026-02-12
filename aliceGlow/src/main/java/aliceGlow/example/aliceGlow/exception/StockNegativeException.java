package aliceGlow.example.aliceGlow.exception;

public class StockNegativeException extends IllegalArgumentException{

    public StockNegativeException(){
        super("Stock cannot be negative");
    }
}
