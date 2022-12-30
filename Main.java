import java.util.Random;

public class Main {
    private static char randomChar() {
        int rand = new Random().nextInt(52);
        char start = (rand < 26) ? 'A' : 'a';
        return (char) (start + rand % 26);
    }
    public static int generateRandomNumber(int n) {
        return new Random().nextInt(n + 1);
    }

    {
        int n = 99;
        for (int i = 0; i < 10; i++) {
            char c = randomChar();
            System.out.println(c);
            System.out.println(generateRandomNumber(n));
            System.out.println(n + c);
        }
    }
}