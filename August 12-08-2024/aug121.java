
           //Instances variable

package august;
public class aug121 
{
	private int id;
	private String name;
	public void student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.name);
	}
	public static void main(String[] args) 
	{
		aug121 ob=new aug121();
		ob.student(63, "Vishwa");
		ob.display();
	}
}
