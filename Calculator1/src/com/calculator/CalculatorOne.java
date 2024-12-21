package com.calculator;
import java.util.Scanner;
import com.calculator1.Implemention.*;


public class CalculatorOne {
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);

   
   
	
	System.out.println("Welcome to console based application");
	System.out.println("1. Addition of two number");
	System.out.println("2. Subtraction of two number");
	System.out.println("3. Multiplication of two number");
	System.out.println("4. Division of two number");
	System.out.println("5. Modulus of two number");
	System.out.println("6. Square of number");
	System.out.println("7. Cube of number");
	System.out.println("8. Average of numbers");
	System.out.println("9. Factors of numbers");
	System.out.println("10.Find out even or odd number");
	System.out.println(" ");
	System.out.println("Enter Your Choice-->>");
	
	int choice=scanner.nextInt();
	
	switch(choice) {
	
	case 1:
		 AdditionImpl addition = new AdditionImpl();
		System.out.println("Enter the first number >>");
		int a=scanner.nextInt();
		System.out.println("Enter the second number >>");
		int b=scanner.nextInt();
		addition.add(a,b);
	break;
	case 2:
		SubstractionImpl substraction =new SubstractionImpl();
		System.out.println("Enter the first number >>");
		int c=scanner.nextInt();
		System.out.println("Enter the second number >>");
		int d=scanner.nextInt();
		substraction.sub(c,d);
		break;
	case 3:
		MultiplicationImpl multiplication=new MultiplicationImpl();
		System.out.println("Enter the first number >>");
		int e=scanner.nextInt();
		System.out.println("Enter the second number >>");
		int f=scanner.nextInt();
		multiplication.multiply(e,f);
		break;
	case 4:
		DivisionImpl division =new DivisionImpl();
		System.out.println("Enter the first number >>");
		int i=scanner.nextInt();
		System.out.println("Enter the second number >>");
		int k=scanner.nextInt();
		division.divide(i,k);
		break;
	case 5:
		ModulusImpl modulus =new ModulusImpl();
		System.out.println("Enter the first number >>");
		int a1=scanner.nextInt();
		System.out.println("Enter the second number >>");
		int a2=scanner.nextInt();
		modulus.modulus(a1, a2);
		break;
	case 6:
		SquareImpl square=new SquareImpl();
		System.out.println("Enter the Number >>");
		int a3=scanner.nextInt();
		square.square(a3);
	case 7:
		CubeImpl cube=new CubeImpl();
		System.out.println("Enter the Number >>");
		int a4=scanner.nextInt();
		cube.cube(a4);
	case 8:
		AverageImpl avg=new AverageImpl();
		System.out.println("Enter the Number >>");
		int b1=scanner.nextInt();
		avg.average(b1);
	case 9:
		FactorImpl factor=new FactorImpl();
		int b2=scanner.nextInt();
		factor.factor(b2);
	case 10:
		EvenOddImpl num= new EvenOddImpl();
		int b3=scanner.nextInt();
		num.evenOdd(b3);
		default:
			System.out.println("Incorrect choice....!!!!");
			
		
		
		
	}

}
}
