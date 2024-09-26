import java.util.Scanner;
class Summation
{
public  static void main(String args[])
	{
	System.out.println("Enter the first number");
	Scanner a=new Scanner(System.in);
	int x=a.nextInt();
	System.out.println("Enter the second number");
	Scanner b=new Scanner(System.in);
	int y=b.nextInt();
	System.out.println("Your summation:"+(x+y));
	}
}