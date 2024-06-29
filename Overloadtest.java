class Overload
{
void show()
{
System.out.println("No Parameters");
}
void show(int a)
{
System.out.println("The value of a is:"+a);
}
void show(int a,int b)
{
System.out.println("The value of a and b is:"+a+""+b);
}
}
class OverloadTest
{
public static void main(String[]args)
{
Overload ob=new Overload();
ob.show();
ob.show(10);
ob.show(10,20);
}
}