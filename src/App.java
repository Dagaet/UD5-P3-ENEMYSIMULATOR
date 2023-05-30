import java.util.Random;
import java.util.Scanner;

import net.game.classes.mobs.hostileMob.zombie.Zombie;
import net.game.classes.player.Player;

public class App {
    static final Scanner KEYBOARD = new Scanner(System.in); 

    public static Integer selectWeapon(){
        System.out.println("Hello User");
        System.out.println("Select one of the weapons: \n1. None \n2.Wooden Sword \n3. Iron Sword \n4. Diamond sword");
        String option = KEYBOARD.nextLine();
        Integer strength;
        switch (option) {
            case "0":
                System.out.println("You have no weapons on your hands");
                strength=1;
                break;
            case "1":
                System.out.println("You have a wooden sword");
                strength=2;
                break;
            case "2":
                System.out.println("You have a iron sword");
                strength=3;
                break;
            case "3":
                System.out.println("You have a diamond sword");
                strength=5;
                break;
            default:
                System.out.println("You didn't select, now you have no weapons");
                strength=1;
                break;
        }
        return strength;
    }

    public static Integer selectArmor(){
        System.out.println("Hello User");
        System.out.println("Select one of the armors: \n1. None \n2. Leather Armor \n3. Iron Armor \n4. Diamond Armor");
        String option = KEYBOARD.nextLine();
        Integer defense;
        switch (option) {
            case "1":
                System.out.println("You have no armor");
                defense=0;
                break;
            case "2":
                System.out.println("You have a lead armor");
                defense=1;
                break;
            case "3":
                System.out.println("You have a iron armor");
                defense=2;
                break;
            case "4":
                System.out.println("You have a diamond armor");
                defense=3;
                break;
            default:
                System.out.println("You didn't select, now you have no armor");
                defense=0;
                break;
        }
        return defense;
    }
    public static void main(String[] args) throws Exception {   
        Integer defense = selectArmor();
        Integer strength = selectWeapon();
        

        Player player = new Player(defense, strength);
        Zombie zombie = new Zombie();
        Integer turns = 0;
        while (player.getHealth() > 0 || zombie.getHealth() > 0) {
            int random =(int)Math.floor(Math.random() * (2 - 1 + 1) + 1);
            System.out.println(random);
            System.out.println("Player attacks");
            zombie.receiveAttack(player.Attack());
            if (zombie.getHealth() <= 0){
                System.out.println("Zombie has died, Player has won in "+turns + " turns.");
                return;
            }
            if (random == 1){
                zombie.movement();
            }else {
                player.receiveAttack(zombie.Attack());
            }
            System.out.println("Player has "+ player.getHealth() + " point of life.");
            System.out.println("Zombie has "+ zombie.getHealth() + " point of life.");
            turns++;
            if (player.getHealth() <= 0){
                System.out.println("Player has died, Zombie has won in "+turns + " turns.");
                return;
            }
            
        }
        
    }
}
