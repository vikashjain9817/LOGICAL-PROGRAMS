import java.util.Scanner;

public class Numerology {

	private static void numerology(String s) {
		int sum =0;
		char [] s1 = s.toLowerCase().toCharArray();
		for(int i = 0; i < s1.length; i++)
		{
			if(s1[i] == 'a' || s1[i] == 'i' || s1[i] == 'q' || s1[i] == 'j' || s1[i] == 'y')
				sum = sum + 1;
			if(s1[i] == 'b' || s1[i] == 'k' || s1[i] == 'r')
				sum = sum + 2;
			if(s1[i] == 'c' || s1[i] == 'g' || s1[i] == 'l' || s1[i] == 's')
				sum = sum + 3;
			if(s1[i] == 'd' || s1[i] == 'm' || s1[i] == 't')
				sum = sum + 4;
			if(s1[i] == 'e' || s1[i] == 'h' || s1[i] == 'n' || s1[i] == 'x')
				sum = sum + 5;
			if(s1[i] == 'u' || s1[i] == 'v' || s1[i] == 'w')
				sum = sum + 6;
			if(s1[i] == 'o' || s1[i] == 'z')
				sum = sum + 7;
			if(s1[i] == 'f' || s1[i] == 'p')
				sum = sum + 8;
		}
		int r, result = 0;
		while(sum > 0)
		{
			r = sum % 10;
			result = result + r;
			sum = sum/10;
			
		}
		System.out.println(result);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		numerology(s);
	}

}
