package ro.sda.product_app.exception.model.custom_exceptions;

import static ro.sda.product_app.utils.AppConstants.ALREADY_EXISTENT_MESSAGE;

public class AlreadyExistentException extends ProductAppException {
    public AlreadyExistentException() {
        super(ALREADY_EXISTENT_MESSAGE);
    }

}
