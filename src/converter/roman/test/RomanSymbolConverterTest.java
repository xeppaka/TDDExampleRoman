package converter.roman.test;

import junit.framework.Assert;
import org.junit.Test;
import converter.roman.RomanSymbol;
import converter.roman.RomanSymbolConverter;
import converter.SymbolConverter;

/**
 * Created by nnm on 2/23/14.
 */
public class RomanSymbolConverterTest {
    @Test
    public void testSymbol1() {
        SymbolConverter symbolConverter = new RomanSymbolConverter();
        Assert.assertEquals(RomanSymbol.I, symbolConverter.convert(1));
    }

    @Test
    public void testSymbol4() {
        SymbolConverter symbolConverter = new RomanSymbolConverter();
        Assert.assertEquals(RomanSymbol.IV, symbolConverter.convert(4));
    }

    @Test
    public void testSymbol5() {
        SymbolConverter symbolConverter = new RomanSymbolConverter();
        Assert.assertEquals(RomanSymbol.V, symbolConverter.convert(5));
    }

    @Test
    public void testSymbol9() {
        SymbolConverter symbolConverter = new RomanSymbolConverter();
        Assert.assertEquals(RomanSymbol.IX, symbolConverter.convert(9));
    }

    @Test
    public void testSymbol10() {
        SymbolConverter symbolConverter = new RomanSymbolConverter();
        Assert.assertEquals(RomanSymbol.X, symbolConverter.convert(10));
    }

    @Test
    public void testSymbol40() {
        SymbolConverter symbolConverter = new RomanSymbolConverter();
        Assert.assertEquals(RomanSymbol.XL, symbolConverter.convert(40));
    }

    @Test
    public void testSymbol50() {
        SymbolConverter symbolConverter = new RomanSymbolConverter();
        Assert.assertEquals(RomanSymbol.L, symbolConverter.convert(50));
    }

    @Test
    public void testSymbol90() {
        SymbolConverter symbolConverter = new RomanSymbolConverter();
        Assert.assertEquals(RomanSymbol.XC, symbolConverter.convert(90));
    }

    @Test
    public void testSymbol100() {
        SymbolConverter symbolConverter = new RomanSymbolConverter();
        Assert.assertEquals(RomanSymbol.C, symbolConverter.convert(100));
    }

    @Test
    public void testSymbol400() {
        SymbolConverter symbolConverter = new RomanSymbolConverter();
        Assert.assertEquals(RomanSymbol.CD, symbolConverter.convert(400));
    }

    @Test
    public void testSymbol500() {
        SymbolConverter symbolConverter = new RomanSymbolConverter();
        Assert.assertEquals(RomanSymbol.D, symbolConverter.convert(500));
    }

    @Test
    public void testSymbol900() {
        SymbolConverter symbolConverter = new RomanSymbolConverter();
        Assert.assertEquals(RomanSymbol.CM, symbolConverter.convert(900));
    }

    @Test
    public void testSymbol1000() {
        SymbolConverter symbolConverter = new RomanSymbolConverter();
        Assert.assertEquals(RomanSymbol.M, symbolConverter.convert(1000));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSymbolIAE0() {
        SymbolConverter symbolConverter = new RomanSymbolConverter();
        symbolConverter.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSymbolIAENegative() {
        SymbolConverter symbolConverter = new RomanSymbolConverter();
        symbolConverter.convert(-100);
    }
}
