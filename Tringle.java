/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
creating a class named 'Triangle' without any parameter in its constructor.*/
class Per
{ 
	 int a=3;
	 int b=4;
	 int c=5;


	 Per()
	{
		int l=a*b*c;
		System.out.println("length "+l);
		int p=3*a*b*c;
		System.out.println("parimeter is "+p);
	}
}


public class Tringle {
	public static void main(String[] args)
	{
		 int a=3;
		 int b=4;
		 int c=5;
		Per obj=new Per();
	//	obj.Per();
	}

}
