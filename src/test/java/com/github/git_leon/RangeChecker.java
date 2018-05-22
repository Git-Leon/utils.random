package com.github.git_leon;

import java.util.Date;

/**
 * @author leon on 5/22/18.
 */
public class RangeChecker {
    public static boolean isInRange(Float value, Float minimumVal, Float maximumVal) {
        boolean isGreaterThanMinimum = value >= minimumVal;
        boolean isLesserThanMaximum = value <= maximumVal;
        if(isGreaterThanMinimum && isLesserThanMaximum) {
            return true;
        }

        String error = "%s is not %s than " + value;
        String tooGreat = String.format(error, minimumVal, "greater");
        String tooLess = String.format(error, maximumVal, "less");
        String errorMessage = "";

        if(!isGreaterThanMinimum) { // too low
            errorMessage += tooLess;
        }

        if(!isLesserThanMaximum) { // too high
            errorMessage += "\n" + tooGreat;
        }
        System.out.println("value = " + value);
        System.out.println("min = " + minimumVal);
        System.out.println("max = " + maximumVal);
        throw new Error(errorMessage);
    }

    public static boolean isInRange(Double value, Double minimumVal, Double maximumVal) {
        return isInRange(value.floatValue(), minimumVal.floatValue(), maximumVal.floatValue());
    }

    public static boolean isInRange(Integer value, Integer minimumVal, Integer maximumVal) {
        return isInRange(value.floatValue(), minimumVal.floatValue(), maximumVal.floatValue());
    }

    public static boolean isInRange(Long value, Long minimumVal, Long maximumVal) {
        return isInRange(value.floatValue(), minimumVal.floatValue(), maximumVal.floatValue());
    }

    public static boolean isInRange(Character value, Character minimumVal, Character maximumVal) {
        return isInRange((int) value.charValue(), (int) minimumVal.charValue(), (int) maximumVal.charValue());
    }

    public static boolean isInRange(Date value, Date minimumVal, Date maximumVal) {
        return isInRange(value.getTime(), minimumVal.getTime(), maximumVal.getTime());
    }
}
