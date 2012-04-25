
public class PoisonWeapon extends MagicWeapon{
	

	private int damage = 3;
	
	public PoisonWeapon(Weapon w) {
		super(w);
		
	}
	
	
	public int getDamage(){
		return super.getDamage()+this.damage;
	}
}
