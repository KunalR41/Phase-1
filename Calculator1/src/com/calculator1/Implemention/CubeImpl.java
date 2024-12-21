package com.calculator1.Implemention;

import com.calculator1.interfaces.Cube;

public class CubeImpl implements Cube {
	@Override
	public void cube(int a) {
		int result;
		result=a*a*a;
		System.out.println("Cube of Number is :>>" + result);
	
	}
}
