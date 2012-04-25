

public class Knife implements Weapon{
 
	private int damage = 5;
	
	public Knife(){
	
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	@Override
	public void atack() {
		System.out.println("Ataque com faca bem sucedido");
		
	}

	@Override
	public Weapon change() {
		
		return new Spear();
	}

	
}
