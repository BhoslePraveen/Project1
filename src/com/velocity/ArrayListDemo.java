package com.velocity;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(15);
		al.add(20);

		for (Integer num : al) {
			System.out.println(num);
		}

	}

}
