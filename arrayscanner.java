import java.util.*;
class arrayscanner
{
public static void main(String [] args)
{
Scanner p=new Scanner(System.in);
int a=0;
while(a<5)
{
System.out.println("Enter the value :");
int r=p.nextInt();
a++;
}
for(int i=0;i<5;i++)
{
int b[]=new int[5];
System.out.println("elements :"+b[i]);
}
}
}




