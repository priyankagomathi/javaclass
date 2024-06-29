class A
{
int i,j;
A(int a,int b)
{
i=a;
j=b;
}
void show()
{
System.out.println("The value of i and j is:"+i+""+j);
}
}
class B extends A
{
int k;
B(int a,int b,int c)
{
super(a,b);
k=c;
}
void show()
{
System.out.println("k:"+k);
}
}
class OverrideTest
{
public static void main(String[]args)
{
B subob=new B(1,2,3);
subob.show();
}
}
class B1 extends A
{
int k;
B1(int a,int b,int c)
{
super(a,b);
k=c;
}
void show()
{
super.show();//this calls A's show();
System.out.println("k:"+k);
}
}
