
/*Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the
value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
2.*/
class Student2 
{
	String name;
	int roll_no;
	long phn_no;
	void show()
	{
		System.out.println(name);
		System.out.println(roll_no);
		System.out.println(phn_no);
		
	}
	

	
}
public class Sam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student2 s1=new Student2();
s1.name="sandip";
s1.roll_no=2;
s1.phn_no=9172343433l ;
s1.show();
s1.name="Anup";
s1.roll_no=3;
s1.phn_no=7219633777l ;
s1.show();

//System.out.println(s1.name);
	}

}
