package august;
class program 
{
	int c;
	int d;
	void insert(int a, int b)
	{
		c=a;
		d=b;
		System.out.print("Enter the two numbers : ");
	}
	void add(int a, int b)
	{
		int sum=a+b;
		System.out.println("Addition of two numbers : "+sum);
	}
	void sub(int a, int b)
	{
		int sub=a-b;
		System.out.println("Subtraction of two numbers : "+sub);
	}
	void mul(int a, int b)
	{
		int mul=a*b;
		System.out.println("Multiplication of two numbers : "+mul);
	}
	void div(int a, int b)
	{
		int div=a/b;
		System.out.println("Division of two numbers : "+div);
	}
	void display()
	{
		System.out.println(c+" "+d);
	}
}
class aug62
{
	public static void main(String[] args) 
	{
	   program a1=new program(); 
	   a1.insert(10, 5);
	   a1.display();
	   a1.add(10,5);
	   a1.sub(10,5);
	   a1.mul(10,5);
	   a1.div(10,5);
	}
}
