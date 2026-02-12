package aliceGlow.example.aliceGlow.exception;

public class SaleNotFoundException extends RuntimeException {

    public SaleNotFoundException(){
        super("Sale not found");
    }

    public SaleNotFoundException(Long id){
        super("Sale not found with id: " + id);
    }
}
