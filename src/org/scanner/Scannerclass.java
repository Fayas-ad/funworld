package org.scanner;

import java.util.Scanner;

public class Scannerclass {
	public void scan() {
		Scanner as =new Scanner(System.in);
		System.out.println("user need to enter x and y values");
		int x=as.nextInt();
		int y=as.nextInt();
		int z=2*x+3*y;
		System.out.println(z);
		
		System.out.println("user has to enter string value");
		String aa=as.nextLine();
		System.out.println(aa);
		String cv=as.nextLine();
		System.out.println(cv);
		
		System.out.println("enter float value");
		float ae=as.nextFloat();
		System.out.println(ae);
		
		System.out.println("enter byte value");
		byte des=as.nextByte();
		System.out.println(des);
		
	}
	public static void main(String[] args) {
		Scannerclass df =new Scannerclass();
		df.scan();
	}

}
