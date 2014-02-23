package converter.roman.test;

import junit.framework.Assert;
import org.junit.Test;
import converter.roman.RomanNumber;
import converter.roman.RomanSymbol;
import converter.Symbol;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * Created by nnm on 2/23/14.
 */
public class RomanPrintTest {
    @Test
    public void testPrintI() {
        final RomanNumber number = new RomanNumber(Arrays.<Symbol>asList(RomanSymbol.I));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        number.print(bos);
        Assert.assertEquals(new String(bos.toByteArray()), "I");
    }

    @Test
    public void testPrintMCMXCIX() {
        final RomanNumber number = new RomanNumber(Arrays.<Symbol>asList(RomanSymbol.M, RomanSymbol.CM, RomanSymbol.XC, RomanSymbol.IX));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        number.print(bos);
        Assert.assertEquals(new String(bos.toByteArray()), "MCMXCIX");
    }

    @Test
    public void testPrintMMCDCXXII() {
        final RomanNumber number = new RomanNumber(Arrays.<Symbol>asList(RomanSymbol.M, RomanSymbol.M, RomanSymbol.CD, RomanSymbol.C, RomanSymbol.X, RomanSymbol.X, RomanSymbol.I, RomanSymbol.I));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        number.print(bos);
        Assert.assertEquals(new String(bos.toByteArray()), "MMCDCXXII");
    }
}
