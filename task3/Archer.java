package softserve.task3;

public class Archer extends Hero{
    Enemy enemy = new Enemy(150);
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        if (!enemy.isAlive()) {
            System.out.println("Enemy is dead");
            System.exit(0);
        }
        else {
            System.out.println("Archer attacking...");
            enemy.takeDamage(30);
            enemy.showHealth();
        }
    }

    @Override
    public String toString() {
        return "Archer{" +
                "name='" + name + '\'' +
                '}';
    }
}
