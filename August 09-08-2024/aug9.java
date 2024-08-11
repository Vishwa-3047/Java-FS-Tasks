package august;
class student
{
	student(int a, String b)
	{
		System.out.println("Number : "+a+" "+"Name : "+b);
	}
	student(int c, String d, int e)
	{
		System.out.println("Number : "+c+" "+"Name : "+d+" "+"Number : "+e);
	}
	student(int f, String g, int h, int i)
	{
		System.out.println("Number : "+f+" "+"Name : "+g+" "+"Number : "+h+" "+"Number : "+i);
	}
}
public class aug9 
{
	public static void main(String[] args) 
	{
		student ob=new student(10, "Vishwa");
		student obj=new student(20, "Archana", 30);
		student obje=new student(40, "Aradhya", 50, 60);
	}
}
