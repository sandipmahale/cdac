/*Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by
creating a class named 'Rectangle' with a method named 'Area' which returns the area and length
and breadth passed as parameters to its constructor.
6.*/
class Area
{
	int length;
	int breadth;
	Area(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	int Area2()
	{
		return (length*breadth);
	}
}
public class Constructor {
public static void main(String[] args)
{
	Area obj=new Area(4,5);
	Area obj2=new Area(5,8);
	System.out.print(obj.Area2());

	
	
}
}
