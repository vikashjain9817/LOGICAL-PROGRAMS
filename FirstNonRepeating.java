import java.util.Scanner;

public class FirstNonRepeating {

	public static void secondSmallest(String s)
	{
		int flag = 0;
		char[] s1 = s.toLowerCase().toCharArray();
		for(int i = 0; i<s1.length; i++)
		{
			flag = 0;
			for(int j =0; j<s1.length; j++)
			{
				if(s1[i]==s1[j] && i!=j)
				{
					flag = 1;
					break;
				}
			}
			if(flag == 0)
			{
				System.out.println(s1[i]);
				System.exit(0);
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.nextLine();
		secondSmallest(s);

	}

}
