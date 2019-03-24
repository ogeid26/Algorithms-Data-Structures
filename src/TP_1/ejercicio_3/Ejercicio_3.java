package TP_1.ejercicio_3;

import java.util.function.Function;

public class Ejercicio_3 {


	public static <T extends Comparable<T>> Comparable<T>[] merge(T[] a, T[] b) {
		Comparable<T>[] c = new Comparable[a.length + b.length];

		int indexOfC = 0;
		int indexOfA = 0;
		int indexOfB = 0;


		while (indexOfA <= a.length) {
			if (a[indexOfA].compareTo(b[indexOfB]) >= 0) {
				c[indexOfC++] = a[indexOfA++];
			} else if (indexOfB <= b.length) {
				c[indexOfC++] = b[indexOfB++];
			}
		}

		while (indexOfB <= b.length) {
			c[indexOfC++] = b[indexOfB++];
		}

		return c;
	}


}
