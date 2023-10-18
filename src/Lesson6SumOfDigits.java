import java.util.Random;

public class Lesson6SumOfDigits {

    final static int MIN_NUMBER = 11;
    final static int MAX_NUMBER = 100_011;
    public static void main(String[] args) {
        Random rnd = new Random();
        int num = rnd.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
        System.out.println("Число: " + num);

        int[] arrDigits = new int[String.valueOf(num).length()];
        int temp = num;
        int pos = 0;
        while (pos < arrDigits.length) {
            arrDigits[pos] = temp % 10;
            temp = temp / 10;
            pos++;
        }

        temp = 0;
        for (int d: arrDigits) {
            temp += d;
        }
        System.out.println("Сума цифр: " + temp);

    }
}
