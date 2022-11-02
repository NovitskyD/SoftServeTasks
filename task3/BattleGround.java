package softserve.task3;

import java.util.Scanner;

public class BattleGround {
    public static void main(String[] args) {
        System.out.println("Choose your hero:");
        System.out.println("Archer = [1]\tMage = [2]\t Warrior = [3]");
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        Hero hero = createHero(scan);
        System.out.println("You chose: " + hero);
        attack(hero);
    }

    public static void attack(Hero hero){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------");
        System.out.println("Attack the enemy?: ");
        System.out.println("Yes = 1\t No = 2");
        int scan2 = scanner.nextInt();
        System.out.println("-------FIGHT-------");
        if(scan2 == 1){
            hero.attackEnemy();
        }
        else if(scan2 == 2){
            System.exit(0);
        }
        attack(hero);
    }

    public static Hero createHero(int chooseHero){
        return switch (chooseHero){
            case 1 ->
                    new Archer("Legolas");
            case 2 ->
                    new Mage("Merlin");
            case 3 ->
                    new Warrior("Spartacus");
            default ->
                    throw new IllegalArgumentException(
                            "Wrong hero type: " + chooseHero);

        };
    }
}
