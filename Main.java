package Exe3Constructor;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome To Gadget Shop");
		System.out.println("Gadget  : Mouse");
		
		Mouse Corsair = new Mouse();
		System.out.println("======Corsair======");
		System.out.println("Model : " + Corsair.model);
		System.out.println("Color : " + Corsair.color);
		System.out.println("Brand : " + Corsair.brand);
		System.out.println("Weight(g) : " + Corsair.weight);
		System.out.println("Wireless : " +  Corsair.wireless);
		System.out.println("Battery Life : " + Corsair.batteryLife +" Days");
		System.out.println();
		
		Mouse Logitech = new Mouse("MX Master 3","Black","Logitech",100.0, "Yes",70);
		System.out.println("======Logitech======");
		System.out.println("Model :" + Logitech.model);
		System.out.println("Color :" + Logitech.color);
		System.out.println("Brand : " + Logitech.brand);
		System.out.println("Weight(g) : " +  Logitech.weight);
		System.out.println("Wireless : " + Logitech.wireless);
		System.out.println("Battery Life: " + Logitech.batteryLife +" Days");
		System.out.println();
		}

}
