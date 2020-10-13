package com.sunita;

public class DataTypeExamples {

	int num1 = 15;

	// Addition of two numbers
	public void addTwoNumbers() {

		int total;
		total = num1 + 10;
		System.out.println("Addition of two numbers is " + total);
	}

	public static void main(String[] args) {
		DataTypeExamples objDataTypeExamples = new DataTypeExamples();
		objDataTypeExamples.addTwoNumbers();
	}

}
