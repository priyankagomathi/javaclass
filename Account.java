class Bank
{
String name;
int x;
Bank(String a,int b)
{
name=a;
x=b;
}
void banks()
{
System.out.println("The bank of name and x is:"+name+"" +x);
}
}



class RbiBank extends Bank
{
int p;
RbiBank(String name,int b,int c)
{
super(name,b);
p=c;
}
void banks()
{
System.out.println("p:"+p);
}
}


class IobBank extends Bank
{
int z;
IobBank(String name,int b,int c)
{
super(name,b);
z=c;
}
void banks()
{
System.out.println("z:"+z);
}
}


class Account 
{
public static void main(String[]args)
{
RbiBank subob=new RbiBank("kalkivarthan",109,42);
IobBank subob1=new IobBank("umar",42,109);
subob.banks();
subob1.banks();
}
}