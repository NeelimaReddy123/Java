package com.kodnest.training;

public class JourneyCalculator {

	public static void main(String[] args) {
		JourneyCalculator journeyCalculator2 = new JourneyCalculator();

		double res=journeyCalculator2.calculateDistance(60.0, 1.5);
		// TODO Auto-generated method stub
	    System.out.printf("%.2f\n",res);

	}
	
		public double calculateDistance(double speed, double time)
		
		{
			 
			return speed*time;
		}
	
	
	}


