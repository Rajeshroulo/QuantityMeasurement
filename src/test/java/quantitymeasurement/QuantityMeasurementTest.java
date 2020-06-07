package quantitymeasurement;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.*;
import static quantitymeasurement.QuantityMeasurementException.ExceptionType.ENTERED_NULL;

public class QuantityMeasurementTest {

    QuantityMeasurement quantityMeasurement;

    @Before
    public void setUp() throws Exception {
        quantityMeasurement = new QuantityMeasurement();
    }

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
            assertEquals(ENTERED_NULL, e.type);
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
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(null, Unit.INCH);
        } catch (QuantityMeasurementException e) {
            assertEquals(ENTERED_NULL, e.type);
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
            assertEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenValuesOfInchAndFeet_whenConversionIsCorrect_shouldReturnTrue() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(12.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.FEET);
            assertEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenValuesOfInchAndFeet_whenConversionIsWrong_shouldReturnNotCorrect() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.FEET);
            assertNotEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenValuesOfInchAndFeet_whenConversionIsWrong_shouldReturnNotEquals() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(12.0, Unit.FEET);
            assertNotEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenFeetAndInchValues_whenConversionIsWrong_shouldReturnNotEquals() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.FEET);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.INCH);
            assertNotEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenValuesOfFeetAndYard_whenConversionIsProper_shouldReturnTrue() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(3.0, Unit.FEET);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.YARD);
            assertEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenValuesOfInchAndYard_whenConversionIsProper_shouldReturnTrue() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(36.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.YARD);
            assertEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenYardAndFeetValues_whenConversionIsProper_shouldReturnTrue() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.YARD);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(3.0, Unit.FEET);
            assertEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenYardAndInchValues_whenConversionIsCorrect_shouldReturnTrue() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.YARD);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(36.0, Unit.INCH);
            assertEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenYardAndFeetValues_whenConversionIsImproper_shouldReturnNotEquals() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.YARD);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.FEET);
            assertNotEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenValuesOfInchAndYard_whenConversionIsIncorrect_shouldReturnNotEquals() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.YARD);
            assertNotEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoValuesOfDifferentTypes_whenEqual_shouldReturnEqual() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(0.0, Unit.CENTIMETER);
            assertEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoValuesOfDifferentTypes_whenNotEqual_shouldReturnNotEqual() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.CENTIMETER);
            assertNotEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenValuesOfDifferentTypes_whenEqual_shouldReturnEqual() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(2.5, Unit.CENTIMETER);
            assertEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantitiesYardAndCentimetreValues_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(0.01, Unit.YARD), new QuantityMeasurement(0.9, Unit.CENTIMETER));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantitiesFootAndCentimetreValues_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(0.5, Unit.FEET),
                    new QuantityMeasurement(15.0, Unit.CENTIMETER));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenValuesOfTwoDifferentTypes_whenEqual_shouldReturnEqual() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(2.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(5.0, Unit.CENTIMETER);
            assertEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given2inchAnd2inch_whenAdded_shouldReturn4inches() {
        double result = quantityMeasurement.add(new QuantityMeasurement(2.0,Unit.INCH),new QuantityMeasurement(2.0,Unit.INCH),Unit.INCH);
        assertEquals(4.0,result,0.0);
    }

    @Test
    public void given1FeetAnd2inch_whenAdded_shouldReturn14inches() {
        double result = quantityMeasurement.add(new QuantityMeasurement(1.0,Unit.FEET),new QuantityMeasurement(2.0,Unit.INCH),Unit.INCH);
        assertEquals(14.0,result,0.0);
    }

    @Test
    public void given1FeetAnd1Feet_whenAdded_shouldReturn24inches() {
        double result = quantityMeasurement.add(new QuantityMeasurement(1.0,Unit.FEET),new QuantityMeasurement(1.0,Unit.FEET),Unit.INCH);
        assertEquals(24.0,result,0.0);
    }

    @Test
    public void givenInchAndCentimetreValues_whenAdded_shouldReturnResults() {
        double result = quantityMeasurement.add(new QuantityMeasurement(2.0,Unit.INCH),new QuantityMeasurement(2.5,Unit.CENTIMETER),Unit.INCH);
        assertEquals(3,result,0.02);
    }

    @Test
    public void given1InchAnd2Yard_whenAdded_shouldReturn73inches() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0,Unit.INCH);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(2.0,Unit.YARD);
        double result = quantityMeasurement.add(quantityMeasurement1,quantityMeasurement2,Unit.INCH);
        assertEquals(73,result,0.0);
    }

    @Test
    public void given1FeetAnd2Yard_whenAdded_shouldReturn84inches() {
        double result = quantityMeasurement.add(new QuantityMeasurement(1.0,Unit.FEET),
                new QuantityMeasurement(2.0,Unit.YARD),Unit.INCH);
        assertEquals(84.0,result,0.0);
    }

    @Test
    public void given1Litre1LitreToAddAndConvertToInch_shouldThrowException() {
        try {
            quantityMeasurement.add(new QuantityMeasurement(1.0, Unit.LITRE), new QuantityMeasurement(1.0, Unit.LITRE),Unit.INCH);
        } catch (QuantityMeasurementException e) {
            assertEquals(QuantityMeasurementException.ExceptionType.INVALID_CONVERSION,e.type);
        }
    }


    @Test
    public void givenValuesOflitresAndGallon_whenEqual_ShouldReturnEqual() {
        try {
            assertEquals(new QuantityMeasurement(1.0, Unit.GALLON),
                    new QuantityMeasurement(3.78, Unit.LITRE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenValuesOflitresAndMillilitres_whenEqual_ShouldReturnEqual() {
        try {
            assertEquals(new QuantityMeasurement(1.0, Unit.LITRE),
                    new QuantityMeasurement(1000.0, Unit.MILLILITRE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities0LitreAnd0Gallon_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(0.0, Unit.LITRE),
                    new QuantityMeasurement(0.0, Unit.GALLON));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities0LitreAnd0Millilitres_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(0.0, Unit.LITRE),
                    new QuantityMeasurement(0.0, Unit.MILLILITRE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd1Litre_shouldThrowException() {
        try {
            quantityMeasurement.add(new QuantityMeasurement(1.0, Unit.FEET), new QuantityMeasurement(1.0, Unit.LITRE),Unit.LITRE);
        } catch (QuantityMeasurementException e) {
            assertEquals(QuantityMeasurementException.ExceptionType.INVALID_ADDITION,e.type);
        }
    }

    @Test
    public void given1000MillilitreAnd1Litre_whenAdded_shouldReturn2Litres() {
        double result = quantityMeasurement.add(new QuantityMeasurement(1000.0,Unit.MILLILITRE),new QuantityMeasurement(1.0,Unit.LITRE),Unit.LITRE);
        assertEquals(2.0,result,0.0);
    }

    @Test
    public void givenGallonAndLitre_whenAdded_shouldReturnCorrectResults() {
        double result = quantityMeasurement.add(new QuantityMeasurement(1.0,Unit.GALLON),new QuantityMeasurement(3.78,Unit.LITRE),Unit.LITRE);
        assertEquals(7.56,result,0.0);
    }

    @Test
    public void givenQuantities1000GramsAnd1Kilogram_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(1000.0, Unit.GRAM),new QuantityMeasurement(1.0, Unit.KILOGRAM));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities1000KilogramAnd1Tonne_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(1000.0, Unit.KILOGRAM),new QuantityMeasurement(1.0, Unit.TONNE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities1000000GramAnd1Tonne_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(1000000.0, Unit.GRAM),new QuantityMeasurement(1.0, Unit.TONNE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities0KilogramAnd0Tonne_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(0.0, Unit.KILOGRAM),new QuantityMeasurement(0.0, Unit.TONNE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities1KilogramAnd1Tonne_whenNotEqual_shouldReturnFalse() {
        try {
            assertNotEquals(new QuantityMeasurement(1.0, Unit.KILOGRAM),new QuantityMeasurement(1.0, Unit.TONNE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities1GramAnd1Tonne_whenNotEqual_shouldReturnFalse() {
        try {
            assertNotEquals(new QuantityMeasurement(1.0, Unit.GRAM),new QuantityMeasurement(1.0, Unit.TONNE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities1000GramAnd1Tonne_whenAdded_shouldReturnResultsInKilogram() {
        double result = quantityMeasurement.add(new QuantityMeasurement(1000.0,Unit.GRAM),new QuantityMeasurement(1.0,Unit.TONNE),Unit.KILOGRAM);
        assertEquals(1001,result,0.0);
    }

    @Test
    public void givenQuantities1000GramAnd1Kilogram_whenAdded_shouldReturnResultsInKilogram() {
        double result = quantityMeasurement.add(new QuantityMeasurement(1000.0, Unit.GRAM), new QuantityMeasurement(1.0, Unit.KILOGRAM),Unit.KILOGRAM);
        assertEquals(2, result, 0.0);
    }

}