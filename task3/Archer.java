package softserve.task3;

import java.util.Random;

public class Archer extends Hero{
    Enemy enemy = new Enemy(150);
    public Archer(String name) {
        super(name);
        Health = 200;
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
                System.out.println("Archer attacking...");
                enemy.takeDamage(40);
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
        Health -= 30;
    }

    @Override
    public String toString() {
        return "Archer{" +
                "name='" + name + '\'' +
                ", Health=" + Health +
                '}';
    }
}
