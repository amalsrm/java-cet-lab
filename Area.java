import java.util.*;
class Rectangle
{
  void show(int a,int b)
  {
    System.out.println("Area of the Rectangle: "+a*b);
  }
}
class Area
{
 public static void main(String rgs[])
 {
  int l,b;
  Scanner i=new Scanner(System.in);
  System.out.println("Enter the length of rectangle: ");
  l=i.nextInt();
  System.out.println("Enter the width of rectangle: ");
  b=i.nextInt();
  Rectangle ob=new Rectangle();
  ob.show(l,b);
 }
}
