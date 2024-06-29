import java.util.*;
class employee
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a Employee name");
String a=s.nextLine();

System.out.println("Enter a Employee qualification");
String b=s.nextLine();

System.out.println("Enter a Employee Date of Birth");
String c=s.nextLine();

System.out.println("Enter a Employee Place of Birth");
String d=s.nextLine();

System.out.println("Enter a Employee email id");
String e=s.nextLine();

System.out.println("Enter a Employee Date of Joining");
String g=s.nextLine();

System.out.println("Enter a Employee age");
int i=s.nextInt();

System.out.println("Enter a Employee Experience");
int f=s.nextInt();

System.out.println("Enter a Employee Salary");
int h=s.nextInt();

if(i>35)
{

System.out.println("age must should can be thirty five to check the salary ");


if(f>5)
{
System.out.println("experience is greater five years");
int salary=5000;
System.out.println("add salary");
}


}
}
}