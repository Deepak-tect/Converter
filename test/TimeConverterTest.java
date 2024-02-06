import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import Converter.Converter;
import Converter.Time;

public class TimeConverterTest {
	    @Test
    void tctest0001() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / 60.0), Time.timeConverter("1", "Seconds", "Minutes"));
    }

    @Test
    void tctest0002() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / 3600.0), Time.timeConverter("1", "Seconds", "Hours"));
    }

    @Test
    void tctest0003() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / 86400.0), Time.timeConverter("1", "Seconds", "Days"));
    }

    @Test
    void tctest0004() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / 604800.0), Time.timeConverter("1", "Seconds", "Weeks"));
    }

    @Test
    void tctest0005() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / 2.628e+6), Time.timeConverter("1", "Seconds", "Months"));
    }

    @Test
    void tctest0006() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / 3.154e+7), Time.timeConverter("1", "Seconds", "Years"));
    }

    @Test
    void tctest0007() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * 60.0), Time.timeConverter("1", "Minutes", "Seconds"));
    }

    @Test
    void tctest0008() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / 60.0), Time.timeConverter("1", "Minutes", "Hours"));
    }

    @Test
    void tctest0009() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / 1440.0), Time.timeConverter("1", "Minutes", "Days"));
    }   

    @Test
    void tctest0010() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / 10080.0), Time.timeConverter("1", "Minutes", "Weeks"));
    }

    @Test
    void tctest0011() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / 43800.0), Time.timeConverter("1", "Minutes", "Months"));
    }

    @Test
    void tctest0012() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / 525600.0), Time.timeConverter("1", "Minutes", "Years"));
    }

    @Test
    void tctest0013() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * 3600.0), Time.timeConverter("1", "Hours", "Seconds"));
    }

    @Test
    void tctest0014() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * 60.0), Time.timeConverter("1", "Hours", "Minutes"));
    }

    @Test
    void tctest0015() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / 24.0), Time.timeConverter("1", "Hours", "Days"));
    }

    @Test
    void tctest0016() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / 168.0), Time.timeConverter("1", "Hours", "Weeks"));
    }

    @Test
    void tctest0017() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / 730.0), Time.timeConverter("1", "Hours", "Months"));
    }

    @Test
    void tctest0018() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / 8760.0), Time.timeConverter("1", "Hours", "Years"));
    }

    @Test
    void tctest0019() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * 86400.0), Time.timeConverter("1", "Days", "Seconds"));
    }

    @Test
    void tctest0020() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * 1440.0), Time.timeConverter("1", "Days", "Minutes"));
    }

    @Test
    void tctest0021() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * 24.0), Time.timeConverter("1", "Days", "Hours"));
    }

    @Test
    void tctest0022() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / 7.0), Time.timeConverter("1", "Days", "Weeks"));
    }

    @Test
    void tctest0023() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / 30.417), Time.timeConverter("1", "Days", "Months"));
    }

    @Test
    void tctest0024() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / 365.0), Time.timeConverter("1", "Days", "Years"));
    }

    @Test
    void tctest0025() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * 604800.0), Time.timeConverter("1", "Weeks", "Seconds"));
    }

    @Test
    void tctest0026() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * 10080.0), Time.timeConverter("1", "Weeks", "Minutes"));
    }

    @Test
    void tctest0027() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * 168.0), Time.timeConverter("1", "Weeks", "Hours"));
    }

    @Test
    void tctest028() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * 7.0), Time.timeConverter("1", "Weeks", "Days"));
    }

    @Test
    void tctest0029() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / 4.345), Time.timeConverter("1", "Weeks", "Months"));
    }

    @Test
    void tctest0030() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / 52.143), Time.timeConverter("1", "Weeks", "Years"));
    }

    @Test
    void tctest0031() throws Exception{
    assertEquals("2628000", Time.timeConverter("1", "Months", "Seconds"));
    }

    @Test
    void tctest0032() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * 43800.0), Time.timeConverter("1", "Months", "Minutes"));
    }

    @Test
    void tctest0033() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * 730.0), Time.timeConverter("1", "Months", "Hours"));
    }

    @Test
    void tctest0034() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * 30.417), Time.timeConverter("1", "Months", "Days"));
    }

    @Test
    void tctest0035() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * 4.345), Time.timeConverter("1", "Months", "Weeks"));
    }

    @Test
    void tctest0036() throws Exception{
    assertEquals(Converter.reScaleDouble(1 / 12.0), Time.timeConverter("1", "Months", "Years"));
    }

    @Test
    void tctest0037() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * 3.154e+7), Time.timeConverter("1", "Years", "Seconds"));
    }

    @Test
    void tctest0038() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * 525600.0), Time.timeConverter("1", "Years", "Minutes"));
    }

    @Test
    void tctest0039() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * 8760.0), Time.timeConverter("1", "Years", "Hours"));
    }

    @Test
    void tctest0040() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * 365.0), Time.timeConverter("1", "Years", "Days"));
    }

    @Test
    void tctest0041() throws Exception{
    assertEquals("52.143", Time.timeConverter("1", "Years", "Weeks"));
    }

    @Test
    void tctest0402() throws Exception{
    assertEquals(Converter.reScaleDouble(1 * 12.0), Time.timeConverter("1", "Years", "Months"));
    }

    @Test
    void testTimeConverterExceptionInvalidInput() throws Exception {
        assertThrows(Exception.class, () ->
            Time.timeConverter("abc", "Years", "Months")
        );
    }

}
