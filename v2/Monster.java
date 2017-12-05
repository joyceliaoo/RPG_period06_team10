public class Monster extends Character {

    //initializes all attributes to parenthesized example numbers
    public Monster() {
	hp = 150;
	strength =  20 + (int) (Math.random() * 45.0);
	defense = 20;
	attack = 1.0;
    }
}

class Giant extends Monster {

    public Giant() {
	hp = 200;
	strength = 30 + (int) (Math.random() * 45.0);
	defense = 5;
	attack = 1.5;
    }
}

class Spider extends Monster {

    public Spider() {
	hp = 100;
	defense = 30;
    }
}
