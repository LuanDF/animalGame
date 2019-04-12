package entities;

public class Animal {
	
	private String name;
	private String noise;
	private String livesOnWater;
	
	
	public Animal() {
	}
	
	public Animal(String name, String noise, String livesOnWater) {
		this.name = name;
		this.noise = noise;
		this.livesOnWater = livesOnWater;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNoise() {
		return noise;
	}
	public void setNoise(String noise) {
		this.noise = noise;
	}
	public String getLivesOnWater() {
		return livesOnWater;
	}
	public void setLivesOnWater(String livesOnWater) {
		this.livesOnWater = livesOnWater;
	}

	@Override
	public String toString() {
		return name + noise + livesOnWater;
	}
	
}
