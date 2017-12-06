public class Character {
    protected int hp, strength, defense;
    protected double attack;

    public String toString() {
        return "HP: " + hp
            + System.lineSeparator() 
            + "strength: " + strength
            + System.lineSeparator()
            + "defense: " + defense
            + System.lineSeparator()
            + "attack: " + attack;
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
