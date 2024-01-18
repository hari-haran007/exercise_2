
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        if (number < 0) {
            System.out.println("Negative numbers are not Armstrong numbers.");
        } else if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    static boolean isArmstrongNumber(long num) {
        if(num<0)
        return false;
        long originalNumber, remainder, result = 0, n = 0;
        
        originalNumber = num;

        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = num;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        return result == num;
    }


   
}
