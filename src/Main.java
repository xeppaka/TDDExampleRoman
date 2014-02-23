import converter.NumberConverter;
import converter.PrintableNumber;
import converter.roman.RomanNumberConverter;

/**
 * Created by nnm on 2/24/14.
 */
public class Main {
    public static void main(String[] args) {
        NumberConverter numberConverter = new RomanNumberConverter();
        PrintableNumber number = numberConverter.convert(1999);
        number.print(System.out);
    }
}
