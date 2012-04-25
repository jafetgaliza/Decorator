
public class LightningWeapon extends MagicWeapon{
	

	private int damage = 10;
	
	public LightningWeapon(Weapon w) {
		super(w);
		
	}
	
	public int getDamage(){
		return super.getDamage()+this.damage;
	}
}
