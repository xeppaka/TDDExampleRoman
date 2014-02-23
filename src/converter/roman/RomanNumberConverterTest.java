package converter.roman;

import converter.Symbol;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by nnm on 2/23/14.
 */
public class RomanNumberConverterTest {
    @Test
    public void testExtractBiggestRoman1() {
        RomanNumberConverter numberConverter = new RomanNumberConverter();
        Symbol biggestRoman = numberConverter.extractBiggestRoman(6);

        Assert.assertEquals(RomanSymbol.V, biggestRoman);
    }

    @Test
    public void testExtractBiggestRoman2() {
        RomanNumberConverter numberConverter = new RomanNumberConverter();
        Symbol biggestRoman = numberConverter.extractBiggestRoman(12);

        Assert.assertEquals(RomanSymbol.X, biggestRoman);
    }

    @Test
    public void testExtractBiggestRoman3() {
        RomanNumberConverter numberConverter = new RomanNumberConverter();
        Symbol biggestRoman = numberConverter.extractBiggestRoman(1445);

        Assert.assertEquals(RomanSymbol.M, biggestRoman);
    }

    @Test
    public void testExtractBiggestRoman4() {
        RomanNumberConverter numberConverter = new RomanNumberConverter();
        Symbol biggestRoman = numberConverter.extractBiggestRoman(434);

        Assert.assertEquals(RomanSymbol.CD, biggestRoman);
    }

    @Test
    public void testExtractBiggestRoman5() {
        RomanNumberConverter numberConverter = new RomanNumberConverter();
        Symbol biggestRoman = numberConverter.extractBiggestRoman(48);

        Assert.assertEquals(RomanSymbol.XL, biggestRoman);
    }
}
