
public class Gorrila extends Mammal {
	
	public void throwSomething() {
		energyLevel = energyLevel - 5;
		System.out.println("Take that sucka!");
		System.out.println("Energy Level: " + energyLevel);
	}
	public void eatBananas() {
		energyLevel = energyLevel +5;
		System.out.println("Mmmm that was good!");
		System.out.println("Energy Level: " + energyLevel);
	}
	public void climb() {
		energyLevel = energyLevel -10;
		System.out.println("That was fun. lets do it again!");
		System.out.println("Energy Level: " + energyLevel);
	}
}
