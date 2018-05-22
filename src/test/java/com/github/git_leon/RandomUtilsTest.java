package com.github.git_leon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * @author leon on 5/22/18.
 */
public class RandomUtilsTest {

    @Test
    public void createFloatTest() {
        // Given
        Float minVal = 0F;
        Float maxVal = 100F;

        for (int i = 0; i < maxVal; i++) {
            // When
            Float randomFloat = RandomUtils.createFloat(minVal, maxVal);
            boolean outcome = RangeChecker.isInRange(randomFloat, minVal, maxVal);

            // Then
            Assert.assertTrue(outcome);
        }
    }


    @Test
    public void createDoubleTest() {
        // Given
        Double minVal = 0D;
        Double maxVal = 100D;

        for (int i = 0; i < maxVal; i++) {
            // When
            Double randomDouble = RandomUtils.createDouble(minVal, maxVal);
            boolean outcome = RangeChecker.isInRange(randomDouble, minVal, maxVal);

            // Then
            Assert.assertTrue(outcome);
        }
    }


    @Test
    public void createLongTest() {
        // Given
        Long minVal = 0L;
        Long maxVal = 100L;

        for (int i = 0; i < maxVal; i++) {
            // When
            Long randomLong = RandomUtils.createLong(minVal, maxVal);
            boolean outcome = RangeChecker.isInRange(randomLong, minVal, maxVal);

            // Then
            Assert.assertTrue(outcome);
        }
    }


    @Test
    public void createIntegerTest() {
        // Given
        Integer minVal = 0;
        Integer maxVal = 100;

        for (int i = 0; i < maxVal; i++) {
            // When
            Integer randomInteger = RandomUtils.createInteger(minVal, maxVal);
            boolean outcome = RangeChecker.isInRange(randomInteger, minVal, maxVal);

            // Then
            Assert.assertTrue(outcome);
        }
    }


    @Test
    public void createCharacterTest() {
        // Given
        char minVal = 'a';
        char maxVal = 'z';

        for (int i = 0; i < maxVal; i++) {
            // When
            Character randomCharacter = RandomUtils.createCharacter(minVal, maxVal);
            boolean outcome = RangeChecker.isInRange(randomCharacter, minVal, maxVal);

            // Then
            Assert.assertTrue(outcome);
        }
    }

    @Test
    public void createStringTest() {
        Integer stringLength = 15;
        Character min = 'a';
        Character max = 'z';
        Integer charDelta = max - min;
        Integer numberOfIterations = charDelta * stringLength;
        for (int i = 0; i < numberOfIterations; i++) {
            // create a random string
            String randomString = RandomUtils.createString('a', 'z', 15);

            // check each character of string
            for (char character : randomString.toCharArray()) {
                boolean outcome = RangeChecker.isInRange(character, min, max);
                Assert.assertTrue(outcome);
            }
        }

    }

    @Test
    public void createDateTest() {
        // Given
        long seed = System.currentTimeMillis();

        Date minDate = new Date(seed);
        Date maxDate = new Date(seed / 2);
        Date dateDelta = new Date(maxDate.getTime() - minDate.getTime());

        for (int i = 0; i < dateDelta.getYear(); i++) {
            // When
            Date randomDate = RandomUtils.createDate(minDate, maxDate);
            boolean outcome = RangeChecker.isInRange(randomDate, minDate, maxDate);

            // Then
            Assert.assertTrue(outcome);
        }
    }
}