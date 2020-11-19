package com.tls.oopsConcept;

public class Operators {
	static int a = 10, b = 20, x = 30, a1 = 10, b1 = -10, a2 = 5, b2 = 2, a3;
	static int min = (a2 < b2) ? a2 : b2;
	static boolean c = true, d = false;

	public static void main(String[] args) {

		// unary operators

		System.out.println(a++);// (10)11
		System.out.println(++a);// 12
		System.out.println(b--);// (20)19
		System.out.println(--b);// 18
		System.out.println(x++ + ++x);// 30+32
		System.out.println(a-- + --b);// 11+
		System.out.println(~a1);// -11
		System.out.println(~b1);// 9
		System.out.println(!c);// false it will occurs
		System.out.println(!d);// true

		// shift operators

		System.out.println(a2 << b2);// 5*2^2 leftshift operator
		System.out.println(a2 >> b2);// 5/2^2 rightshift operator

		// Logical operators operators
		// The logical && operator doesn't check second condition if first condition is
		// false. It checks second condition only if first one is true.

		System.out.println(a < b && a < x);// true&&true=true
		System.out.println(a < a1 && x < b);// false&&false=false

		System.out.println(a < b || a < x);// true||true=true
		System.out.println(b > a || a > x);// true||false=true
		System.out.println(a < a1 || x < b);// false||false=false

		// Bitwise operator
		// The bitwise & operator always checks both conditions whether first condition
		// is true or false.

		System.out.println(a < b & x < b);// true&false=false
		System.out.println(a < b & b < x);// true&true=true
		System.out.println(a < b | x < b);// true|false=true
		System.out.println(b < a | b < x);// false|false=true

		// Ternary Operator

		System.out.println(min);

		// Relational Operators

		System.out.println(a == b);// false
		System.out.println(a != b);// true
		System.out.println(a > b);// false
		System.out.println(a < b);// true
		System.out.println(a >= b);// false
		System.out.println(a <= b);// true

		// Assignment Operator
		a3 = (int) (a + b);
		System.out.println(a3);

	}

}
