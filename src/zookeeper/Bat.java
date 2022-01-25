package zookeeper;

public class Bat extends Mammal{
	public int energyLevel = 300;
	
	public void fly() {
		if(energyLevel >= 50) {
			energyLevel -= 50;
			System.out.println("*bat taking off sound*");
		}
		else {
			System.out.println("You are overencumbered.");
		}
	}
	
	public void eatHumans() {
		energyLevel += 25;
	}
	
	public void attackTown() {
		if(energyLevel >= 100) {
			System.out.println("We break the wheel together. -Daenerys Targaryen");
			energyLevel -= 100;
		}
		else {
			System.out.println("You are overencumbered.");
		}
	}
}
