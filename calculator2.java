import java.util.*;
class calculator2 
{
public static void main(String [] args)
{
Scanner a=new Scanner(System.in);

System.out.println("Enter the a value :");
int b=a.nextInt();

System.out.println("Enter the b value :");
int c=a.nextInt();

System.out.println("Enter the c value :");
int d=a.nextInt();

calculator x=new calculator();
int z=x.add(c,d);
System.out.println(z);
}
}