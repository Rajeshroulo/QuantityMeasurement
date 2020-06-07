package quantitymeasurement;

public enum Unit {

    FEET(12.0,"LENGTH"), INCH(1.0,"LENGTH"),
    YARD(36.0,"LENGTH"), CENTIMETER(0.4,"LENGTH"),
    LITRE(1.0,"VOLUME"), GALLON(3.78,"VOLUME"),
    MILLILITRE(1.0/1000.0,"VOLUME");
    private final Double conversionValue;
    final String measurementType;

    Unit(Double conversionValue,String measurementType) {
        this.conversionValue = conversionValue;
        this.measurementType = measurementType;
    }

    public Double getConversionValue() {
        return conversionValue;
    }

}
