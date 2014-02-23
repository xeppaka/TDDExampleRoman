package converter;

import java.io.OutputStream;

/**
 * Created by nnm on 2/23/14.
 */
public abstract class PrintableNumber extends Number {
    public abstract void print(OutputStream stream);
}
