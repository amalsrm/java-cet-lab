import java.util.*;
class Sample
{
  double r,i;
  void add(double i1,double r1,double i2,double r2)
  {
    i=i1+i2;
    r=r1+r2;
  }
  void show()
  {
    System.out.println("The Sum of the two complex numbers is..."+r+" "+" "+i+"i");
  }
}
class Complex
{
 	public static void main(String args[])
	{
	double r1,i1,r2,i2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the real and imaginary part of the first complex number: ");
	r1=sc.nextDouble();
	i1=sc.nextDouble();
	System.out.println("Enter the real and imaginary part of the first complex number: ");
	r2=sc.nextDouble();
	i2=sc.nextDouble();
	Sample s=new Sample();
	s.add(r1,i1,r2,i2);
	s.show();
	}
}
	
