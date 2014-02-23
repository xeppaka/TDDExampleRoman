package converter.roman.test;

import converter.NumberConverter;
import converter.Symbol;
import converter.roman.RomanNumber;
import converter.roman.RomanNumberConverter;
import org.junit.Assert;
import org.junit.Test;
import converter.roman.RomanSymbol;

import java.util.Arrays;

/**
 * Created by nnm on 2/23/14.
 */
public class RomanNumberConverterTest {
    @Test(expected = IllegalArgumentException.class)
    public void testIAE0() {
        NumberConverter numberConverter = new RomanNumberConverter();
        numberConverter.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIAENegative() {
        NumberConverter numberConverter = new RomanNumberConverter();
        numberConverter.convert(-100);
    }

    @Test
    public void test1() {
        NumberConverter numberConverter = new RomanNumberConverter();
        Assert.assertEquals(new RomanNumber(Arrays.<Symbol>asList(RomanSymbol.I)), numberConverter.convert(1));
    }

    @Test
    public void test2() {
        NumberConverter numberConverter = new RomanNumberConverter();
        Assert.assertEquals(new RomanNumber(Arrays.<Symbol>asList(RomanSymbol.I, RomanSymbol.I)), numberConverter.convert(2));
    }

    @Test
    public void test3() {
        NumberConverter numberConverter = new RomanNumberConverter();
        Assert.assertEquals(numberConverter.convert(3), new RomanNumber(Arrays.<Symbol>asList(RomanSymbol.I, RomanSymbol.I, RomanSymbol.I)));
    }

    @Test
    public void test4() {
        NumberConverter numberConverter = new RomanNumberConverter();
        Assert.assertEquals(numberConverter.convert(4), new RomanNumber(Arrays.<Symbol>asList(RomanSymbol.IV)));
    }

    @Test
    public void test5() {
        NumberConverter numberConverter = new RomanNumberConverter();
        Assert.assertEquals(numberConverter.convert(5), new RomanNumber(Arrays.<Symbol>asList(RomanSymbol.V)));
    }

    @Test
    public void test1999() {
        NumberConverter numberConverter = new RomanNumberConverter();
        Assert.assertEquals(numberConverter.convert(1999), new RomanNumber(Arrays.<Symbol>asList(RomanSymbol.M, RomanSymbol.CM, RomanSymbol.XC, RomanSymbol.IX)));
    }

    @Test
    public void test1954() {
        NumberConverter numberConverter = new RomanNumberConverter();
        Assert.assertEquals(numberConverter.convert(1954), new RomanNumber(Arrays.<Symbol>asList(RomanSymbol.M, RomanSymbol.CM, RomanSymbol.L, RomanSymbol.IV)));
    }

    @Test
    public void test1990() {
        NumberConverter numberConverter = new RomanNumberConverter();
        Assert.assertEquals(numberConverter.convert(1990), new RomanNumber(Arrays.<Symbol>asList(RomanSymbol.M, RomanSymbol.CM, RomanSymbol.XC)));
    }

    @Test
    public void test2014() {
        NumberConverter numberConverter = new RomanNumberConverter();
        Assert.assertEquals(numberConverter.convert(2014), new RomanNumber(Arrays.<Symbol>asList(RomanSymbol.M, RomanSymbol.M, RomanSymbol.X, RomanSymbol.IV)));
    }
}
