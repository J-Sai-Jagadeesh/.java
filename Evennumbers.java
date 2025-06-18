/*
class Even{
public static void main(String args[]){
int i=5;
while(i<=50){
int a=2*i;
System.out.print((a)+"\t");
i++;
}
}
}
*/

class Even{
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Even numbers between 10 and 100 are:");
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
