package august;
class student
{
	student(int a, String b)
	{
		System.out.println("Number : "+a);
		System.out.println("Name : "+b);
	}
	student(int c, String d, int e)
	{
		System.out.println("Number : "+c);
		System.out.println("Name : "+d);
		System.out.println("Number : "+e);
	}
	student(int f, String g, int h, int i)
	{
		System.out.println("Number : "+f);
		System.out.println("Name : "+g);
		System.out.println("Number : "+h);
		System.out.println("Number : "+i);
	}
}
public class aug9 
{
	public static void main(String[] args) 
	{
		student ob=new student(10, "Vishwa");
		/*student obj=new student(20, "Archana", 30);
		student obje=new student(40, "Priya", 50, 60);*/
	}
}
