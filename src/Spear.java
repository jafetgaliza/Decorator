

public class Spear implements Weapon{
	
	private int damage = 20;
	
	public Spear(){
		
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	@Override
	public void atack() {
		System.out.println("Ataque com lança bem sucedido");
		
	}

	@Override
	public Weapon change() {
		return new Sword();
	}

}
