class res
{
public static void main(String [] args)
{
int n=12,r=0,a=0,b=0,n1=n,b1=0;
for (int x=0;x<2;x++)
{
r=n%10;
a=(a*10)+r;
n=n/10;

}
b=(a*a);
System.out.println(b);
a=n1*n1;
for(int x=0;x<3;x++)
{

r=a%10;
b1=(b1*10)+r;
a=a/10;
System.out.println(b1);
}
if(b==b1)
{
System.out.println("adam number");
}
else
{
System.out.println("not adam number");
}
}
}
