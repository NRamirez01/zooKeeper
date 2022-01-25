package zookeeper;

public class Mammal {
	private int energyLevel = 100;
	
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergy(){
		System.out.println(energyLevel);
		return energyLevel;
	}
}
