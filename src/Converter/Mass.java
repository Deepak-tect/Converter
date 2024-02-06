package Converter;

public class Mass {
	public static String massConverter(String equationText, String fromThis, String toThis) throws Exception {
        try {
            double value = Double.parseDouble(equationText);
            double convertedValue;

            // Conversion logic
            switch (fromThis.toLowerCase()) {
                case "kg":
                    convertedValue = convertKilograms(value, toThis);
                    break;
                case "lb":
                    convertedValue = convertPounds(value, toThis);
                    break;
                case "oz":
                    convertedValue = convertOunces(value, toThis);
                    break;
                case "t":
                    convertedValue = convertMetricTons(value, toThis);
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported 'fromThis' unit");
            }

            return String.valueOf(convertedValue);
        } catch (NumberFormatException e) {
            throw new Exception("Invalid numerical value: " + equationText);
        }
    }

	public static double convertKilograms(double value, String toThis) {
        switch (toThis.toLowerCase()) {
            case "kg":
                return value;
            case "lb":
                return value * 2.2046200000;
            case "oz":
                return value * 35.2740000000;
            case "t":
                return value / 1000.0000000000;
            default:
                throw new IllegalArgumentException("Unsupported 'toThis' unit");
        }
    }

    public static double convertPounds(double value, String toThis) {
        switch (toThis.toLowerCase()) {
            case "kg":
                return value / 2.20462;
            case "lb":
                return value;
            case "oz":
                return value * 16;
            case "t":
                return value / 2204.62;
            default:
                throw new IllegalArgumentException("Unsupported 'toThis' unit");
        }
    }

    public static double convertOunces(double value, String toThis) {
        switch (toThis.toLowerCase()) {
            case "kg":
                return value / 35.274;
            case "lb":
                return value / 16;
            case "oz":
                return value;
            case "t":
                return value / 35274.0;
            default:
                throw new IllegalArgumentException("Unsupported 'toThis' unit");
        }
    }

    public static double convertMetricTons(double value, String toThis) {
        switch (toThis.toLowerCase()) {
            case "kg":
                return value * 1000.0;
            case "lb":
                return value * 2204.62;
            case "oz":
                return value * 35274.0;
            case "t":
                return value;
            default:
                throw new IllegalArgumentException("Unsupported 'toThis' unit");
        }
    }
	
}
