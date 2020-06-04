package quantitymeasurement;

public enum Unit {

    FEET(12.0), INCH(1.0), YARD(36.0);
    private Double inchConversionValue;

    Unit(Double inchConversionValue) {
        this.inchConversionValue = inchConversionValue;
    }

    public Double getInchConversionValue() {
        return inchConversionValue;
    }
}
