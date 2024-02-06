package Converter;

public class Ascii {
    public static String asciiConverter(String equationText, String fromThis) throws Exception {
        try {
            String answer = equationText;
            String convertedAnswer;
    
            switch (fromThis) {
                case "To ascii":
                    convertedAnswer = convertToAscii(answer);
                    break;
                case "From ascii":
                    convertedAnswer = convertFromAscii(answer);
                    break;
                case "To ascii combined":
                    convertedAnswer = convertToAsciiCombined(answer);
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported 'fromThis' unit");
            }
    
            return convertedAnswer;
        } catch (Exception e) {
            throw new Exception("Invalid inputs value: " + equationText);
        }
    }
    
    private static String convertToAscii(String input) {
        StringBuilder result = new StringBuilder();
    
        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);
            int toAscii = temp;
            result.append(String.valueOf(toAscii)).append(" ");
        }
    
        return result.toString().trim();
    }
    
    private static String convertFromAscii(String input) {
        StringBuilder result = new StringBuilder();
        String[] splitter = input.split(" ");
    
        for (String value : splitter) {
            int toAscii = Integer.parseInt(value);
            char temp = (char) toAscii;
            result.append(String.valueOf(temp));
        }
    
        return result.toString();
    }
    
    private static String convertToAsciiCombined(String input) {
        int toAscii = 0;
    
        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);
            toAscii += temp;
        }
    
        return String.valueOf(toAscii);
    }
    
}
