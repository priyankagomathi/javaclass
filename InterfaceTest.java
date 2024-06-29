interface A
{
void meth1();
void meth2();
}
interface B extends A
{
void meth3();
}
class Myclass implements B
{
public void meth1()
{
String s="WELCOME";
System.out.println("This is meth1 method:"+s);
}
public void meth2()
{
int a=10;
int b=5;
int c;
c=a*b;
System.out.println("This is meth2 method,value of C is:"+c);
}
public void meth3()
{
System.out.println("This is meth3 method");
}
}
class InterfaceTest
{
public static void main(String[]args)
{
Myclass myob=new Myclass();
myob.meth1();
myob.meth1();
myob.meth1();
}
}