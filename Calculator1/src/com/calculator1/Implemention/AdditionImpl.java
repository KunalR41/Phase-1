package com.calculator1.Implemention;

import com.calculator1.interfaces.Addition;

public class AdditionImpl implements Addition {
	public void add(int a, int b) {
		int result;
		result=a+b;
		System.out.println("Addition of Numbers is :>>" + result);
	}

}
