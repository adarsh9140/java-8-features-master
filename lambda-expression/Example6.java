package com.javamultiplex.lambda;

import java.util.concurrent.atomic.AtomicInteger;

interface Interf {
	public void m1();
}

/*
 * The local variables referenced from lambda expression are implicitly final
 * and hence we can’t perform re-assignment for those local variables otherwise
 * we get compile time error.
 */
public class Example6 {

	int x = 10;

	public void m2() {
		AtomicInteger y = new AtomicInteger(20); // if we want to change local var inside lambda
		Interf i = () -> {
			System.out.println(x); // 10
			System.out.println(y.get()); // 20
			x = 100;
			System.out.println(x);
			y.set(300); // Compile Time Error if we remove atomic variable

			System.out.println(y);
		};
		i.m1();
	}

	public static void main(String[] args) {

		Example6 ex = new Example6();
		ex.m2();

	}

}
