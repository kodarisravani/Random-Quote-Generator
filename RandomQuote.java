
import java.util.Random;

public class RandomQuote {
    private static final String[] quotes = {
        "Believe you can and you're halfway there. - Theodore Roosevelt",
        "It does not matter how slowly you go as long as you do not stop. - Confucius",
        "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
        "Don't watch the clock; do what it does. Keep going. - Sam Levenson",
        "You miss 100% of the shots you don't take. - Wayne Gretzky"
    };

    public static void main(String[] args) {
        Random random = new Random();
        String quote = quotes[random.nextInt(quotes.length)];
        System.out.println(quote);
    }
}

