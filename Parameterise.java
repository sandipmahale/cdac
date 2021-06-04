/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
creating a class named 'Triangle' without any parameter in its constructor.*/
class AS
{ 
	 int a;
	 int b;
	 int c;


	 AS(int a,int b,int c)
	{
		 this.a=a;
		 this.b=b;
		 this.c=
		
		a*b*c;
		System.out.println("length "+a*b*c);
		int p=3*a*b*c;
		System.out.println("parimeter is "+p);
	}
}


public class Parameterise {
	public static void main(String[] args)
	{
		 int a=3;
		 int b=4;
		 int c=5;
		AS obj=new AS(a,b,c);
	//	obj.Per();
	}

}
