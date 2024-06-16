public class Hero {
    private int health;
    private int damage;
    private String heroesAttacksType;

    public Hero(int health, int damage, String heroesAttacksType) {
        this.health = health;
        this.damage = damage;
        this.heroesAttacksType = heroesAttacksType;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.heroesAttacksType = "None";
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getHeroesAttacksType() {
        return heroesAttacksType;
    }
}
