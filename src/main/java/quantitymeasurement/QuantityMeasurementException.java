package quantitymeasurement;

public class QuantityMeasurementException extends RuntimeException  {

    enum ExceptionType {ENTERED_NULL,INVALID_ADDITION}

    ExceptionType type;

    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

}
