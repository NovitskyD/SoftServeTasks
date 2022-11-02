package softserve.task3;

import java.util.Random;

public class Warrior extends Hero{
    Enemy enemy = new Enemy(165);
    public Warrior(String name) {
        super(name);
        Health = 300;
        random = new Random();
    }

    @Override
    public void attackEnemy() {
        int turn = random.nextInt(2);
        if (!enemy.isAlive() || !isAlive()) {
            System.exit(0);
        }
        else {
            if (turn == 0) {
                System.out.println("Warrior attacking...");
                enemy.takeDamage(20);
                enemy.showHealth();
            } else {
                System.out.println("Enemy attacking...");
                takeDamage();
                showHealth();
            }
        }
    }

    @Override
    public void takeDamage() {
        Health -= 20;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", Health=" + Health +
                '}';
    }
}
