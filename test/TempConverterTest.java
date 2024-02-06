import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import Converter.Converter;
import Converter.Temperature;

public class TempConverterTest {


	@Test
	void testFromCelsiusFaherenheit() throws Exception{
	    assertEquals(Converter.reScaleDouble((25*(9.0/5.0)+32.0)), Temperature.tempConverter("25", "Celsius", "Fahrenheit"));
	}
	@Test
	void testFromCelsiusKalvin() throws Exception{
	    assertEquals(Converter.reScaleDouble(25+273.15), Temperature.tempConverter("25", "Celsius", "Kelvin"));
	}
	@Test
	void testFromCelsiusFaherenheit1() throws Exception{
	    assertEquals(Converter.reScaleDouble((-25*(9.0/5.0)+32.0)), Temperature.tempConverter("-25", "Celsius", "Fahrenheit"));
	}
	@Test
	void testFromCelsiusKalvin1() throws Exception{
	    assertEquals(Converter.reScaleDouble(-25+273.15), Temperature.tempConverter("-25", "Celsius", "Kelvin"));
	}
	@Test
	void testFromCelsiusFaherenheit2() throws Exception{
	    assertEquals(Converter.reScaleDouble((250000000*(9.0/5.0)+32.0)), Temperature.tempConverter("250000000", "Celsius", "Fahrenheit"));
	}
	@Test
	void testFromCelsiusKalvin2() throws Exception{
	    assertEquals(Converter.reScaleDouble(-0.0000025+273.15), Temperature.tempConverter("-0.0000025", "Celsius", "Kelvin"));
	}
	@Test
	void testFromCelsiusFaherenheit3() throws Exception{
	    assertEquals(Converter.reScaleDouble((0*(9.0/5.0)+32.0)), Temperature.tempConverter("0", "Celsius", "Fahrenheit"));
	}
	@Test
	void testFromCelsiusKalvin3() throws Exception{
	    assertEquals(Converter.reScaleDouble(-0+273.15), Temperature.tempConverter("-0", "Celsius", "Kelvin"));
	}
	@Test
	void testFromCelsiusFaherenheit4() throws Exception{
	    assertEquals(Converter.reScaleDouble((-17.77777777777778*(9.0/5.0)+32.0)), Temperature.tempConverter("-17.77777777777778", "Celsius", "Fahrenheit"));
	}
	@Test
	void testFromCelsiusKalvin4() throws Exception{
	    assertEquals(Converter.reScaleDouble(1.7976931348623157E308+273.15), Temperature.tempConverter("1.7976931348623157E308", "Celsius", "Kelvin"));
	}
	
	@Test
	void testFromInvalidFaherenheit0() throws Exception {
	    assertThrows(Exception.class, () -> Temperature.tempConverter("25", "Invalid", "Fahrenheit"));
	}
	@Test
	void testFromCelsiusInvalid() throws Exception{
	    assertThrows(Exception.class, () -> Temperature.tempConverter("25", "Celsius", "Invalid"));
	}
	
	@Test
	void testFromFaherenheitCelsius0() throws Exception{
	    assertEquals(Converter.reScaleDouble((25-32.0)*(5.0/9.0)), Temperature.tempConverter("25", "Fahrenheit", "Celsius"));
	}
	@Test
	void testFromFaherenheitKalvin0() throws Exception{
	    assertEquals(Converter.reScaleDouble((25-32.0)*(5.0/9.0)+273.15), Temperature.tempConverter("25", "Fahrenheit", "Kelvin"));
	}
	@Test
	void testFromFaherenheitCelsius1() throws Exception{
	    assertEquals(Converter.reScaleDouble((-25-32.0)*(5.0/9.0)), Temperature.tempConverter("-25", "Fahrenheit", "Celsius"));
	}
	@Test
	void testFromFaherenheitKalvin1() throws Exception{
	    assertEquals(Converter.reScaleDouble((-25-32.0)*(5.0/9.0)+273.15), Temperature.tempConverter("-25", "Fahrenheit", "Kelvin"));
	}
	@Test
	void testFromInvalidKalvin() throws Exception{
	    assertThrows(Exception.class, () -> Temperature.tempConverter("25", "Invalid", "Kelvin"));
	}
	@Test
	void testFromFahenheitInvalid() throws Exception{
	    assertThrows(Exception.class, () -> Temperature.tempConverter("25", "Fahrenheit", "Invalid"));
	}
	
	
	@Test
	void testFromKalvinCelsius0() throws Exception{
	    assertEquals(Converter.reScaleDouble(25-273.15), Temperature.tempConverter("25", "Kelvin", "Celsius"));
	}
	@Test
	void testFromKalvinFahenheit0() throws Exception{
	    assertEquals(Converter.reScaleDouble((25-273.15)*(9.0/5.0)+32.0), Temperature.tempConverter("25", "Kelvin", "Fahrenheit"));
	}
	@Test
	void testFromKalvinCelsius1() throws Exception{
	    assertEquals(Converter.reScaleDouble(-25-273.15), Temperature.tempConverter("-25", "Kelvin", "Celsius"));
	}
	@Test
	void testFromKalvinFahenheit1() throws Exception{
	    assertEquals(Converter.reScaleDouble((-25-273.15)*(9.0/5.0)+32.0), Temperature.tempConverter("-25", "Kelvin", "Fahrenheit"));
	}
	@Test
	void testFromKalvinInvalid() throws Exception{
	    assertThrows(Exception.class, () -> Temperature.tempConverter("25", "Kelvin", "Invalid"));
	}
	@Test
	void testFromInvalidKalvin1() throws Exception{
	    assertThrows(Exception.class, () -> Temperature.tempConverter("25", "Invalid", "Kelvin"));
	}
    @Test
    void testTempConverterExceptionInvalidInput() throws Exception {
        assertThrows(Exception.class, () ->
        	Temperature.tempConverter("abcd", "Invalid", "Kelvin")
        );
    }
	
}
