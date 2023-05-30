package net.game.classes.player;

import net.game.interfaces.Combat;

public class Player implements Combat{
    protected Integer health, defense, strength;

    public Player(Integer defense, Integer strength) {
        this.health = 12;
        this.defense = defense;
        this.strength = strength;
    }

    public Integer getHealth() {
        return health;
    }

    @Override
    public Integer Attack(){
        return this.strength;
    }

    @Override
    public void receiveAttack(Integer attack) {
        Integer remainingHealth = (this.defense + this.health) - attack;
        System.out.println("The player has received " + attack + " damage, and has "+ remainingHealth);
        this.health = remainingHealth; 
    }
}
