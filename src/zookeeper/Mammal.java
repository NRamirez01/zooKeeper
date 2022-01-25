package zookeeper;

public class Mammal {
	protected static int energyLevel = 100;
	
	public int displayEnergy(){
		System.out.println(energyLevel);
		return energyLevel;
	}
}
