import java.util.Scanner;
public class panagram {
	public static void isPanagram(String s)
	{
		String s1 = s.replaceAll("\\s", "");
		String S1 = s1.toLowerCase();
		if(S1.length()<26)
			System.out.println("Not Panagram");
		else
		{
			if(S1.contains("a") && S1.contains("b") && S1.contains("c") && S1.contains("d") && S1.contains("e") && S1.contains("f") && S1.contains("g") && S1.contains("h") && S1.contains("i") && S1.contains("j") && S1.contains("k") && S1.contains("l") && S1.contains("m") && S1.contains("n") && S1.contains("o") && S1.contains("p") && S1.contains("q") && S1.contains("r") && S1.contains("s") && S1.contains("t") && S1.contains("u") && S1.contains("v") && S1.contains("w") && S1.contains("x") && S1.contains("y") && S1.contains("z"))
				System.out.println("Panagram");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.nextLine();
		isPanagram(s);
	}
}
