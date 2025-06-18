/*1*/
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

/* 2 */

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

/* 3 */

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

/* 4 */

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

/*5*/

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

/* 6 */

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

/* 7 */

/*
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
*/

/* 8 */

/*class Pattern8
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n-1;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(" *");
}
System.out.println();
}
}
}*/

/* 9 */
/*class Pattern9
{
public static void main(String[] args)
{
int n,even=2;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n-1;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(" "+even);
even+=2;
}
System.out.println();
even=2;
}
}
}*/

/*10 */

/* class Pattern10
{
public static void main(String[] args)
{
int n;
String s="INDIA";
Scanner s1=new Scanner(System.in);
System.out.print("Enter the value:");
n=s1.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=0;j<i;j++)
{
System.out.print(s.charAt(j));
}
System.out.println();
}
}
} */

/* 11 */

/*class Pattern11
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=2*n-i;j++)
{
System.out.print(" ");
}
for(int k=1;k<=2*i-1;k++)
{
System.out.print(" *");
}
System.out.println();
}
}
}*/
