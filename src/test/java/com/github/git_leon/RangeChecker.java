package com.github.git_leon;

import java.util.Date;

/**
 * @author leon on 5/22/18.
 */
public class RangeChecker {
    public static synchronized boolean isInRange(Float value, Float minimumVal, Float maximumVal) {
        return value > minimumVal && value < maximumVal;
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
        return isInRange((int)value.charValue(), (int)minimumVal.charValue(), (int)maximumVal.charValue());
    }

    public static boolean isInRange(Date value, Date minimumVal, Date maximumVal) {
        return isInRange(value.getTime(), minimumVal.getTime(), maximumVal.getTime());
    }
}
