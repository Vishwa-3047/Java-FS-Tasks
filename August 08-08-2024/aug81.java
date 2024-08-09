package august;
public class aug81 
{
	private int radius;
	private String color;
	public aug81(int num, String name)
	{
		this.radius=num;
		this.color=name;
	}
	void display()
	{
		System.out.println("Radius = "+this.radius);
		System.out.println("Color = "+this.color);
	}
	public  static void main(String args[])
	{
		aug81 a=new aug81(1, "red");
		a.display();
	}
}
