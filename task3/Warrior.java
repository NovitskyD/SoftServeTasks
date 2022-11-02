package softserve.task3;

public class Warrior extends Hero{
    Enemy enemy = new Enemy(165);
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        if (!enemy.isAlive()) {
            System.out.println("Enemy is dead");
            System.exit(0);
        }
        else {
            System.out.println("Warrior attacking...");
            enemy.takeDamage(50);
            enemy.showHealth();
        }
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                '}';
    }
}
