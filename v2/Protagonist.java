public class Protagonist extends Character {
    private String name;

    private double default_attack = 0.4;
    private int default_defense = 40;


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
}
class Rogue extends Protagonist {
    public Rogue() {
	hp = 75;
	attack = 2;
    }
}
class Paladin extends Protagonist {
    public Paladin() {
	hp = 250;
	strength = 80;
    }    
}
class Mage extends Protagonist {
    public Mage() {
	hp = 80;
	attack = 5;
    }
}
