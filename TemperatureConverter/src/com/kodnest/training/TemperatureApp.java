package com.kodnest.training;

public class TemperatureApp {
	public static void main(String[] args) {
		TemperatureConverter temperatureConverter = new TemperatureConverter();

		System.out.printf("%.2f\n",temperatureConverter.convertFahrenheitToCelsius(68.0));
	}

}
