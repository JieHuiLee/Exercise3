package Exe3Constructor;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome To Gadget Shop");
		System.out.println("Gadget  : Mouse");
		
		Mouse IronclawRGB = new Mouse();
		System.out.println("======Corsair======");
		System.out.println("Model : " + IronclawRGB.model);
		System.out.println("Color : " + IronclawRGB.color);
		System.out.println("Brand : " + IronclawRGB.brand);
		System.out.println("Weight(g) : " + IronclawRGB.weight);
		System.out.println("Wireless : " +  IronclawRGB.wireless);
		System.out.println("Battery Life : " + IronclawRGB.batteryLife +" Days");
		System.out.println();
		
		Mouse MXMaster3 = new Mouse("MX Master 3","Black","Logitech",100.0, "Yes",70);
		System.out.println("======Logitech======");
		System.out.println("Model :" + MXMaster3.model);
		System.out.println("Color :" + MXMaster3.color);
		System.out.println("Brand : " + MXMaster3.brand);
		System.out.println("Weight(g) : " +  MXMaster3.weight);
		System.out.println("Wireless : " +  MXMaster3.wireless);
		System.out.println("Battery Life: " + MXMaster3.batteryLife +" Days");
		System.out.println();
	
	}

}
