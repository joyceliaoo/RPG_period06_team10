public abstract class Protagonist extends Character {

    /** error message without adding "abstracting" in class header:
     * Protagonist.java:1: error: Protagonist is not abstract and does not override abstract method toString() in Protagonist
     */

    /** error message when trying to instantiate a Protagonist instance
     * Protagonist.java:42: error: Protagonist is abstract; cannot be instantiated
     */

    /** error message when a subclass of Protagonist does not contain toString
     * Protagonist.java:46: error: Rogue is not abstract and does not override abstract method toString() in Protagonist
     */


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
	
    public abstract String toString() ;

}

class Rogue extends Protagonist {
    public Rogue(String name) {
    	super(name);
    	hp = 75;
        default_attack = attack = 0.8;
    }
    
    public String toString() {
        return  "name: " + getName() 
                + System.lineSeparator() 
                + "type: Rogue"
                + System.lineSeparator()
                + "HP: " + hp
                + System.lineSeparator() 
                + "strength: " + strength
                + System.lineSeparator()
                + "defense: " + defense
                + System.lineSeparator()
                + "attack: " + attack;
    }
}

// class Paladin extends Protagonist {
//         public Paladin(String name) {
// 	super(name);
//     	hp = 250;
//     	strength = 80;
//     }
    
//     // public String toString() {
//     //     return super.toString() + System.lineSeparator() + "type: Paladin";
//     // }
// }

// class Mage extends Protagonist {
//         public Mage(String name) {
// 	super(name);
//     	hp = 80;
//     	default_defense = defense = 60;
//     }
	
//     // public String toString() {
//     //     return super.toString() + System.lineSeparator() + "type: Mage";
//     // }
// }









