public class Character {
    protected int hp, strength, defense;
    protected double attack;

    public String toString() {
        return "HP: " + hp 
            + "\nstrength: " + strength
            + "\ndefense: " + defense
            + "\nattack: " + attack;
    }


    public boolean isAlive() {
        return hp > 0;
    }

    public int getDefense() {
	return defense;
    }

    public void lowerHP(int damage) {
	hp = hp - damage;
    }

    public int attack(Character opposing) {
	int dmg;
	dmg = (int) (strength * attack) - opposing.getDefense();
	opposing.lowerHP(dmg);
	return dmg;
    }
}
