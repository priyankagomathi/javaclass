import java.util.*;

class calculator
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

switch(3)
{
case 1:
System.out.println(c+d);
break;

case 2:
System.out.println(c-d);
break;

case 3:
System.out.println(c*d);
break;

case 4:
System.out.println(c/d);
break;

case 5:
System.out.println(c%d);
break;

default:
System.out.println("none");
}
}

}
