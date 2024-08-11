package august;
public class aug91 
{
	public void add(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public void add(double a, double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		aug91 ob=new aug91();
		ob.add(25, 55);
		aug91 obj=new aug91();
		obj.add(25.5, 55.7);
	}
}
