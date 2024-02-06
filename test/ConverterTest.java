import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Converter.Converter;

public class ConverterTest {
	
	@Test
	void rsdtest001() {
		assertEquals("298.15", Converter.reScaleDouble(25+273.15));
	}
}
