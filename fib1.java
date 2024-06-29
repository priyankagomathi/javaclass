class fib1
{
public static void main(String [] args)
{
int x=1,y=1,z=0,a=5;
do
{
z=x+y;
System.out.println(z);
x=y;
y=z;
a-=1;
}
while(a>0);

}
}