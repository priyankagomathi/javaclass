class matrix5
{
public static void main(String [] args)
{
int a[][]={{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
for(int i=0;i<4;i++)
{
for(int j=0;j<4;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
int b[][]=new int[4][2];
for(int i=0;i<4;i++)
{
for(int j=0;j<2;j++)
{
b[i][j]=a[i][j];
System.out.print(b[i][j]+" ");
}
System.out.println();
}
}
}