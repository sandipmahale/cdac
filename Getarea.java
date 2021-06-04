/*Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of
its length and breadth as parameters of its constructor and having a method named 'returnArea' which
returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard./*/
import java.util.Scanner;
class Area
{
	int length;
	int breadth;
	
	Area(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	int returnArea()
	{
		return length*breadth;
	}
	
}


public class Getarea {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of a and b");

		int a=s.nextInt();
		int b=s.nextInt();
		Area obj=new Area(a,b);
		
		System.out.println(obj.returnArea());
		
	}

}
