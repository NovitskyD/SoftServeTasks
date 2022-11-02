package softserve.task3;

public class Enemy implements Mortal{
    protected int health;

    public Enemy(int health) {
        if(health < 0){
            this.health = 100;
        }
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void showHealth() {
        if (isAlive()) {
            System.out.println("Health left: " + health);
        }
        else {System.out.println("Health left: " + 0);
            System.out.println("\nHero WIN");
        System.exit(0);}
    }

    public void takeDamage(int damage){
        this.health -= damage;
    }

    @Override
    public boolean isAlive() {
        if(this.health > 0){
            return true;
        }
        else return false;
    }
}
