package zookeeper;

public class Mammal {
	protected static int energyLevel = 100;
	
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergy(){
		System.out.println(energyLevel);
		return energyLevel;
	}
}
