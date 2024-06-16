public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setDefenceType("Magic");

        System.out.println("Info Boss: " + "\nHealth: " + boss.getHealth() + "\nDamage: " + boss.getDamage() + "\nDefenceType: " + boss.getDefenceType());
        Hero[] heroes = createHeroArray();
        System.out.println("Heroes Info: ");
        for (Hero hero : heroes) {
            System.out.println("Hero Health: " + hero.getHealth() + "\nHero Damage: " + hero.getDamage() + "\nHero Attack Type: " + hero.getHeroesAttacksType());
        }
        ;
    }

    public static Hero[] createHeroArray() {
        Hero hero1 = new Hero(280, 35, "Physical");
        Hero hero2 = new Hero(250, 25);
        Hero hero3 = new Hero(200, 10, "Kinetic");
        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}