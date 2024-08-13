package august;
public class aug122 
{
	int id;
	String name;
	static String college="RTC";
	aug122(int a, String b)
	{
		id=a;
		name=b;
	}
	void display()
	{
		System.out.println("Student_Id : "+id);
		System.out.println("Student_Name : "+name);
		System.out.println("Student_College : "+college);
	}
	public static void main(String[] args) 
	{
		aug122 obj=new aug122(63, "Vishwa");
		aug122 ob=new aug122(25, "Kavin");
		obj.display();
		ob.display();
	}
}
