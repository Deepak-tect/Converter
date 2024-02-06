import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import Converter.Base10;
import Converter.Converter;
public class Base10ConverterTest {
	
    @Test
    void dc10test001() throws Exception{
    assertEquals(Converter.reScaleDouble(0.125), Base10.dataConverterBase10("1", "Bit", "Byte"));
    }

    @Test
    void dc10test002() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(20,3)), Base10.dataConverterBase10("1", "Bit", "Kilobyte"));
    }

    @Test
    void dc10test003() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(200, 3)), Base10.dataConverterBase10("1", "Bit", "Megabyte"));
    }

    @Test
    void dc10test004() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2000, 3)), Base10.dataConverterBase10("1", "Bit", "Gigabyte"));
    }

    @Test
    void dc10test005() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(20000, 3)), Base10.dataConverterBase10("1", "Bit", "Terabyte"));
    }

    @Test
    void dc10test006() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(200000, 3)), Base10.dataConverterBase10("1", "Bit", "Petabyte"));
    }

    @Test
    void dc10test007() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(2000000, 3)), Base10.dataConverterBase10("1", "Bit", "Exabyte"));
    }

    @Test
    void dc10test008() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(20000000, 3)), Base10.dataConverterBase10("1", "Bit", "Zettabyte"));
    }

    @Test
    void dc10test009() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(200000000, 3)), Base10.dataConverterBase10("1", "Bit", "Yottabyte"));
    }

    @Test
    void dc10test010() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * 8), Base10.dataConverterBase10("1", "Byte", "Bit"));
    }

    @Test
    void dc10test011() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 3)), Base10.dataConverterBase10("1", "Byte", "Kilobyte"));
    }

    @Test
    void dc10test012() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 6)), Base10.dataConverterBase10("1", "Byte", "Megabyte"));
    }

    @Test
    void dc10test013() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 9)), Base10.dataConverterBase10("1", "Byte", "Gigabyte"));
    }

    @Test
    void dc10test014() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 12)), Base10.dataConverterBase10("1", "Byte", "Terabyte"));
    }

    @Test
    void dc10test015() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 15)), Base10.dataConverterBase10("1", "Byte", "Petabyte"));
    }

    @Test
    void dc10test016() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 18)), Base10.dataConverterBase10("1", "Byte", "Exabyte"));
    }

    @Test
    void dc10test017() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 21)), Base10.dataConverterBase10("1", "Byte", "Zettabyte"));
    }

    @Test
    void dc10test018() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 24)), Base10.dataConverterBase10("1", "Byte", "Yottabyte"));
    }

    @Test
    void dc10test019() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(20, 3)), Base10.dataConverterBase10("1", "Kilobyte", "Bit"));
    }

    @Test
    void dc10test020() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 3)), Base10.dataConverterBase10("1", "Kilobyte", "Byte"));
    }

    @Test
    void dc10test021() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 3)), Base10.dataConverterBase10("1", "Kilobyte", "Megabyte"));
    }

    @Test
    void dc10test022() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 6)), Base10.dataConverterBase10("1", "Kilobyte", "Gigabyte"));
    }

    @Test
    void dc10test023() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 9)), Base10.dataConverterBase10("1", "Kilobyte", "Terabyte"));
    }

    @Test
    void dc10test024() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 12)), Base10.dataConverterBase10("1", "Kilobyte", "Petabyte"));
    }

    @Test
    void dc10test025() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 15)), Base10.dataConverterBase10("1", "Kilobyte", "Exabyte"));
    }

    @Test
    void dc10test026() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 18)), Base10.dataConverterBase10("1", "Kilobyte", "Zettabyte"));
    }

    @Test
    void dc10test027() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 21)), Base10.dataConverterBase10("1", "Kilobyte", "Yottabyte"));
    }

    @Test
    void dc10test028() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(200, 3)), Base10.dataConverterBase10("1", "Megabyte", "Bit"));
    }

    @Test
    void dc10test029() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 6)), Base10.dataConverterBase10("1", "Megabyte", "Byte"));
    }

    @Test
    void dc10test030() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 3)), Base10.dataConverterBase10("1", "Megabyte", "Kilobyte"));
    }

    @Test
    void dc10test031() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 3)), Base10.dataConverterBase10("1", "Megabyte", "Gigabyte"));
    }

    @Test
    void dc10test032() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 6)), Base10.dataConverterBase10("1", "Megabyte", "Terabyte"));
    }

    @Test
    void dc10test033() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 9)), Base10.dataConverterBase10("1", "Megabyte", "Petabyte"));
    }

    @Test
    void dc10test034() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 12)), Base10.dataConverterBase10("1", "Megabyte", "Exabyte"));
    }

    @Test
    void dc10test035() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 15)), Base10.dataConverterBase10("1", "Megabyte", "Zettabyte"));
    }

    @Test
    void dc10test036() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 18)), Base10.dataConverterBase10("1", "Megabyte", "Yottabyte"));
    }

    @Test
    void dc10test037() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2000, 3)), Base10.dataConverterBase10("1", "Gigabyte", "Bit"));
    }

    @Test
    void dc10test038() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 8)), Base10.dataConverterBase10("1", "Gigabyte", "Byte"));
    }

    @Test
    void dc10test039() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 6)), Base10.dataConverterBase10("1", "Gigabyte", "Kilobyte"));
    }

    @Test
    void dc10test040() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 3)), Base10.dataConverterBase10("1", "Gigabyte", "Megabyte"));
    }

    @Test
    void dc10test041() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 3)), Base10.dataConverterBase10("1", "Gigabyte", "Terabyte"));
    }

    @Test
    void dc10test042() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 6)), Base10.dataConverterBase10("1", "Gigabyte", "Petabyte"));
    }

    @Test
    void dc10test043() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 9)), Base10.dataConverterBase10("1", "Gigabyte", "Exabyte"));
    }

    @Test
    void dc10test044() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 12)), Base10.dataConverterBase10("1", "Gigabyte", "Zettabyte"));
    }

    @Test
    void dc10test045() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 15)), Base10.dataConverterBase10("1", "Gigabyte", "Yottabyte"));
    }

    @Test
    void dc10test046() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(20000, 3)), Base10.dataConverterBase10("1", "Terabyte", "Bit"));
    }

    @Test
    void dc10test047() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 12)), Base10.dataConverterBase10("1", "Terabyte", "Byte"));
    }

    @Test
    void dc10test048() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 9)), Base10.dataConverterBase10("1", "Terabyte", "Kilobyte"));
    }

    @Test
    void dc10test049() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 6)), Base10.dataConverterBase10("1", "Terabyte", "Megabyte"));
    }

    @Test
    void dc10test050() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 3)), Base10.dataConverterBase10("1", "Terabyte", "Gigabyte"));
    }

    @Test
    void dc10test051() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 3)), Base10.dataConverterBase10("1", "Terabyte", "Petabyte"));
    }

    @Test
    void dc10test052() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 6)), Base10.dataConverterBase10("1", "Terabyte", "Exabyte"));
    }

    @Test
    void dc10test053() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 9)), Base10.dataConverterBase10("1", "Terabyte", "Zettabyte"));
    }

    @Test
    void dc10test054() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 12)), Base10.dataConverterBase10("1", "Terabyte", "Yottabyte"));
    }

    @Test
    void dc10test055() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(200000, 3)), Base10.dataConverterBase10("1", "Petabyte", "Bit"));
    }

    @Test
    void dc10test056() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 15)), Base10.dataConverterBase10("1", "Petabyte", "Byte"));
    }

    @Test
    void dc10test057() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 12)), Base10.dataConverterBase10("1", "Petabyte", "Kilobyte"));
    }

    @Test
    void dc10test058() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 9)), Base10.dataConverterBase10("1", "Petabyte", "Megabyte"));
    }

    @Test
    void dc10test059() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 6)), Base10.dataConverterBase10("1", "Petabyte", "Gigabyte"));
    }

    @Test
    void dc10test060() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 3)), Base10.dataConverterBase10("1", "Petabyte", "Terabyte"));
    }

    @Test
    void dc10test061() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 3)), Base10.dataConverterBase10("1", "Petabyte", "Exabyte"));
    }

    @Test
    void dc10test062() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 6)), Base10.dataConverterBase10("1", "Petabyte", "Zettabyte"));
    }

    @Test
    void dc10test063() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 9)), Base10.dataConverterBase10("1", "Petabyte", "Yottabyte"));
    }

    @Test
    void dc10test064() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(2000000, 3)), Base10.dataConverterBase10("1", "Exabyte", "Bit"));
    }

    @Test
    void dc10test065() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 18)), Base10.dataConverterBase10("1", "Exabyte", "Byte"));
    }

    @Test
    void dc10test066() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 15)), Base10.dataConverterBase10("1", "Exabyte", "Kilobyte"));
    }

    @Test
    void dc10test067() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 12)), Base10.dataConverterBase10("1", "Exabyte", "Megabyte"));
    }

    @Test
    void dc10test068() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 9)), Base10.dataConverterBase10("1", "Exabyte", "Gigabyte"));
    }

    @Test
    void dc10test069() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 6)), Base10.dataConverterBase10("1", "Exabyte", "Terabyte"));
    }

    @Test
    void dc10test070() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 3)), Base10.dataConverterBase10("1", "Exabyte", "Petabyte"));
    }

    @Test
    void dc10test071() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 3)), Base10.dataConverterBase10("1", "Exabyte", "Zettabyte"));
    }

    @Test
    void dc10test072() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 6)), Base10.dataConverterBase10("1", "Exabyte", "Yottabyte"));
    }

    @Test
    void dc10test073() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(20000000, 3)), Base10.dataConverterBase10("1", "Zettabyte", "Bit"));
    }

    @Test
    void dc10test074() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 21)), Base10.dataConverterBase10("1", "Zettabyte", "Byte"));
    }

    @Test
    void dc10test075() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 18)), Base10.dataConverterBase10("1", "Zettabyte", "Kilobyte"));
    }

    @Test
    void dc10test076() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 15)), Base10.dataConverterBase10("1", "Zettabyte", "Megabyte"));
    }

    @Test
    void dc10test077() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 12)), Base10.dataConverterBase10("1", "Zettabyte", "Gigabyte"));
    }

    @Test
    void dc10test078() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 9)), Base10.dataConverterBase10("1", "Zettabyte", "Terabyte"));
    }

    @Test
    void dc10test079() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 6)), Base10.dataConverterBase10("1", "Zettabyte", "Petabyte"));
    }

    @Test
    void dc10test080() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 3)), Base10.dataConverterBase10("1", "Zettabyte", "Exabyte"));
    }

    @Test
    void dc10test081() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / Math.pow(10, 3)), Base10.dataConverterBase10("1", "Zettabyte", "Yottabyte"));
    }

    @Test
    void dc10test082() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(200000000, 3)), Base10.dataConverterBase10("1", "Yottabyte", "Bit"));
    }

    @Test
    void dc10test083() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 24)), Base10.dataConverterBase10("1", "Yottabyte", "Byte"));
    }

    @Test
    void dc10test084() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 21)), Base10.dataConverterBase10("1", "Yottabyte", "Kilobyte"));
    }

    @Test
    void dc10test085() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 18)), Base10.dataConverterBase10("1", "Yottabyte", "Megabyte"));
    }

    @Test
    void dc10test086() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 15)), Base10.dataConverterBase10("1", "Yottabyte", "Gigabyte"));
    }

    @Test
    void dc10test087() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 12)), Base10.dataConverterBase10("1", "Yottabyte", "Terabyte"));
    }

    @Test
    void dc10test088() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 9)), Base10.dataConverterBase10("1", "Yottabyte", "Petabyte"));
    }

    @Test
    void dc10test089() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 6)), Base10.dataConverterBase10("1", "Yottabyte", "Exabyte"));
    }

    @Test
    void dc10test090() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * Math.pow(10, 3)), Base10.dataConverterBase10("1", "Yottabyte", "Zettabyte"));
    }
    
    @Test
    void testBase10ConverterExceptionInvalidInput() throws Exception {
        assertThrows(Exception.class, () ->
        Base10.dataConverterBase10("a", "Yottabyte", "Zettabyte")
        );
    }
}
