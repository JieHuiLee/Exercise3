package Exe3Constructor;

import java.util.Scanner;

public class Mouse {
	String model;
	String color;
	String brand;
	double weight;
	String wireless;
	int batteryLife;
	
	Scanner read = new Scanner(System.in);
	//default constructor
	//Mouse MXMaster3 = new Mouse();
	Mouse() {
		
		System.out.println("Enter Wireless");
		this.wireless = read.nextLine();
		read.nextLine();
		System.out.println("Enter Battery Life (Days)");
		this.batteryLife = read.nextInt();		
		read.nextLine();
		System.out.println("Enter Model");
		this.model = read.nextLine();
		read.nextLine();		
		System.out.println("Enter Color");
		this.color = read.nextLine();
		read.nextLine();	
		System.out.println("Enter Brand");
		this.brand = read.nextLine();	
		read.nextLine();
		System.out.println("Enter Weight");
		this.weight = read.nextDouble();
			
	}
		
	//Parameterized constructor
	Mouse(String m, String c, String b, double w,String wl,int l){
			this.model = m;
			this.color = c;
			this.brand = b;
			this.weight = w;
			this.wireless = wl;
			this.batteryLife = l;
	}

}
