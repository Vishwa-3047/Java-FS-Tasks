package august;
import java.util.*;
public class aug131 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("Even numbers are : ");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.print("Odd numbers are : ");
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
