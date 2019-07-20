package com.calculator;


public class Calculator implements java.io.Serializable {
	
	private double num1, num2, result;
	private String operation;
	
	
	public Calculator(){	
	}
	
	public void setOperandOne(double num) {
		this.num1 = num;
	}
	
	public void setOperandTwo(double num) {
		this.num2 = num;
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public double performOperation(double num1 , String operation, double num2) {
		if (this.operation == "+") {
			result = this.num1 + this.num2; 
		}
		else if (this.operation == "-"){
			result = this.num1 - this.num2;
		}
		return result;
	}
	
	public double getResults() {
		
		return result;
	}
	
	public double getOperandOne() {
		return num1;
	}
	
	public double getOperandTwo() {
		return num2;
	}
	
	public String getOperation() {
		return operation;
	}
}
