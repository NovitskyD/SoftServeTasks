package softserve.task3;

public class TrainingGround {
    public static void main(String[] args) {
        Mage mage = new Mage("Merlin");
        Archer archer = new Archer("Legolas");
        Warrior warrior = new Warrior("Spartacus");
        mage.attackEnemy();
        archer.attackEnemy();
        warrior.attackEnemy();
    }
}
