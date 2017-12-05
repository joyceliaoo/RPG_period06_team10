public class Monster extends Character {

    //initializes all attributes to parenthesized example numbers
    public Monster() {
	hp = 150;
	strength =  20 + (int) (Math.random() * 45.0);
	defense = 20;
	attack = 1.0;
    }
}
