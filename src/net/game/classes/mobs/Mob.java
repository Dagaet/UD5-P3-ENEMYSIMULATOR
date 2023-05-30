package net.game.classes.mobs;

public abstract class Mob {
    protected Integer health;
    protected Integer strenght;

    public Mob(Integer health, Integer strenght) {
        this.health = health;
        this.strenght = strenght;
    }
    
    public Integer getHealth() {
        return health;
    }

    public abstract void movement();
}
