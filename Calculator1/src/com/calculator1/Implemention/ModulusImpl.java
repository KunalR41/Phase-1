package com.calculator1.Implemention;

import com.calculator1.interfaces.Modulus;

public class ModulusImpl implements Modulus {
	@Override
	public void modulus(int a, int b) {
		int result;
		result=a%b;
		System.out.println("Modulus of Numbers is :>>" + result);
		
	}

}
