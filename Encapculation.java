package com.tls.oopsConcept;

public class Encapculation {
	private int a = 10;
	private int b = 5;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void unaryoperators() {
		System.out.println("unaryoperators=" + ++a);
		System.out.println(++b + a++);
	}

	public void shiftoperators() {

		System.out.println(a << b);
		System.out.println(a >> b);
	}

	public void Logicaloperator() {

		System.out.println(a < b && b < a);
		System.out.println(a < b || b < a);
	}

	public void Bitwiseoperator() {

		System.out.println(a < b & b < a);
		System.out.println(a < b | b < a);
	}

	public void Relationaloperators() {

		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
	}

}
