package com.study.baekjoon;

import java.util.Scanner;

public class ex02_from1000_10869 {
	public static void main(String[] args) {
		
		//예제 2번
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		//1000번
		System.out.println(a+b);
		//1001번
		System.out.println(a-b);
		//10998번
		System.out.println(a*b);
		//1008번
		System.out.println((double)a/b);
		
		System.out.println(a/b);
		//10869번
		System.out.println(a%b);
	
		String name = scn.nextLine();
		
		if(name.equals("joonas")) {
			System.out.println(name+"??!");
		}
	}
}
