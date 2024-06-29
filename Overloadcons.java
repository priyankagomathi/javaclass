class Box
{
double width,height,depth;
Box(double w,double h,double d)
{
width=w;
height=h;
depth=d;
}
Box()
{
width=-1;
height=-1;
depth=-1;
}
Box(double len)
{
width=height=depth=len;
}
double volume()
{
return width*height*depth;
}
}
class Overloadcons
{
public static void main(String[]args)
{
Box b=new Box(10,20,15);
Box b1=new Box();
Box b2=new Box(7);
double vol;
vol=b.volume();
System.out.println("Volume of B is:"+vol);
vol=b1.volume();
System.out.println("Volume of B1 is:"+vol);
vol=b2.volume();
System.out.println("Volume of B2 is:"+vol);
}
}