package quantitymeasurement;

class QuantityMeasurement  {

    double value;
    Unit unit;

    public QuantityMeasurement(Double value, Unit unit ) throws  QuantityMeasurementException {
          if(value == null)
           throw new QuantityMeasurementException("Entered Null", QuantityMeasurementException.ExceptionType.ENTERED_NULL);
        this.unit = unit;
        this.value = value*unit.getConversionValue();
    }

    public QuantityMeasurement() {
    }

    public double add(QuantityMeasurement quantityMeasurement1, QuantityMeasurement quantityMeasurement2) {
        if(quantityMeasurement1.unit.measurementType != quantityMeasurement2.unit.measurementType)
            throw new QuantityMeasurementException("Cannot add these measurements",
                    QuantityMeasurementException.ExceptionType.INVALID_ADDITION);
        return quantityMeasurement1.value + quantityMeasurement2.value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement quantityMeasurement = (QuantityMeasurement) o;
        return Double.compare (Math.round(quantityMeasurement.value*10000.0)/10000.0, Math.round(value*10000.0)/10000.0) == 0;
    }

}