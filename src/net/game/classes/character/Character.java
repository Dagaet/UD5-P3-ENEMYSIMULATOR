package net.game.classes.character;

public class Character {
    Integer health, defense, strength;

    public Character(Integer defense, Integer strength) {
        this.health = 12;
        this.defense = defense;
        this.strength = strength;
    }
}
