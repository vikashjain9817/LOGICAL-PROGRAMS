import java.util.Scanner;

public class PowerOf2 {

	public static void powerOf2(int n)
	{
		if(n<=0)
			System.out.println("False");
		else
		{
			while(n > 1)
			{
				if(n % 2 != 0)
				{
					System.out.println("False");
					System.exit(0);
				}
				n = n / 2;
			}
			System.out.println("True");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		powerOf2(n);
	}
}
