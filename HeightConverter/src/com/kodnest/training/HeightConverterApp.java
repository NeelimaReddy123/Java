package com.kodnest.training;
public class HeightConverterApp {
	public static void main(String[] args) {
		
		HeightConverter height=new HeightConverter();
		System.out.printf("%.2f\n",height.convertInchesToFeet(72.0));
	}

}
