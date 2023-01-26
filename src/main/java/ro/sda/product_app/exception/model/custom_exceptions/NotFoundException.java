package ro.sda.product_app.exception.model.custom_exceptions;

import static ro.sda.product_app.utils.AppConstants.NOT_FOUND_MESSAGE;

public class NotFoundException extends ProductAppException {
    public NotFoundException() {
        super(NOT_FOUND_MESSAGE);
    }
}
