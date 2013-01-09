package com.example.hello;

/**
 * Hello is a class
 * @author nrb
 * @since 1.0
 */
public class Hello {

	/**
	 * @param args
	 */
	/**
	 * main is the entry point method that JVM executes
	 * @param args the command line arguments passed into java
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		int y = 7;
		String name = args[0];
		String message = "Hello Number";
		//print out a string and the number
		System.out.println(message + " " + x);
		System.out.println(message + " " + y);
		//print out a string and sum of numbers
		System.out.println(message + " " + (x + y));
		System.out.println("Hello "+ name);
		System.out.println("Hello World");
		
		byte[] bytes = {0, 1, 2, 3};
		int foo = bytes.length;
		
		if (1 + 1 >= 2) {
			System.out.println("Everything is OK");
		} else {
			System.out.println("I cannot do math");
		}
		
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			//i = i + 1;
			i++;
		}
		
		for (int j = 0; j < args.length; j++) {
			
		}
		
		String[] words = { "Hello", "World" };
		for (String word : words) {
			System.out.println(word);
		}
		
	}

}
