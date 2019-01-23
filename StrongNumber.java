import java.util.Scanner;

public class StrongNumber {

	public static void isStrongNumber(int n)
	{
		int r, temp, sum = 0, f;
		temp = n;
		while(n > 0)
		{
			r = n%10;
			f = fact(r);
			sum = sum + f;
			n = n/10;
		}
		if(sum == temp)
		{
			System.out.println(sum);
		}
	}
	public static int fact(int f)
	{
		int i, n =1;
		for(i = 1; i <= f; i++)
			n = n * i;
		return n;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		isStrongNumber(n);
	}

}
