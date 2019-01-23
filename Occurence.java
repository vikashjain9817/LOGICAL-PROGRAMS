import java.util.Scanner;

public class Occurence {

	private static void longestOccuring(String s) {
		int max;
		int [] a = new int[26];
		for(int i = 0; i < 26; i++)
		{
			a[i] = 0;
		}
		char [] s1 = s.toLowerCase().toCharArray();
		for(int i = 0; i < s1.length; i++)
		{
			a[(int)(s1[i]-96)]++;
		}
		for(int i = 0; i< 26 ; i++)
		{
			if(a[i]==0)
				continue;
			else
			{
				System.out.print((char)(i+96));
				System.out.print("=");
				System.out.print(a[i]);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		longestOccuring(s);

	}
}
