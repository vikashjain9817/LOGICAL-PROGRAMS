import java.util.Scanner;

public class FirstRepeating {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		char[] arr=s.toLowerCase().toCharArray();
		int l=s.length();
		int flag=0;
		for(int i=0; i<l; i++)
		{
			for(int j=0; j<l; j++)
			{
				if(i!=j && arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				break;
			}
		}
	}

}
