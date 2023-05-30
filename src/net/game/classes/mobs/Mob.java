package net.game.classes.mobs;

public abstract class Mob {
    Integer health;

    public Mob(Integer health) {
        this.health = health;
    }

    public abstract void movement();
}
