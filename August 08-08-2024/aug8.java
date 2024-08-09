package august;
public class aug8 
{
	private String name;
	private int roll_number;
	private double mark;
	public aug8(String name, int roll_number, double mark)
	{
		this.name=name;
		this.roll_number=roll_number;
		this.mark=mark;
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.roll_number);
		System.out.println(this.mark);
	}
	public static void main(String[] args) 
	{
		aug8 a=new aug8("Vishwa", 63, 97.7);
		a.display();
	}
}
