import java.util.Scanner;
import java.util.Arrays;
public class ReverseString {
	public static void reverseString(String s)
	{
		char [] s1 = s.toCharArray();
		char [] result = new  char[s1.length];
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]==' ')
				result[i] = ' ';
		}
		int j = result.length-1;
		for (int i = 0; i < s1.length; i++)
		{   
            if (s1[i] != ' ') {   
                if (result[j] == ' ') {  
                    j--;  
                }     
                result[j] = s1[i];  
                j--;  
            }  
        }  
		for(int i = 0;i<result.length;i++)
			System.out.print(result[i]);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.nextLine();
		reverseString(s);

	}

}
