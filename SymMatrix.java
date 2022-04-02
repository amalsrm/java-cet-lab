import java.util.*;
class Matrix
{
  public static void main(String args[])
  {
   int[][] a=new int[10][10];
   int f=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the order of the matrix");
   int m=sc.nextInt();
   int n=sc.nextInt();
   System.out.println("Enter the numbers into the matrix");
   for(int i=0;i<m;i++)
   {
   for(int j=0;j<n;j++)
   {
   a[i][j]=sc.nextInt();
   }
   }
   for(int i=0;i<m;i++)
   {
   for(int j=0;j<n;j++)
   {
   System.out.print(a[i][j]+" ");
   }
   System.out.println();
   }
   for(int i=0;i<m;i++)
   {
   for(int j=0;j<n;j++)
   {
    if(i!=j)
    {
     if(a[i][j]==a[j][i])
     f=1;
     else
     f=0;
    }
   }
   }
   if(f==1)
   System.out.println("The Matrix is Symmetric matrix");
   else
   System.out.println("The Matrix is not a Symmetric matrix");
  }
}
