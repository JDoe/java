package com.example.hello;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x = Integer.parseInt("foo");
			System.out.println(x);
		} catch (NumberFormatException e) {
			//catch block
			System.out.println("not a number");
		}
		System.out.println("Some other stuff");
	}

}
