package august;
import java.util.Scanner;
public class aug130 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (n) 
        {
            case 1:
                int sum = a + b;
                System.out.println(sum);
                break;
            case 2:
                int sub = a - b;
                System.out.println(sub);
                break;
            case 3:
                int mul = a * b;
                System.out.println(mul);
                break;
            case 4:
                int div = a / b;
                System.out.println(div);
                break;
            default:
                System.out.println("Invalid Data");
                break;
        }
    }
}
