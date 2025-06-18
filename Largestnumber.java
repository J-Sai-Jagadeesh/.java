import java.util.Scanner;
class Largestnumber {
    public static void main(String[] args) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter three Numbers:");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        if (a >= b && a >= c) {
            if (a == b && a == c) {
                System.out.print("All numbers are equal and largest: " + a);
            } else if (a == b) {
                System.out.print("a and b are the largest: " + a);
            } else if (a == c) {
                System.out.print("a and c are the largest: " + a);
            } else {
                System.out.print("Largest Number is: " + a);
            }
        } else if (b >= a && b >= c) {
            if (b == c) {
                System.out.print("b and c are the largest: " + b);
            } else {
                System.out.print("Largest Number is: " + b);
            }
        } else {
            System.out.print("Largest Number is: " + c);
        }
    }
}
