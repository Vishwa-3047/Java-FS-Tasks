package august;
abstract class animal 
{
	abstract void sound();
}
class lion extends animal
{
	void sound()
	{
		System.out.println("The lion will roar !!!");
	}
}
class tiger extends animal
{
	void sound()
	{
		System.out.println("The tiger will growls !!!");
	}
}
class aug7
{
	public static void main(String args[])
	{
		animal a=new lion();
		a.sound();
		animal b=new tiger();
		b.sound();
	}
}
