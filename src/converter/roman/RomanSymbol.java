package converter.roman;

import converter.Symbol;

/**
 * Created by nnm on 2/23/14.
 */
public enum RomanSymbol implements Symbol {
    I(1),
    IV(4),
    V(5),
    IX(9),
    X(10),
    XL(40),
    L(50),
    XC(90),
    C(100),
    CD(400),
    D(500),
    CM(900),
    M(1000);

    RomanSymbol(int number) {
        this.number = number;
    }

    private int number;

    @Override
    public String getSymbol() {
        return name();
    }

    public int getNumber() {
        return number;
    }
}
