import java.util.*;
class place
{
public static void main(String[]args)
{
int input;
do
{

Scanner s=new Scanner(System.in);

System.out.println("Enter a Name");
String n=s.nextLine();

System.out.println("Enter a Age");
int a=s.nextInt();

s.nextLine();

System.out.println("Enter a Father Name");
String f=s.nextLine();

System.out.println("Enter a Mother Name");
String m=s.nextLine();

System.out.println("Enter a Address");
String d=s.nextLine();

System.out.println("Enter a Place");
String p=s.nextLine();

                                                                                                                                                                                                                                                                           

int age=19;
String place="Mayiladuthurai";
if(age>18)
{
if(place=="Mayiladuthurai")
{
System.out.println("Eligible to stay address:"+n);

}
else
{
System.out.println("not eligible to stay:"+n);
}


}
input=s.nextInt();
}while(input>0);
}}