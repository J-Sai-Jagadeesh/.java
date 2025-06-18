/*
import java.util.Scanner;
class Patterns{
public static void main(String[] args){
int n;
Scanner b=new Scanner(System.in);
System.out.println("Enter the input to draw square pattern with *:");
n=b.nextInt();
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print("* ");
}
System.out.println("");
}
}
}
*/

/*
import java.util.Scanner;
class Patterns{
public static void main(String[] args){
int n;
Scanner b=new Scanner(System.in);
System.out.println("Enter the input to draw square pattern with Numbers :");
n=b.nextInt();
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print((i+1)+" ");
}
System.out.println("\n");
}
}
}
*/

/*
import java.util.Scanner;
class Patterns{
public static void main(String[] args){
int n;
Scanner b=new Scanner(System.in);
System.out.println("Enter the input to draw square pattern with Numbers :");
n=b.nextInt();
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print((j+1)+" ");
}
System.out.println("");
}
}
}
*/

/*
import java.util.Scanner;
class Patterns{
public static void main(String[] args){
int n;
Scanner b=new Scanner(System.in);
System.out.println("Enter the input to draw square pattern with Numbers :");
n=b.nextInt();
int num=1;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print(num+"\t");
num++;
}
System.out.println("\t");
}
}
}
*/

/*
import java.util.Scanner;
class Patterns{
public static void main(String[] args){
int n;
Scanner b=new Scanner(System.in);
System.out.println("Enter the input to draw square pattern with Numbers :");
n=b.nextInt();
int num=1;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print(num+"\t");
if(num==9){
num=1;
continue;
}
num++;
}
System.out.println("");
}
}
}
*/

/*
import java.util.Scanner;
class Patterns{
public static void main(String[] args){
int n;
Scanner b=new Scanner(System.in);
System.out.println("Enter the input to draw square pattern with Numbers :");
n=b.nextInt();
int num=1;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print(num+"\t");
num+=2;
}
System.out.println("\t");
}
}
}
*/

import java.util.Scanner;
class Patterns{
public static void main(String[] args){
int n;
Scanner b=new Scanner(System.in);
System.out.println("Enter the input to draw square pattern with Numbers :");
n=b.nextInt();
for(int i=1;i<=n;i++){
for(int j=i;j<=n;j++){
if(j%2==1){
System.out.print("1");
}
else{
System.out.print("0");
}
}
System.out.println();
}
}}