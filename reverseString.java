import java.util.Scanner;
import java.util.Arrays;
public class ReverseString {
   
	public static void spaceIndex(String s)
	{
		int [] index = new int[10000];
		for(int k=0;k<index.length;k++)
			index[k] = 0;
		int j=0;
		char [] ch = s.toCharArray();
		for(int i = 0; i<ch.length; i++)
		{
			if(ch[i]== ' ')
				index[j++] = i;
		}
	}
	public static void reverseString(String s)
	{
		int k=0,l=0;
		char[] rev = new char[100000];
		String [] s1 = s.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			char [] a = s1[i].toCharArray();
			for(int j=a.length-1;j>=0;j--)
			{
				 rev[k++]=a[j];
			}
		}
		for(int i = 0; i<rev.length; i++)
		{
			if(i==index[l])
			{
				System.out.println(' ');
				l++;
			}
			else
			{
				System.out.println(rev[i]);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.nextLine();
		spaceIndex(s);
		reverseString(s);

	}

}
