import java.util.*;
class palindrome
{
public static void main(String[]args)
{
Scanner p=new Scanner(System.in);
System.out.println("Enter a values:");
int a=p.nextInt();

int b=a,c=0,r=0;

while(b>0)
{
c=c*10+(b%10);
b=b/10;
}
if(a==c)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}

}
}
