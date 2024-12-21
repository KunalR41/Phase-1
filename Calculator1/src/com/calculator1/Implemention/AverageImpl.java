package com.calculator1.Implemention;

import com.calculator1.interfaces.Average;

public class AverageImpl implements Average {

	@Override
	    public void average(int a) {
	        int sum = 0;
	        for (int i = 1; i <= a; i++) {
	            sum += i;
	        }
	        double result = sum / a;
	        System.out.println("Average of Number" + a + " is :>> " + result);
	    }
}
