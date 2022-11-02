package softserve.task3;

import java.util.Random;

public class Mage extends Hero{
    Enemy enemy = new Enemy(200);
    public Mage(String name) {
        super(name);
        Health = 220;
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
                System.out.println("Mage attacking...");
                enemy.takeDamage(60);
                enemy.showHealth();
            } else {
                System.out.println("Enemy attacking...");
                takeDamage();
                showHealth();
            }
        }
    }
    @Override
    public void takeDamage(){
        Health -= 50;
    }

    @Override
    public String toString() {
        return "Mage{" +
                "name='" + name + '\'' +
                ", Health=" + Health +
                '}';
    }
}
