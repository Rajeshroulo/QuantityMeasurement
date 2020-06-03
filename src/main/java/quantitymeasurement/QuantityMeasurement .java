package quantitymeasurement;

class QuantityMeasurement  {

    Unit unit;
    double value;

    public QuantityMeasurement(Double value,Unit unit) throws QuantityMeasurementException {
        try {
            this.value = value;
            this.unit = unit;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException("Entered Null", QuantityMeasurementException.ExceptionType.ENTERED_NULL);
        }
    }

    public QuantityMeasurement() {
    }

    public boolean compare(QuantityMeasurement quantityMeasurement1, QuantityMeasurement quantityMeasurement2) {
        Double value1 = quantityMeasurement1.value* quantityMeasurement1.unit.inchConversionValue;
        Double value2 = quantityMeasurement2.value* quantityMeasurement2.unit.inchConversionValue;
        if(value1.equals(value2))
            return true;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement quantityMeasurement = (QuantityMeasurement) o;
        return Double.compare(quantityMeasurement.value, value) == 0 &&
                unit == quantityMeasurement.unit;
    }

}
