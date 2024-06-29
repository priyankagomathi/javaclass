class matrix1
{
public static void main(String[]args)
{
int a[][]={{5,8,2},{2,8,9},{4,6,1}};
int b[][]={{5,2,3},{2,3,6},{8,5,7}};

int c[][] =new int[3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
c[i][j]= a[i][j]+b[i][j];
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}