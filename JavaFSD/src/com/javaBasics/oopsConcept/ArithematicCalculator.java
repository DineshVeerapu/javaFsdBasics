package com.javaBasics.oopsConcept;

import java.util.Scanner;

class Help{
	
public int	addition (int num1, int num2)
	{
		int num = num1 + num2 ;
		return num;
				
	}

public int	subtraction (int num1, int num2)
{
	int num = num1 - num2 ;
	return num;
			
}

public int	division (int num1, int num2)
{
	int num = num1/ num2 ;
	return num;
			
}
public int	multiplication (int num1, int num2)
{
	int num = num1 * num2 ;
	return num;
			
}

}

public class ArithematicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num1 = new Scanner(System.in);
		Scanner num2 = new Scanner(System.in);
		
	System.out.println("Enter the first number to be calculated : ");	
	
	int number1=num1.nextInt();
	
	System.out.println("Enter the second number to be calculated : ");
	
	int number2=num2.nextInt();	
	
	Help arcal = new Help();
	
	System.out.println("Result of two number addition is :" + arcal.addition(number1, number2)  );
	System.out.println("Result of two number subtraction is :" + arcal.subtraction(number1, number2)  );
	System.out.println("Result of two number multiplication is :" + arcal.multiplication(number1, number2)  );
	System.out.println("Result of two number division is :"+ arcal.division(number1, number2)  );

	}

}
