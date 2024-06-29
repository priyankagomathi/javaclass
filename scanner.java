import java.util.*;
class scanner
{
public static void main(String[]args)
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the value A:");
    int a=s.nextInt();

    System.out.println("Enter the value B:");
    int b=s.nextInt();

    System.out.println("Enter the value C:");
    int c=s.nextInt();
if(a>b && a>c)
{
if(b>c)
{
System.out.println("b is the mid value");
}
else
{
System.out.println("c is the mid value");
}
}
if(b>a && b>c)
{
if(a>c)
{
System.out.println("a is the mid value");
}
else
{
System.out.println("c is the mid value");
}
if(c>a && c>b)
{
if(a>b)
{
System.out.println("a is the mid value");
}
else
{
System.out.println("b is the mid value");
}
}
}
}}