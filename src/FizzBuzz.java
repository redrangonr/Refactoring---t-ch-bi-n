import java.util.Scanner;

public class FizzBuzz {
    public static boolean isDivisbleby3(int num) {
        return num % 3 == 0;
    }

    public static boolean isDivibleby5(int num) {
        return num % 5 == 0;
    }

    public static boolean isDivibleby5And3(int num) {
        return num % 3 == 0 && num % 5 == 0;
    }
    public static final String FIZZ ="Fizz";
    public static final String BUZZ ="Buzz";
    public static final String FIZZBUZZ="FizzBuzz";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so");
        int num;
        num = scanner.nextInt();
        if (isDivibleby5And3(num)) {
            System.out.println(FIZZBUZZ);
        } else if (isDivibleby5(num)) {
            System.out.println(BUZZ);
        } else if (isDivisbleby3(num)) {
            System.out.println(FIZZ);
        } else {
            System.out.println("nhap lai");
        }
    }
}