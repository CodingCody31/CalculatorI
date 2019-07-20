package com.calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		
		Calculator operate1 = new Calculator();
		operate1.setOperandOne(3.5);
		operate1.setOperandTwo(3.5);
		operate1.setOperation("-");
		operate1.performOperation(operate1.getOperandOne(), operate1.getOperation(), operate1.getOperandTwo());
		System.out.println(operate1.getResults());
	}

}
