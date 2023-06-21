import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab5.CreditCardExtractor;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardExtractorTest {
    static CreditCardExtractor extractor;

    @BeforeAll
    public static void setUp() {
        extractor = new CreditCardExtractor();

    }

    @Test
    public void testDashSeparatedExtractCreditCardNumbers() {
        String input = "9876-5432-1987-6543";
        List<String> expectedOutput = Arrays.asList("9876543219876543");
        List<String> actualOutput = extractor.extractCreditCardNumbers(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSpaceSeparatedExtractCreditCardNumbers() {
        String input = "1234 5678 9012 3456";
        List<String> expectedOutput = Arrays.asList("1234567890123456");
        List<String> actualOutput = extractor.extractCreditCardNumbers(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testNotSeparatedExtractCreditCardNumbers() {
        String input = "1111222233334444";
        List<String> expectedOutput = Arrays.asList("1111222233334444");
        List<String> actualOutput = extractor.extractCreditCardNumbers(input);
        assertEquals(expectedOutput, actualOutput);
    }

}
