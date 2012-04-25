


public class Principal {
	
	
	
	public static void main(String[] args){
		Warrior w1 = new Warrior("jose", 100);
		Warrior w2 = new Warrior("Toinho", 100);
		
		w1.atack(w2);
		System.out.println("A energia de "+w2.getName()+" é "+w2.getEnergy());
		w1.change();
		
		w1.atack(w2);
		System.out.println("A energia de "+w2.getName()+" é "+w2.getEnergy());
		w1.change();
		
		w1.atack(w2);
		System.out.println("A energia de "+w2.getName()+" é "+w2.getEnergy());
		w1.change();
	}
}
