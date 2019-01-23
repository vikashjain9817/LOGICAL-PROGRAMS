import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of elements of 1st array");
		int n = sc.nextInt();
		int [] a = new int[n];
		System.out.println("enter elements");
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("enter number of elements of 2nd array");
		int m = sc.nextInt();
		int [] b = new int[m];
		System.out.println("enter elements");
		for(int i = 0; i < m; i++)
		{
			b[i] = sc.nextInt();
		}
		int l =m+n;
		int [] result = new int[l];
		for(int i = 0; i < n; i++)
		{
			result[i] = a[i];
		}
		for(int j = 0; j < m; j++)
		{
			result[j+n] = b[j];
		}
		Arrays.sort(result);
		int mid = l/2;
		System.out.println(result[mid]);
	}

}
