package converter.roman;

import converter.Symbol;
import converter.SymbolConverter;

/**
 * Created by nnm on 2/23/14.
 */
public class RomanSymbolConverter implements SymbolConverter {
    @Override
    public Symbol convert(int number) {
        switch (number) {
            case 1:
                return RomanSymbol.I;
            case 4:
                return RomanSymbol.IV;
            case 5:
                return RomanSymbol.V;
            case 9:
                return RomanSymbol.IX;
            case 10:
                return RomanSymbol.X;
            case 40:
                return RomanSymbol.XL;
            case 50:
                return RomanSymbol.L;
            case 90:
                return RomanSymbol.XC;
            case 100:
                return RomanSymbol.C;
            case 400:
                return RomanSymbol.CD;
            case 500:
                return RomanSymbol.D;
            case 900:
                return RomanSymbol.CM;
            case 1000:
                return RomanSymbol.M;
        }

        throw new IllegalArgumentException("Number is not Roman symbol.");
    }
}
