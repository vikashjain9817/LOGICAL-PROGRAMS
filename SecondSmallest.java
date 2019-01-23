import java.util.Arrays;
import java.util.Scanner;

public class SecondSmall {
	
	public static void secondSmallest(int a[],int n)
	{
		Arrays.sort(a);
		System.out.println(a[1]);
		
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of elements");
		n = sc.nextInt();
		int [] a = new int[n];
		for(int i = 0; i<n; i++)
			a[i] = sc.nextInt();
		secondSmallest(a,n);

	}

}
