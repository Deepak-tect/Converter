package Converter;

public class Temperature {
	public static String tempConverter(String equationText, String fromThis, String toThis) throws Exception {
        try {
            double answerNum = Double.parseDouble(equationText);
            double convertedValue = convertTemperature(answerNum, fromThis, toThis);
            return Converter.reScaleDouble(convertedValue);
        } catch (NumberFormatException e) {
            throw new Exception("Invalid numerical value: " + equationText);
        }
    }
    
    private static double convertTemperature(double temperature, String fromUnit, String toUnit) {
        switch (fromUnit) {
            case "Celsius":
                return convertCelsius(temperature, toUnit);
            case "Fahrenheit":
                return convertFahrenheit(temperature, toUnit);
            case "Kelvin":
                return convertKelvin(temperature, toUnit);
            default:
                throw new IllegalArgumentException("Unsupported 'fromUnit' unit");
        }
    }
    
    private static double convertCelsius(double temperature, String toUnit) {
        switch (toUnit) {
            case "Fahrenheit":
                return (temperature * 9.0 / 5.0) + 32.0;
            case "Kelvin":
                return temperature + 273.15;
            default:
                throw new IllegalArgumentException("Unsupported 'toUnit' unit");
        }
    }
    
    private static double convertFahrenheit(double temperature, String toUnit) {
        switch (toUnit) {
            case "Celsius":
                return (temperature - 32.0) * (5.0 / 9.0);
            case "Kelvin":
                return (temperature - 32.0) * (5.0 / 9.0) + 273.15;
            default:
                throw new IllegalArgumentException("Unsupported 'toUnit' unit");
        }
    }
    
    private static double convertKelvin(double temperature, String toUnit) {
        switch (toUnit) {
            case "Celsius":
                return temperature - 273.15;
            case "Fahrenheit":
                return (temperature - 273.15) * 9.0 / 5.0 + 32.0;
            default:
                throw new IllegalArgumentException("Unsupported 'toUnit' unit");
        }
    }
    
}
