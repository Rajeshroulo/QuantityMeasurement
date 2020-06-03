package quantitymeasurement;

import org.junit.Test;

import static org.junit.Assert.*;
import static quantitymeasurement.QuantityMeasurementException.ExceptionType.ENTERED_NULL;

public class QuantityMeasurementTest {

    @Test
    public void givenTwofFeetValues_WhenEqual_shouldReturnEqual() {
        try {
            Length length1 = new Length(0.0, Length.Unit.FEET);
            Length length2 = new Length(0.0, Length.Unit.FEET);
            assertEquals(length1, length2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoFeetValues_whenOneValueisNull_shouldThrowException() {
        try {
            Length length1 = new Length(0.0, Length.Unit.FEET);
            Length length2 = new Length(null, Length.Unit.FEET);
        } catch (QuantityMeasurementException e) {
            assertEquals(ENTERED_NULL,e.type);
        }
    }

    @Test
    public void givenTwoFeetValues_whenNotEqual_shouldReturnNotEqual() {
        try {
            Length length1 = new Length(0.0, Length.Unit.FEET);
            Length length2 = new Length(4.0, Length.Unit.FEET);
            assertNotEquals(length1, length2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoValuesOfInch_whenEqual_shouldReturnEqual() {
        try {
            Length length1 = new Length(0.0, Length.Unit.INCH);
            Length length2 = new Length(0.0, Length.Unit.INCH);
            assertEquals(length1, length2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenNullValueOfInch_shouldThrowException() {
        try {
            Length length1 = new Length(0.0, Length.Unit.INCH);
            Length length2 = new Length(null, Length.Unit.INCH);
        } catch (QuantityMeasurementException e) {
            assertEquals(ENTERED_NULL,e.type);
        }
    }

    @Test
    public void givenTwoValuesOfInch_whenNotEqual_shouldReturnNotEqual() {
        try {
            Length length1 = new Length(0.0, Length.Unit.INCH);
            Length length2 = new Length(3.0, Length.Unit.INCH);
            assertNotEquals(length1, length2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoQuantitiesOfDifferentTypes_whenNotEqual_shouldReturnNotEqual() {
        try {
            Length length1 = new Length(0.0, Length.Unit.INCH);
            Length length2 = new Length(0.0, Length.Unit.FEET);
            assertNotEquals(length1, length2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

}
