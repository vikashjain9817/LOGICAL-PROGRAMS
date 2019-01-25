import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of students");
		int n=sc.nextInt();
		System.out.println("Enter name and marks");
		String[][] arr=new String[n][2];
		for(int i=0; i<n; i++)
			for(int j=0; j<2; j++)
				arr[i][j]=sc.next();
		int[] name=new int[n];
		int sum=0,count=0;
		for(int i=0; i<n; i++)
		{
			sum=0;
			count=0;
			for(int j=0; j<n; j++)
			{
				if(arr[i][0].equals(arr[j][0]))
				{
					sum=sum+Integer.parseInt(arr[j][1]);
					count++;
				}
			}
			name[i]=(int)Math.floor(sum/count);
		}
		int max=name[0];
		for(int i=0; i<n; i++)
		{
			if(max<name[i])
			{
				max=name[i];
			}
		}
		
		System.out.println(max);
	}

}
