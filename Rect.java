import java.util.*;
class Rectangle
{ 
  Scanner sc=new Scanner(System.in);
  Rectangle()
  {
    System.out.print("The Perimeter of the rectangle is...  ");
    
  }
  Rectangle(int a,int b)
  {
    System.out.print(2*(a+b));
  } 
}
class Rect
{
 	public static void main(String args[])
	{
	int x,y;
        Scanner inp=new Scanner(System.in);
	System.out.println("enter the height and width of rectangle: ");
	x=inp.nextInt();
        y=inp.nextInt();
        Rectangle ob=new Rectangle();
 	Rectangle ob1= new Rectangle(x,y);
	}
}
