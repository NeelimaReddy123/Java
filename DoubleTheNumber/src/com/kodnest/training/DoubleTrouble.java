package com.kodnest.training;

import java.util.Scanner;

public class DoubleTrouble {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int res=doubleTheNumber(num);
		System.out.println("num is"+ res);
		scan.close();
		
	}
	public static int doubleTheNumber(int num) {
		return num*2;
	}

}
