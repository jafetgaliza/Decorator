

public class Sword implements Weapon {
	
	private int damage = 10;
	
	public Sword(){
		
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public void atack() {
		System.out.println("Ataque com espada bem sucedido");
		
	}

	@Override
	public Weapon change() {
		
		return new Knife();
	}

}
