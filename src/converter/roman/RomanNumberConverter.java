package converter.roman;

import converter.NumberConverter;
import converter.Symbol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by nnm on 2/23/14.
 */
public class RomanNumberConverter implements NumberConverter {
    private static class RomanSymbolsComparator implements Comparator<RomanSymbol> {
        @Override
        public int compare(RomanSymbol o1, RomanSymbol o2) {
            if(o1.getNumber() > o2.getNumber())
                return -1;
            else if (o1.getNumber() < o2.getNumber())
                return 1;
            else return 0;
        }
    }

    Symbol extractBiggestRoman(int number) {
        RomanSymbol[] symbols = Arrays.copyOf(RomanSymbol.values(), RomanSymbol.values().length);
        Arrays.sort(symbols, new RomanSymbolsComparator());

        for (RomanSymbol symbol : symbols) {
            if (number - symbol.getNumber() >= 0) {
                return symbol;
            }
        }

        throw new IllegalStateException();
    }

    @Override
    public RomanNumber convert(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException();
        }

        List<Symbol> symbols = new ArrayList<Symbol>();
        int curNumber = number;
        Symbol extracted;

        while (curNumber > 0) {
            extracted = extractBiggestRoman(curNumber);
            curNumber -= extracted.getNumber();

            symbols.add(extracted);
        }

        return new RomanNumber(symbols);
    }
}
