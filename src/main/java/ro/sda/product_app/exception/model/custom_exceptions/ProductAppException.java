package ro.sda.product_app.exception.model.custom_exceptions;

public class ProductAppException extends RuntimeException{
    public ProductAppException(String message) {
        super(message);
    }
}
