import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        int num, originalNum, remainder, result = 0, n = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = s.nextInt();
        originalNum = num;

        // Count number of digits
        while (originalNum != 0) {
            originalNum /= 10;
            n++;
        }

        originalNum = num;
        // Calculate sum of nth powers of its digits
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }

        if (result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
