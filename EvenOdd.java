import java.util.Scanner;
class EvenOdd{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.print("Enter the Number:");
int n=s.nextInt();
if(n%2==0){
System.out.print("Given Number is Even");
}
else{
System.out.print("Given Number is Odd");

}
}
}
