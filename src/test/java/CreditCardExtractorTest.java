import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab5.CreditCardExtractor;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardExtractorTest {

    @Test
    public void testExtractCreditCardNumbers() {
        CreditCardExtractor extractor = new CreditCardExtractor();
        String input = "Текст з номерами кредитних карт: 1234 5678 9012 3456, 9876-5432-1987-6543, 1111222233334444.";
        List<String> expectedOutput = Arrays.asList("1234567890123456", "9876543219876543", "1111222233334444");
        List<String> actualOutput = extractor.extractCreditCardNumbers(input);
        assertEquals(expectedOutput, actualOutput);
    }
}
