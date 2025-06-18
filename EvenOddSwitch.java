import java.util.Scanner;

public class EvenOddSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        switch (num % 2) {
            case 0:
                System.out.println(num + " is an EVEN number.");
                break;
            case 1:
                System.out.println(num + " is an ODD number.");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
