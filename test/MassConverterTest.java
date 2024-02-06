import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import Converter.Mass;

public class MassConverterTest {

	@Test
	void testmassConverterException001() throws Exception {
		assertThrows(Exception.class, () -> Mass.massConverter("invalidValue", "kg", "lb"));

	}
 	@Test
	void testmassConverter011() throws Exception {
	    assertEquals("6.613859999999999", Mass.massConverter("3", "kg", "lb"));
	}
	@Test
	void testmassConverter012() throws Exception {
	    assertEquals("105.822", Mass.massConverter("3", "kg", "oz"));
	}
	@Test
	void testmassConverter013() throws Exception {
	    assertEquals("0.003", Mass.massConverter("3", "kg", "t"));
	}

	@Test
	void testmassConverter021() throws Exception {
	    assertEquals("0.08504847763225037", Mass.massConverter("3", "oz", "kg"));
	}
	@Test
	void testmassConverter022() throws Exception {
	    assertEquals("0.1875", Mass.massConverter("3", "oz", "lb"));
	}
	@Test
	void testmassConverter023() throws Exception {
	    assertEquals("8.504847763225038E-5", Mass.massConverter("3", "oz", "t"));
	}

	@Test
	void testmassConverter031() throws Exception {
	    assertEquals("3000.0", Mass.massConverter("3", "t", "kg"));
	}
	@Test
	void testmassConverter032() throws Exception {
	    assertEquals("6613.86", Mass.massConverter("3", "t", "lb"));
	}
	@Test
	void testmassConverter033() throws Exception {
	    assertEquals("105822.0", Mass.massConverter("3", "t", "oz"));
	}

	@Test
	void testmassConverter041() throws Exception {
	    assertEquals("1.3607787283069193", Mass.massConverter("3", "lb", "kg"));
	}
	@Test
	void testmassConverter042() throws Exception {
	    assertEquals("48.0", Mass.massConverter("3", "lb", "oz"));
	}
	@Test
	void testmassConverter043() throws Exception {
	    assertEquals("0.001360778728306919", Mass.massConverter("3", "lb", "t"));
	}
	
//  ------------------- base mass conversions------------------

	@Test
	void testConvertKilograms011() throws Exception {
	    assertEquals(6.613859999999999, Mass.convertKilograms(3, "lb"));
	}
	@Test
	void testConvertKilograms012() throws Exception {
	    assertEquals(105.822, Mass.convertKilograms(3, "oz"));
	}
	@Test
	void testConvertKilograms013() throws Exception {
	    assertEquals(0.003, Mass.convertKilograms(3, "t"));
	}
	@Test
	void testConvertKilograms014() throws Exception {
	    assertEquals(3.0, Mass.convertKilograms(3, "kg"));
	}

	@Test
	void testConvertOunces021() throws Exception {
	    assertEquals(0.08504847763225037, Mass.convertOunces(3, "kg"));
	}
	@Test
	void testConvertOunces022() throws Exception {
	    assertEquals(0.1875, Mass.convertOunces(3, "lb"));
	}
	@Test
	void testConvertOunces023() throws Exception {
	    assertEquals(8.504847763225038E-5, Mass.convertOunces(3, "t"));
	}
	@Test
	void testConvertOunces024() throws Exception {
	    assertEquals(3.0, Mass.convertOunces(3, "oz"));
	}

	@Test
	void testConvertMetricTons031() throws Exception {
	    assertEquals(3000.0, Mass.convertMetricTons(3, "kg"));
	}
	@Test
	void testConvertMetricTons032() throws Exception {
	    assertEquals(6613.86, Mass.convertMetricTons(3, "lb"));
	}
	@Test
	void testConvertMetricTons033() throws Exception {
	    assertEquals(105822.0, Mass.convertMetricTons(3, "oz"));
	}
	@Test
	void testConvertMetricTons034() throws Exception {
	    assertEquals(3.0, Mass.convertMetricTons(3, "t"));
	}

	@Test
	void testConvertPounds041() throws Exception {
	    assertEquals(1.3607787283069193, Mass.convertPounds(3, "kg"));
	}
	@Test
	void testConvertPounds042() throws Exception {
	    assertEquals(48.0, Mass.convertPounds(3, "oz"));
	}
	@Test
	void testConvertPounds043() throws Exception {
	    assertEquals(0.001360778728306919, Mass.convertPounds(3, "t"));
	}
	@Test
	void testConvertPounds044() throws Exception {
	    assertEquals(3, Mass.convertPounds(3, "lb"));
	}
}
