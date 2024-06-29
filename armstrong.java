class armstrong
{
public static void main(String [] args)
{
int n=153,a=0,r=0;
for(int x=0;x<3;x++)
{
r=n%10;
a=(a)+(r*r*r);
n=n/10;
System.out.println(a);	
}
}
}
