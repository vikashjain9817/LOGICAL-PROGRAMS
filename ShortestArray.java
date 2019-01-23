
public class ShortestArray {

	public static void main(String[] args) {
		int[][] a = {
			      {1, 2, 3}, 
			      {4, 5, 6, 9}, 
			      {7}, 
			      {2,0,4,7}
			};
		int [] l = new int[a.length];
		for(int i = 0; i < a.length; i++)
		{
			l[i] = a[i].length;
		}
		int min = 0 , k;
		for(k = 0; k < l.length; k++)
		{
			if(l[min] > l[k])
				min = k;
		}
		for(int i = 0; i<a[min].length; i++)
		{
			System.out.print("{");
			System.out.print(a[min][i]+",");
			System.out.println("}");
		}
	}
}
