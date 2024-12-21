package com.calculator1.Implemention;

import com.calculator1.interfaces.Substraction;

public class SubstractionImpl implements Substraction {
	public void sub(int a, int b) {
		int result;
		result=a-b;
		System.out.println("Substraction of Numbers is :>>" + result);
	}
}
