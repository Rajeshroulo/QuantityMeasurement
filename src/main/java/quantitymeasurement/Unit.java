package quantitymeasurement;

import java.util.Arrays;
import java.util.List;

public enum Unit {

    FEET("LENGTH",12.0), INCH("LENGTH",1.0),
    YARD("LENGTH",36.0), CENTIMETER("LENGTH",0.4),
    LITRE("VOLUME",1.0), GALLON("VOLUME",3.78),
    MILLILITRE("VOLUME",1.0/1000.0),GRAM("WEIGHT",1.0),
    KILOGRAM("WEIGHT",1000.0),
    TONNE("WEIGHT",1000000.0),
    KELVIN("TEMPERATURE",1.0,0.0,0.0),
    CELCIUS("TEMPERATURE",1.0,273.15,0.0), FAHRENHEIT("TEMPERATURE",5.0/9.0,-32.0,273.15);

    final String measurementType;
    private List<Double> conversionValue;

    Unit(String measurementType,Double... conversionValue) {
        this.measurementType = measurementType;
        this.conversionValue = Arrays.asList(conversionValue);
    }
    public double getConvertedValue(double value,Unit unit) {
        if(unit.measurementType != "TEMPERATURE")
            return conversionValue.get(0)*value;
        return conversionValue.get(0)*(value+ conversionValue.get(1)) + conversionValue.get(2);
    }
    public Double getConversionValue() {
        return conversionValue.get(0);
    }

    public String getMeasurementType() {
        return measurementType;
    }


}
