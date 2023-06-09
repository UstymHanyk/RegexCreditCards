package ua.lviv.iot.algo.part1.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardExtractor {

    private static final Pattern CREDIT_CARD_PATTERN =
            Pattern.compile("(\\d{4}[-\\s]?){4}");

    public List<String> extractCreditCardNumbers(final String input) {
        List<String> creditCardNumbers = new ArrayList<>();
        Matcher matcher = CREDIT_CARD_PATTERN.matcher(input);

        while (matcher.find()) {
            String match = matcher.group().replaceAll("[-\\s]", "");
            creditCardNumbers.add(match);
        }

        return creditCardNumbers;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter text: ");
            return;
        }
        String userInput = args[0];
        CreditCardExtractor extractor = new CreditCardExtractor();
        List<String> cardList = extractor.extractCreditCardNumbers(userInput);
        System.out.println(cardList);

    }

}
