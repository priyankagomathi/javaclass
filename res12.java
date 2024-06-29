class res12
{
public static void main(String [] args)
{
int n=12,r=0,a=0,b=0;
for (int x=0;x<3;x++)
{
r=n%10;
a=(a*10)+r;
n=n/10;
System.out.println(n);
}
}
}