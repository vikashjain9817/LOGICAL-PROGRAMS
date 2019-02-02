package com.capgemini.view;

import java.util.Scanner;

public class JobSeeker{

	public static boolean checkName(String s) {
		s.toLowerCase();
		int  l = s.length();
		l = l - 3;
		String subString1 = s.substring(l);
		String subString2 = s.substring(0, l);
		System.out.println(subString1);
		System.out.println(subString2);
		if(subString1.equals("job"))
		{
			if(subString2.length() >= 8)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("enter user name");
		Scanner sc = new Scanner(System.in);
		String s  = sc.nextLine();
		if(checkName(s)) {
			System.out.println(" :: user name accepted ::");
		}
		else
			System.out.println(":: invalid format ::");
	}

}
