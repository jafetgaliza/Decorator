
public class MagicWeapon implements Weapon{

	private Weapon weapon = null;
	
	public MagicWeapon(Weapon w){
		this.weapon = w;
	}
	
	@Override
	public void atack() {
		
		
		
	}

	@Override
	public Weapon change() {
		
		return null;
	}

	@Override
	public int getDamage() {
		
		return weapon.getDamage();
	}

}
