public class Protagonist extends Character {
    private String name;

    protected double default_attack = 0.4;
    protected int default_defense = 40;


    //initializes all attributes to parenthesized example numbers
    public Protagonist(String title) {
    	name = title;
        hp = 125;
        strength = 100;
        defense = 40;
        attack = 0.4;
    }

    public String getName() {
	   return name;
    }
    
    public void specialize() {
    	defense -= 10;
        attack += 0.1;
    }

    public void normalize() {
    	defense = default_defense;
        attack = default_attack;
    }
	
    public String toString() {
        return super.toString() + System.lineSeparator() + "name: " + name;
    }
}
class Rogue extends Protagonist {
    public Rogue(String name) {
	super(name);
	hp = 75;
    	default_attack = attack = 0.8;
    }
    
    public String toString() {
        return super.toString() + System.lineSeparator() + "type: Rogue";
    }
}
class Paladin extends Protagonist {
        public Paladin(String name) {
	super(name);
    	hp = 250;
    	strength = 80;
    }
    
    public String toString() {
        return super.toString() + System.lineSeparator() + "type: Paladin";
    }
}
class Mage extends Protagonist {
        public Mage(String name) {
	super(name);
    	hp = 80;
    	default_defense = defense = 60;
    }
	
    public String toString() {
        return super.toString() + System.lineSeparator() + "type: Mage";
    }
}
