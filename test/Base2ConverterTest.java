import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import Converter.Base2;
import Converter.Converter;

public class Base2ConverterTest {
	@Test
    void dc2test001() throws Exception{
    assertEquals(Converter.reScaleDouble(0.125), Base2.dataConverterBase2("1", "Bit", "Byte"));
    }

    @Test
    void dc2test002() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 13)), Base2.dataConverterBase2("1", "Bit", "Kilobyte"));
    }

    @Test
    void dc2test003() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 23)), Base2.dataConverterBase2("1", "Bit", "Megabyte"));
    }

    @Test
    void dc2test004() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 33)), Base2.dataConverterBase2("1", "Bit", "Gigabyte"));
    }

    @Test
    void dc2test005() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 43)), Base2.dataConverterBase2("1", "Bit", "Terabyte"));
    }

    @Test
    void dc2test006() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 53)), Base2.dataConverterBase2("1", "Bit", "Petabyte"));
    }

    @Test
    void dc2test007() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 63)), Base2.dataConverterBase2("1", "Bit", "Exabyte"));
    }

    @Test
    void dc2test008() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 73)), Base2.dataConverterBase2("1", "Bit", "Zettabyte"));
    }

    @Test
    void dc2test009() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 83)), Base2.dataConverterBase2("1", "Bit", "Yottabyte"));
    }

    @Test
    void dc2test010() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * 8), Base2.dataConverterBase2("1", "Byte", "Bit"));
    }

    @Test
    void dc2test011() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 10)), Base2.dataConverterBase2("1", "Byte", "Kilobyte"));
    }

    @Test
    void dc2test012() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 20)), Base2.dataConverterBase2("1", "Byte", "Megabyte"));
    }

    @Test
    void dc2test013() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 30)), Base2.dataConverterBase2("1", "Byte", "Gigabyte"));
    }

    @Test
    void dc2test014() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 40)), Base2.dataConverterBase2("1", "Byte", "Terabyte"));
    }

    @Test
    void dc2test015() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 50)), Base2.dataConverterBase2("1", "Byte", "Petabyte"));
    }

    @Test
    void dc2test016() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 60)), Base2.dataConverterBase2("1", "Byte", "Exabyte"));
    }

    @Test
    void dc2test017() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 70)), Base2.dataConverterBase2("1", "Byte", "Zettabyte"));
    }

    @Test
    void dc2test018() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 80)), Base2.dataConverterBase2("1", "Byte", "Yottabyte"));
    }

    @Test
    void dc2test019() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 13)), Base2.dataConverterBase2("1", "Kilobyte", "Bit"));
    }

    @Test
    void dc2test020() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 10)), Base2.dataConverterBase2("1", "Kilobyte", "Byte"));
    }

    @Test
    void dc2test021() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 10)), Base2.dataConverterBase2("1", "Kilobyte", "Megabyte"));
    }

    @Test
    void dc2test022() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 20)), Base2.dataConverterBase2("1", "Kilobyte", "Gigabyte"));
    }

    @Test
    void dc2test023() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 30)), Base2.dataConverterBase2("1", "Kilobyte", "Terabyte"));
    }

    @Test
    void dc2test024() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 40)), Base2.dataConverterBase2("1", "Kilobyte", "Petabyte"));
    }

    @Test
    void dc2test025() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 50)), Base2.dataConverterBase2("1", "Kilobyte", "Exabyte"));
    }

    @Test
    void dc2test026() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 60)), Base2.dataConverterBase2("1", "Kilobyte", "Zettabyte"));
    }

    @Test
    void dc2test027() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 70)), Base2.dataConverterBase2("1", "Kilobyte", "Yottabyte"));
    }

    @Test
    void dc2test028() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 23)), Base2.dataConverterBase2("1", "Megabyte", "Bit"));
    }

    @Test
    void dc2test029() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 20)), Base2.dataConverterBase2("1", "Megabyte", "Byte"));
    }

    @Test
    void dc2test030() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 10)), Base2.dataConverterBase2("1", "Megabyte", "Kilobyte"));
    }

    @Test
    void dc2test031() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 10)), Base2.dataConverterBase2("1", "Megabyte", "Gigabyte"));
    }

    @Test
    void dc2test032() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 20)), Base2.dataConverterBase2("1", "Megabyte", "Terabyte"));
    }

    @Test
    void dc2test033() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 30)), Base2.dataConverterBase2("1", "Megabyte", "Petabyte"));
    }

    @Test
    void dc2test034() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 40)), Base2.dataConverterBase2("1", "Megabyte", "Exabyte"));
    }

    @Test
    void dc2test035() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 50)), Base2.dataConverterBase2("1", "Megabyte", "Zettabyte"));
    }

    @Test
    void dc2test036() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 60)), Base2.dataConverterBase2("1", "Megabyte", "Yottabyte"));
    }

    @Test
    void dc2test037() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 33)), Base2.dataConverterBase2("1", "Gigabyte", "Bit"));
    }

    @Test
    void dc2test038() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 30)), Base2.dataConverterBase2("1", "Gigabyte", "Byte"));
    }

    @Test
    void dc2test039() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 20)), Base2.dataConverterBase2("1", "Gigabyte", "Kilobyte"));
    }

    @Test
    void dc2test040() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 10)), Base2.dataConverterBase2("1", "Gigabyte", "Megabyte"));
    }

    @Test
    void dc2test041() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 10)), Base2.dataConverterBase2("1", "Gigabyte", "Terabyte"));
    }

    @Test
    void dc2test042() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 20)), Base2.dataConverterBase2("1", "Gigabyte", "Petabyte"));
    }

    @Test
    void dc2test043() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 30)), Base2.dataConverterBase2("1", "Gigabyte", "Exabyte"));
    }

    @Test
    void dc2test044() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 40)), Base2.dataConverterBase2("1", "Gigabyte", "Zettabyte"));
    }

    @Test
    void dc2test045() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 50)), Base2.dataConverterBase2("1", "Gigabyte", "Yottabyte"));
    }

    @Test
    void dc2test046() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 43)), Base2.dataConverterBase2("1", "Terabyte", "Bit"));
    }

    @Test
    void dc2test047() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 40)), Base2.dataConverterBase2("1", "Terabyte", "Byte"));
    }

    @Test
    void dc2test048() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 30)), Base2.dataConverterBase2("1", "Terabyte", "Kilobyte"));
    }

    @Test
    void dc2test049() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 20)), Base2.dataConverterBase2("1", "Terabyte", "Megabyte"));
    }

    @Test
    void dc2test050() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 10)), Base2.dataConverterBase2("1", "Terabyte", "Gigabyte"));
    }

    @Test
    void dc2test051() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 10)), Base2.dataConverterBase2("1", "Terabyte", "Petabyte"));
    }

    @Test
    void dc2test052() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 20)), Base2.dataConverterBase2("1", "Terabyte", "Exabyte"));
    }

    @Test
    void dc2test053() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 30)), Base2.dataConverterBase2("1", "Terabyte", "Zettabyte"));
    }

    @Test
    void dc2test054() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 40)), Base2.dataConverterBase2("1", "Terabyte", "Yottabyte"));
    }

    @Test
    void dc2test055() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 53)), Base2.dataConverterBase2("1", "Petabyte", "Bit"));
    }

    @Test
    void dc2test056() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 50)), Base2.dataConverterBase2("1", "Petabyte", "Byte"));
    }

    @Test
    void dc2test057() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 40)), Base2.dataConverterBase2("1", "Petabyte", "Kilobyte"));
    }

    @Test
    void dc2test058() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 30)), Base2.dataConverterBase2("1", "Petabyte", "Megabyte"));
    }

    @Test
    void dc2test059() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 20)), Base2.dataConverterBase2("1", "Petabyte", "Gigabyte"));
    }

    @Test
    void dc2test060() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 10)), Base2.dataConverterBase2("1", "Petabyte", "Terabyte"));
    }

    @Test
    void dc2test061() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 10)), Base2.dataConverterBase2("1", "Petabyte", "Exabyte"));
    }

    @Test
    void dc2test062() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 20)), Base2.dataConverterBase2("1", "Petabyte", "Zettabyte"));
    }

    @Test
    void dc2test063() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 30)), Base2.dataConverterBase2("1", "Petabyte", "Yottabyte"));
    }

    @Test
    void dc2test064() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 63)), Base2.dataConverterBase2("1", "Exabyte", "Bit"));
    }

    @Test
    void dc2test065() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 60)), Base2.dataConverterBase2("1", "Exabyte", "Byte"));
    }

    @Test
    void dc2test066() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 50)), Base2.dataConverterBase2("1", "Exabyte", "Kilobyte"));
    }

    @Test
    void dc2test067() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 40)), Base2.dataConverterBase2("1", "Exabyte", "Megabyte"));
    }

    @Test
    void dc2test068() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 30)), Base2.dataConverterBase2("1", "Exabyte", "Gigabyte"));
    }

    @Test
    void dc2test069() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 20)), Base2.dataConverterBase2("1", "Exabyte", "Terabyte"));
    }

    @Test
    void dc2test070() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 10)), Base2.dataConverterBase2("1", "Exabyte", "Petabyte"));
    }

    @Test
    void dc2test071() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 10)), Base2.dataConverterBase2("1", "Exabyte", "Zettabyte"));
    }

    @Test
    void dc2test072() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 20)), Base2.dataConverterBase2("1", "Exabyte", "Yottabyte"));
    }

    @Test
    void dc2test073() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 73)), Base2.dataConverterBase2("1", "Zettabyte", "Bit"));
    }

    @Test
    void dc2test074() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 70)), Base2.dataConverterBase2("1", "Zettabyte", "Byte"));
    }

    @Test
    void dc2test075() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 60)), Base2.dataConverterBase2("1", "Zettabyte", "Kilobyte"));
    }

    @Test
    void dc2test076() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 50)), Base2.dataConverterBase2("1", "Zettabyte", "Megabyte"));
    }

    @Test
    void dc2test077() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 40)), Base2.dataConverterBase2("1", "Zettabyte", "Gigabyte"));
    }

    @Test
    void dc2test078() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 30)), Base2.dataConverterBase2("1", "Zettabyte", "Terabyte"));
    }

    @Test
    void dc2test079() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 20)), Base2.dataConverterBase2("1", "Zettabyte", "Petabyte"));
    }

    @Test
    void dc2test080() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 10)), Base2.dataConverterBase2("1", "Zettabyte", "Exabyte"));
    }

    @Test
    void dc2test081() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2, 10)), Base2.dataConverterBase2("1", "Zettabyte", "Yottabyte"));
    }

    @Test
    void dc2test082() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 83)), Base2.dataConverterBase2("1", "Yottabyte", "Bit"));
    }

    @Test
    void dc2test083() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 80)), Base2.dataConverterBase2("1", "Yottabyte", "Byte"));
    }

    @Test
    void dc2test084() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 70)), Base2.dataConverterBase2("1", "Yottabyte", "Kilobyte"));
    }

    @Test
    void dc2test085() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 60)), Base2.dataConverterBase2("1", "Yottabyte", "Megabyte"));
    }

    @Test
    void dc2test086() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 50)), Base2.dataConverterBase2("1", "Yottabyte", "Gigabyte"));
    }

    @Test
    void dc2test087() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 40)), Base2.dataConverterBase2("1", "Yottabyte", "Terabyte"));
    }

    @Test
    void dc2test088() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 30)), Base2.dataConverterBase2("1", "Yottabyte", "Petabyte"));
    }

    @Test
    void dc2test089() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 20)), Base2.dataConverterBase2("1", "Yottabyte", "Exabyte"));
    }

    @Test
    void dc2test090() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2, 10)), Base2.dataConverterBase2("1", "Yottabyte", "Zettabyte"));
    }
    
    @Test
    void testBase2ConverterExceptionInvalidInput() throws Exception {
        assertThrows(Exception.class, () ->
        Base2.dataConverterBase2("a", "Yottabyte", "Zettabyte")
        );
    }
}
