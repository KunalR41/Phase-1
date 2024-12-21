package com.calculator1.Implemention;

import com.calculator1.interfaces.Square;

public class SquareImpl implements Square {
	@Override
	public void square(int a) {
		int result;
		result=a*a;
		System.out.println("Square of Number is :>>" + result);
		
	}

}
