package quantitymeasurement;

public class QuantityMeasurementException extends RuntimeException  {

    enum ExceptionType {ENTERED_NULL,INVALID_ADDITION,INVALID_CONVERSION}

    ExceptionType type;

    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

}
