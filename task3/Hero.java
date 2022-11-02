package softserve.task3;

import java.util.Random;

public abstract class Hero implements Mortal {
    protected String name;
    protected int Health;
    protected Random random;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public boolean isAlive() {
        if(Health > 0){
            return true;
        }
        else return false;
    }

    @Override
    public void showHealth() {
        if (isAlive()) {
            System.out.println("Health left: " + Health);
        } else {
            System.out.println("Health left: " + 0);
            System.out.println("\nEnemy WIN");
            System.exit(0);
        }
    }

    public abstract void attackEnemy();
    public abstract void takeDamage();
}
