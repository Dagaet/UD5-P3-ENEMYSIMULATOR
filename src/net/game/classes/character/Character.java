package net.game.classes.character;

import net.game.interfaces.Combat;

public class Character implements Combat{
    Integer health, defense, strength;

    public Character(Integer defense, Integer strength) {
        this.health = 12;
        this.defense = defense;
        this.strength = strength;
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
