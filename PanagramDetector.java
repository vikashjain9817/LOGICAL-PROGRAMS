import java.util.Scanner;

public class PanagramDetector {

	private static void missingChar(String s1, String s2) {
		int flag = 0;
		char[] ch1 = s1.toLowerCase().toCharArray();
		char[] ch2 = s2.toLowerCase().toCharArray();
		System.out.println("Thease Alphabate prevents it to being panagarm: ");
		for(int  i = 0; i < ch2.length; i++)
		{
			flag = 0;
			for(int j = 0; j < ch1.length; j++)
			{
				if(ch2[i] == ch1[j])
				{
					flag = 1;
				}
			}
			if(flag == 0)
			{
				System.out.print(ch2[i]+ " ");
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s1 = sc.nextLine();
		String s2 = "abcdefghijklmnopqrstuvwxyz";
		missingChar(s1, s2);
	}

}
