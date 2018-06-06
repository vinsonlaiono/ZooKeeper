
public class Bat extends Mammal {
	public void fly() {
		energyLevel -= 50;
		System.out.println("Swoosh...bye bye!");
	}
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("Numnumnum");
	}
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("Theres fire everywhere!");
		
	}
}
