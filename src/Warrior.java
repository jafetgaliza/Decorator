

public class Warrior {

	private String name;
	private Weapon weapon;
	private int energy;
	
	public Warrior(String name, int energy){
	this.weapon = new Sword();
	this.energy  = energy;
	this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public void change(){
		this.weapon = weapon.change();
	}
	public void atack(Warrior w){
		weapon.atack();
		w.setEnergy(w.getEnergy()-weapon.getDamage());
	}
}
