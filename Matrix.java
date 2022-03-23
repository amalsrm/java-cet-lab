import java.util.*;
class matrixins
{  
   Scanner inp=new Scanner(System.in);
   int[][] a=new int[20][20];
   int[][] b=new int[20][20]; 
   int s1,s2; 
   void insert()
   {
        System.out.println("Enter the size of the matrix: ");
        s1=inp.nextInt();
        s2=inp.nextInt();
	System.out.println("Enter the elements into the first matrix: ");
	for(int i=0;i<s1;i++)
	{
	  for(int j=0;j<s2;j++)
   	  {
            a[i][j]=inp.nextInt();
		
	  }
	}
	System.out.println("Enter the elements into the second matrix: ");
	for(int i=0;i<s1;i++)
	{
	  for(int j=0;j<s2;j++)
   	  {
            b[i][j]=inp.nextInt();
		
	  }
	}
        display();
   }
   void display()
   {
	for(int i=0;i<s1;i++)
	{
	  for(int j=0;j<s2;j++)
   	  {
            System.out.print(a[i][j]+b[i][j]+" ");
		
	  }
	System.out.println();
	}
    }
}
class Matrix
{
 	public static void main(String args[])
	{
        Scanner inp=new Scanner(System.in);
        matrixins ob=new matrixins();
	ob.insert();
	}
}
