class fibnoccie
{
public static void main(String[]args)
{
int x=1,y=1,z=0,a=0;

for(a=0;a<5;a++)
{
z=x+y;
System.out.println(z);
x=y;
y=z;
}
}
}