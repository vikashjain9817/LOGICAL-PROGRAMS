import java.util.Scanner;

public class Power10 {

	public static void powerOf10(int n)
	{
		int c = 0; 
		char [] narray = (""+n).toCharArray();
		for(int i=0;i<narray.length;i++)
			System.out.print(narray[i]);
		if(narray[0]!='1')
		{
			System.out.println("False");
			System.exit(0);
		}
		else
		{
			for(int i=1;i<narray.length;i++)
			{
				if(narray[i]!='0')
					c = 1;
					break;
			}
		}
		if(c == 0)
			System.out.println("True");
		else
			System.out.println("False");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		powerOf10(n);
	}

}
