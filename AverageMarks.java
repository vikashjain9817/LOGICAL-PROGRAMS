import java.util.Scanner;

class Tests
{
	private String name;
	private int marks;
	public void set(String name, int marks)
	{
		this.name = name;
		this.marks = marks;
	}
	public void get()
	{
		System.out.println(this.name);
		System.out.println(this.marks);
	}
}
public class AverageMarks {

	public static void main(String[] args) {
		Tests [] tests;
		System.out.println("enter number of students");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		tests = new Tests[n];
		for(int i = 0; i < n; i++)
		{
			System.out.println("enter name");
			String name = sc.next();
			System.out.println("enter marks");
			int marks = sc.nextInt();
			tests[i] = new Tests();
			tests[i].set(name, marks);
		}
		for(int i = 0; i < n; i++)
		{
			tests[i].get();
		}
	}
		
}
