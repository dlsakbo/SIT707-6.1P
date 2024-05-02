package sit707_week6;

public class ConditionalLoops {

    public static int countEvenNumbers(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (isEven(number)) {
                count++;
            }
        }
        return count;
    }

    public static boolean containsPrime(int[] numbers) {
        for (int number : numbers) {
            if (isPrime(number)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
