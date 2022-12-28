package com.study.baekjoon;

import java.util.Scanner;

public class ex05_3003 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int king = 1;
		int queen = 1;
		int rook = 2;
		int bishop = 2;
		int knight = 2;
		int pawn = 8;
		
		king = king - scn.nextInt();
		queen = queen - scn.nextInt();
		rook = rook - scn.nextInt();
		bishop = bishop - scn.nextInt();
		knight = knight - scn.nextInt();
		pawn = pawn - scn.nextInt();
		
		System.out.print(king + " ");
		System.out.print(queen + " ");
		System.out.print(rook + " ");
		System.out.print(bishop + " ");
		System.out.print(knight + " ");
		System.out.print(pawn + " ");
		
	}
}
