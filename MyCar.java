package week1.day1;

public class MyCar {
	
		
	public void applyBreak() {
		System.out.println("Apply Break");
	}
	
	public void applyGear() {
		System.out.println("Apply Gear");
	}
	
	public void switchonAc () {
		System.out.println("Switch on AC");
	}
	
	public void applyAcclerate() {
		System.out.println("Apply Acclerate");
	}
	
	public static void main(String[] args) {
		
		MyCar Car =new MyCar();
		
		Car.applyBreak();
		Car.applyGear();
		Car.switchonAc();
		Car.applyAcclerate();
	}

}
