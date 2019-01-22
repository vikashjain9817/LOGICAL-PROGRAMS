import java.util.Scanner;

public class PowerOf5 {

	public static void powerOf5(int n)
	{
		if(n % 10 != 5)
		{
			System.out.println("False");
			System.exit(0);
		}
		else
		{
			while(n > 1)
			{
				if(n % 10 != 5)
				{
					System.out.println("False");
					System.exit(0);
				}
				n = n/5;
			}
			System.out.println("True");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		powerOf5(n);
	}

}
