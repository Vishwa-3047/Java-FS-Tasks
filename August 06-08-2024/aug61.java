package august;
class employee
{
	int emp_id;
	String emp_name;
	void insert(int n, String name)
	{
		emp_id=n;
		emp_name=name;
	}
	void display()
	{
		System.out.println(emp_id+" "+emp_name);
	}
}
class aug61
{
	public static void main(String[] args) 
	{
	   employee a1=new employee(); 
	   a1.insert(101, "Vishwa");
	   a1.display();
	}
}
