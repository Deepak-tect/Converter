import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import Converter.Ascii;

public class AsciiConverterTest {
	
	@Test
    void testToAsciiConversion() throws Exception {
        assertEquals("97 98 99", Ascii.asciiConverter("abc", "To ascii"));
    }

    @Test
    void testFromAsciiConversion() throws Exception {
        assertEquals("abc", Ascii.asciiConverter("97 98 99", "From ascii"));
    }

    @Test
    void testToAsciiCombined() throws Exception {
        assertEquals("294", Ascii.asciiConverter("abc", "To ascii combined"));
    }

    @Test
    void testEmptyStringToAscii() throws Exception {
        assertEquals("", Ascii.asciiConverter("", "To ascii"));
    }

    @Test
    void testEmptyStringFromAscii() throws Exception {
        assertEquals("", Ascii.asciiConverter(" ", "From ascii"));
    }

    @Test
    void testEmptyStringToAsciiCombined() throws Exception {
        assertEquals("0", Ascii.asciiConverter("", "To ascii combined"));
    }

    @Test
    void testSpecialCharactersToAscii() throws Exception {
        assertEquals("33 64 35", Ascii.asciiConverter("!@#", "To ascii"));
    }

    @Test
    void testSpecialCharactersFromAscii() throws Exception {
        assertEquals("!@#", Ascii.asciiConverter("33 64 35", "From ascii"));
    }

    @Test
    void testAsciiConverterExceptionInvalidInput() throws Exception {
        assertThrows(Exception.class, () ->
            Ascii.asciiConverter("invalidValue", "From ascii")
        );
    }
}
