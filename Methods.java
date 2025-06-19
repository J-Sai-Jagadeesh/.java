/*without parameter without return type*/

/*
class Method{
public void add()
{
System.out.println(10+20);
}
static public void main(String[] jaya)
{
Method m=new Method();
m.add();
}
}
*/

/*without parameter with return type*/

/*
class Method{
public int sub()
{
return(10-5);
}
static public void main(String[] jaya)
{
Method m=new Method();
int b=m.sub();
System.out.println(b);
}
}
*/

/*with parameter without return type*/

/*
class Method{
public void mul(int a,int b)
{
System.out.println(a*b);
}
static public void main(String[] jaya)
{
Method m=new Method();
m.mul(5,2);
}
}
*/

/*with parameter with return type*/

class Method{
public int div(int a,int b)
{
int c=a/b;
return(c);
}
static public void main(String[] jaya)
{
Method m=new Method();
int d=m.div(20,2);
System.out.println(d);
}
}

