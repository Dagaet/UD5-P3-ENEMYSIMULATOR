package net.game.classes.mobs.pacificMob;

import net.game.classes.mobs.Mob;
import net.game.interfaces.Damage;

public class PacificMob extends Mob implements Damage{

    public PacificMob(Integer health, Integer strength) {
        super(health, strength);
    }

    @Override
    public void receiveAttack(Integer attack) {
        Integer remainingHealth = this.health - attack;
        System.out.println("The pacific mob has received " + attack + " dmg and the remaining health is "+ remainingHealth);
        this.health = remainingHealth;
    }

    @Override
    public void movement() {
        System.out.println("Pacific mob has moved");
    }
    
}
