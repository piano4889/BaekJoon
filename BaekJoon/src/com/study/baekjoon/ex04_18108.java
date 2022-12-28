package com.study.baekjoon;

import java.util.Scanner;

public class ex04_18108 {
	public static void main(String[] args) {
		//서기와 불기의 차이는 543년 차이
		
		Scanner scn = new Scanner(System.in);
		
		int year = (scn.nextInt()-543);
		
		System.out.println(year);
	}
}
