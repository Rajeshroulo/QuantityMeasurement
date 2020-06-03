package quantitymeasurement;

import org.junit.Test;

import static org.junit.Assert.*;
import static quantitymeasurement.QuantityMeasurementException.ExceptionType.ENTERED_NULL;

public class QuantityMeasurementTest {

    @Test
    public void givenTwoFeetValues_WhenEqual_shouldReturnEqual() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.FEET);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(0.0, Unit.FEET);
            assertEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoFeetValues_whenOneValueisNull_shouldThrowException() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.FEET);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(null, Unit.FEET);
        } catch (QuantityMeasurementException e) {
            assertEquals(ENTERED_NULL,e.type);
        }
    }

    @Test
    public void givenTwoFeetValues_whenNotEqual_shouldReturnNotEqual() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.FEET);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(4.0, Unit.FEET);
            assertNotEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoValuesOfInch_whenEqual_shouldReturnEqual() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(0.0, Unit.INCH);
            assertEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenNullValueOfInch_shouldThrowException() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2= new QuantityMeasurement(null, Unit.INCH);
        } catch (QuantityMeasurementException e) {
            assertEquals(ENTERED_NULL,e.type);
        }
    }

    @Test
    public void givenTwoValuesOfInch_whenNotEqual_shouldReturnNotEqual() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(3.0, Unit.INCH);
            assertNotEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoQuantitiesOfDifferentTypes_whenNotEqual_shouldReturnNotEqual() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(0.0, Unit.FEET);
            assertNotEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenValuesOfInchAndFeet_whenConversionIsCorrect_shouldReturnTrue() {
        try {
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(12.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.FEET);
            boolean results = quantityMeasurement.compare(quantityMeasurement1, quantityMeasurement2);
            assertTrue(results);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenValuesOfInchAndFeet_whenConversionIsWrong_shouldReturnFalse() {
        try {
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.FEET);
            boolean results = quantityMeasurement.compare(quantityMeasurement1, quantityMeasurement2);
            assertFalse(results);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenValuesOfInchAndFeet_whenConversionIsWrong_shouldReturnTrue() {
        try {
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(12.0, Unit.FEET);
            boolean results = quantityMeasurement.compare(quantityMeasurement1, quantityMeasurement2);
            assertFalse(results);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenFeetAndInchValues_whenConversionIsWrong_shouldReturnFalse() {
        try {
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.FEET);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.INCH);
            boolean results = quantityMeasurement.compare(quantityMeasurement1, quantityMeasurement2);
            assertFalse(results);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

}
