package converter.roman;

import converter.PrintableNumber;
import converter.Symbol;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;

/**
 * Created by nnm on 2/23/14.
 */
public class RomanNumber extends PrintableNumber {
    private List<Symbol> symbols;

    public RomanNumber(List<Symbol> symbols) {
        if (symbols == null) {
            throw new NullPointerException();
        }

        this.symbols = symbols;
    }

    @Override
    public void print(OutputStream stream) {
        if (stream == null) {
            throw new NullPointerException();
        }

        final PrintStream printStream = new PrintStream(stream);

        for (Symbol symbol : symbols) {
            printStream.print(symbol.getSymbol());
        }
    }

    public List<Symbol> getSymbols() {
        return symbols;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    @Override
    public byte byteValue() {
        return super.byteValue();
    }

    @Override
    public short shortValue() {
        return super.shortValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RomanNumber that = (RomanNumber) o;

        if (!symbols.equals(that.symbols)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return symbols.hashCode();
    }
}
