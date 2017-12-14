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

    public abstract void normalize();

    public String basicInfo() {
         return "name: " + name
                + System.lineSeparator()
                + super.toString();

    }
	
    public abstract String toString() ;

}

class Rogue extends Protagonist {
    public Rogue(String name) {
    	super(name);
    	hp = 75;
        attack = 0.8;
    }
    
    public String toString() {
        return  this.basicInfo()
                + System.lineSeparator() 
                + "type: Rogue";
    }

    public void normalize() {
        defense = 40;
        attack = 0.8;
    }
}

class Paladin extends Protagonist {
    public Paladin(String name) {
	   super(name);
    	hp = 250;
    	strength = 80;
    }
    
    public String toString() {
        return  this.basicInfo()
                + System.lineSeparator() 
                + "type: Paladin";
            }

    public void normalize() {
        defense = 40;
        attack = 0.4;
    }
        }

class Mage extends Protagonist {
    public Mage(String name) {
    	super(name);
        hp = 80;
        defense = 60;
    }
	
    public String toString() {
        return  this.basicInfo()
                + System.lineSeparator() 
                + "type: Mage";
            }

    public void normalize() {
        defense = 60;
        attack = 0.4;
    }
        }









