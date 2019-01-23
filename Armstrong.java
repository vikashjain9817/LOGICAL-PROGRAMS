
public class Armstrong {

	public static boolean isArmstrong(int n)
	{
		int temp, r, digit = 0;
		temp = n;
		int sum = 0;
		while(n > 0)
		{
			r = n % 10;
			digit = digit + 1;
			n = n/10;
		}
		n = temp;
		while(n > 0)
		{
			r = n % 10;
			sum = sum + (int)Math.pow(r, digit);
			n = n/10;	
		}
		if(sum == temp)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		for(int i = 10; i<1000; i++)
		{
			if(isArmstrong(i))
				System.out.println(i);
		}
	}

}
