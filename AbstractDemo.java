import java.util.*; 
abstract class Shape
{
	int x,y;
     	abstract void area(double x,double y);
}
class Rectangle extends Shape
{
	void area(double x,double y)
	{
		System.out.println("Area of rectangle:" +(x*y));
	}
}
class Circle extends Shape
{
	void area(double x,double y)
	{
		System.out.println("Area of circle:" +(3.14*x*x));
	}
}
class Triangle extends Shape
{
	void area(double x,double y)
	{
		System.out.println("Area of triangle:"+(0.5*x*y));
	}
}
public class AbstractDemo
{
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle();
		r.area(2,5);
		Circle c=new Circle();
		c.area(5,8);
		Triangle t=new Triangle();
		t.area(7,8);
	}
}

