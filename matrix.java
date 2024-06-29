import java.util.*;
class matrix
{
public static void main(String[]args)
{
Scanner g=new Scanner(System.in);
int[][] arr=new int[3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.println("Enter array row:"+i+" column:"+j +":");
arr[i][j]=g.nextInt();
}
}
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.println(arr[i][j]);
}
}
}
}