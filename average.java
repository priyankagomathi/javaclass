import java.util.*;
class average
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);

System.out.println("Enter the Student name:");
String p=s.nextLine();

System.out.println("Enter the Student age:");
int v=s.nextInt();

System.out.println("Enter the mark 1:");
int m=s.nextInt();

System.out.println("Enter the mark 2:");
int j=s.nextInt();

System.out.println("Enter the mark 3:");
int r=s.nextInt();

System.out.println("Enter the mark 4:");
int a=s.nextInt();

System.out.println("Enter the mark 5:");
int g=s.nextInt();

System.out.println("Enter the mark 6:");
int k=s.nextInt();


if(v>18)
{
System.out.println("youre eligible to college");
int total=m+j+r+a+g+k;
float avg=total/6;
System.out.print(total+" "+avg);

if(avg>90)
{
System.out.println("medical college");
}
if(avg>80)
{
System.out.println("Engineering college");
}
if(avg>70)
{
System.out.println("arts college");
}
}
}
}


