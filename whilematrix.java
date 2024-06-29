class whilematrix
{
public static void main(String [] args)
{
int a[][]={{5,8},{6,9},{4,7}};
int b[][]={{6,9},{5,8},{3,1}};

int c[][]=new int[3][2];
int i=0;
while(i<3)
{
int j=0;
while(j<2)
{

c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+" ");

j++;
}
i++;
System.out.println();
}
}
}