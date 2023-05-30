package net.game.classes.mobs.hostileMob;

import net.game.classes.mobs.Mob;
import net.game.interfaces.Combat;

public class HostileMob extends Mob implements Combat{

    public HostileMob(Integer health, Integer strength) {
        super(health, strength);
    }

    @Override
    public void movement() {
        
    }

    @Override
    public void receiveAttack(Integer attack) {
        Integer remainingHealth = this.health - attack;
        System.out.println("The player has received " + attack + " dmg and the remaining health is "+ remainingHealth);
        this.health = remainingHealth;
    }

    @Override
    public Integer Attack() {
        return this.strenght;
    }
    
}
