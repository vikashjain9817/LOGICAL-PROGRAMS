import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	public void isAnagram(String s1, String s2)
	{
		String S1 = s1.replaceAll("\\s", "");  
        String S2 = s2.replaceAll("\\s", "");  
		if(S1.length()!=S2.length())
			System.out.println("not Anagram");
		else
		{
			char[] ArrayS1 = S1.toLowerCase().toCharArray();
			char[] ArrayS2 = S2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);  
	        Arrays.sort(ArrayS2);
	        if(Arrays.equals(ArrayS1, ArrayS2))
	        	System.out.println("Anagram");
	        else
	        	System.out.println("Not Anagram");
		}
	}
	public static void main(String [] args)
	{
		Anagram a = new Anagram();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string");
		String s1 = sc.nextLine();
		System.out.println("enter second string");
		String s2 = sc.nextLine();
		a.isAnagram(s1,s2);
	}

}
