class fact1
{
public static void main(String[]args)
{
int i,a=1,fact=1;
int number=1;
do
{
fact=fact*number;
System.out.println("factorial of "+number+" is: "+fact);
number+=1;
}
while(number<6);
}
}
