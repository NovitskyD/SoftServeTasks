package softserve.task3;

public class Mage extends Hero{
    Enemy enemy = new Enemy(200);
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        if (!enemy.isAlive()) {
            System.out.println("Enemy is dead");
            System.exit(0);
        }
        else {
            System.out.println("Mage attacking...");
            enemy.takeDamage(70);
            enemy.showHealth();
        }
    }

    @Override
    public String toString() {
        return "Mage{" +
                "name='" + name + '\'' +
                '}';
    }
}
