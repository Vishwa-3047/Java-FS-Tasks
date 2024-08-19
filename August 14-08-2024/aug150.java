package august;
public class aug150 
{
	public static void main(String[] args) 
	{
		int a=10;
		boolean a1=true;
		//data type to wrapper class
		Integer obj1=Integer.valueOf(a);
		Boolean obj2=Boolean.valueOf(a1);
		System.out.println(obj1);
		System.out.println(obj2);
		//wrapper class to data type
		int a2=obj1.intValue();
		boolean a3=obj2.booleanValue();
		System.out.println(a2);
		System.out.println(a3);
	}
}
