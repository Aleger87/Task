import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 9;
        Set<StringBuilder> tasks = new HashSet<>();

        int count = 0;
        while (count < 15) {
            StringBuilder str = new StringBuilder(createNumbers(a, b));
            if (!tasks.contains(str) && !tasks.contains(reverseString(String.valueOf(str)))) {
                tasks.add(str);
                count++;
            }
        }
        System.out.println(tasks);

    }
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }


    private static StringBuilder createNumbers(int a, int b) {
        int random_number1 = a + (int) (Math.random() * b);
        int random_number2 = a + (int) (Math.random() * b);

        StringBuilder task = new StringBuilder(random_number1 + "*" + random_number2);

        return task;
    }
}