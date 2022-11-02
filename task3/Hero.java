package softserve.task3;

public abstract class Hero {
    protected String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy();
}
