
public class FireWeapon extends MagicWeapon{

	private int damage = 5;
	
	public FireWeapon(Weapon w) {
		super(w);
	}
	public int getDamage(){
		return super.getDamage()+this.damage;
		}
	
}
