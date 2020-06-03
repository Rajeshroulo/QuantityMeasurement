package quantitymeasurement;

public class Length {
    enum Unit {FEET, INCH}

    Unit unit;

    double value;

    public Length(Double value,Unit unit) throws QuantityMeasurementException {
        try {
            this.value = value;
            this.unit = unit;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException("Entered Null", QuantityMeasurementException.ExceptionType.ENTERED_NULL);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

}
