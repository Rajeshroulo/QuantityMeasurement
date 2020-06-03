package quantitymeasurement;

public enum Unit {

    FEET(12.0), INCH(1.0);
    Double inchConversionValue;

    Unit(Double inchConversionValue) {
        this.inchConversionValue = inchConversionValue;
    }

}
