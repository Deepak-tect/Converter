package Converter;

public class Time {
public static String timeConverter(String equationText, String fromThis, String toThis) throws Exception {
    try {
        double answerNum = Double.parseDouble(equationText);
        double convertedValue = convertTime(answerNum, fromThis, toThis);
        return Converter.reScaleDouble(convertedValue);
    } catch (NumberFormatException e) {
        throw new Exception("Invalid numerical value: " + equationText);
    }
}

private static double convertTime(double time, String fromUnit, String toUnit) {
    switch (fromUnit) {
        case "Seconds":
            return convertSeconds(time, toUnit);
        case "Minutes":
            return convertMinutes(time, toUnit);
        case "Hours":
            return convertHours(time, toUnit);
        case "Days":
            return convertDays(time, toUnit);
        case "Weeks":
            return convertWeeks(time, toUnit);
        case "Months":
            return convertMonths(time, toUnit);
        case "Years":
            return convertYears(time, toUnit);
        default:
            throw new IllegalArgumentException("Unsupported 'fromUnit' unit");
    }
}

private static double convertSeconds(double seconds, String toUnit) {
    switch (toUnit) {
        case "Minutes":
            return seconds / 60.0;
        case "Hours":
            return seconds / 3600.0;
        case "Days":
            return seconds / 86400.0;
        case "Weeks":
            return seconds / 604800.0;
        case "Months":
            return seconds / 2.628e+6;
        case "Years":
            return seconds / 3.154e+7;
        default:
            throw new IllegalArgumentException("Unsupported 'toUnit' unit");
    }
}

private static double convertMinutes(double minutes, String toUnit) {
    switch (toUnit) {
        case "Seconds":
            return minutes * 60.0;
        case "Hours":
            return minutes / 60.0;
        case "Days":
            return minutes / 1440.0;
        case "Weeks":
            return minutes / 10080.0;
        case "Months":
            return minutes / 43800.0;
        case "Years":
            return minutes / 525600.0;
        default:
            throw new IllegalArgumentException("Unsupported 'toUnit' unit");
    }
}

private static double convertHours(double hours, String toUnit) {
    switch (toUnit) {
        case "Seconds":
            return hours * 3600.0;
        case "Minutes":
            return hours * 60.0;
        case "Days":
            return hours / 24.0;
        case "Weeks":
            return hours / 168.0;
        case "Months":
            return hours / 730.0;
        case "Years":
            return hours / 8760.0;
        default:
            throw new IllegalArgumentException("Unsupported 'toUnit' unit");
    }
}

private static double convertDays(double days, String toUnit) {
    switch (toUnit) {
        case "Seconds":
            return days * 86400.0;
        case "Minutes":
            return days * 1440.0;
        case "Hours":
            return days * 24.0;
        case "Weeks":
            return days / 7.0;
        case "Months":
            return days / 30.417;
        case "Years":
            return days / 365.0;
        default:
            throw new IllegalArgumentException("Unsupported 'toUnit' unit");
    }
}

private static double convertWeeks(double weeks, String toUnit) {
    switch (toUnit) {
        case "Seconds":
            return weeks * 604800.0;
        case "Minutes":
            return weeks * 10080.0;
        case "Hours":
            return weeks * 168.0;
        case "Days":
            return weeks * 7.0;
        case "Months":
            return weeks / 4.345;
        case "Years":
            return weeks / 52.143;
        default:
            throw new IllegalArgumentException("Unsupported 'toUnit' unit");
    }
}

private static double convertMonths(double months, String toUnit) {
    switch (toUnit) {
        case "Seconds":
            return months * 2.628e+6;
        case "Minutes":
            return months * 43800.0;
        case "Hours":
            return months * 730.0;
        case "Days":
            return months * 30.417;
        case "Weeks":
            return months * 4.345;
        case "Years":
            return months / 12.0;
        default:
            throw new IllegalArgumentException("Unsupported 'toUnit' unit");
    }
}

private static double convertYears(double years, String toUnit) {
    switch (toUnit) {
        case "Seconds":
            return years * 3.154e+7;
        case "Minutes":
            return years * 525600.0;
        case "Hours":
            return years * 8760.0;
        case "Days":
            return years * 365.0;
        case "Weeks":
            return years * 52.143;
        case "Months":
            return years * 12.0;
        default:
            throw new IllegalArgumentException("Unsupported 'toUnit' unit");
    }
}

}
