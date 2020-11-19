package com.tls.oopsConcept;

public class Rectangle extends Triangle {
	public void rarea() {
		System.out.println("Area of Rectangle =" + l * b);
	}

	public void rperimeter() {
		System.out.println("Perimeter of Rectangle=" + (2 * (l + w)));
	}
}
