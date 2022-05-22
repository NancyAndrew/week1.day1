package week1.day1;

public class MyCars {
	
	//create a MyCars class and create an object for existing MyCar class and call all the method of MyCar class
// Objective: if access modifier is declared as public then we can call the method anywhere in the project folder
	//(Under any package/class into the current class
	
	public static void main(String[] args) {
		
		MyCar red = new MyCar();
		
			red.applyBreak();
			red.applyGear();
			red.applyAcclerate();
			red.switchonAc();
		
	}

}
