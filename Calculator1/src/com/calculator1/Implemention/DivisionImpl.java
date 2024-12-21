package com.calculator1.Implemention;

import com.calculator1.interfaces.Division;

public class DivisionImpl implements Division {
	public void divide(int a, int b) {
		int result;
		if (b==0) {
			System.out.println("Number is Not Divisible by 0....!!!");
		}else {
			result=a/b;
		System.out.println("Division of Numbers is :>>" + result);
		}
	}
}
