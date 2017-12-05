public class Protagonist extends Character {
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

    public void normalize() {
	defense = 40;
        attack = 0.4;
    }
}
