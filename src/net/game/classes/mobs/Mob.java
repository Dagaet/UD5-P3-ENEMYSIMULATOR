package net.game.classes.mobs;

public abstract class Mob {
    protected Integer health;
    protected Integer strenght;

    public Mob(Integer health, Integer strength) {
        this.health = health;
        this.strenght = strenght;
    }

    public abstract void movement();
}
