package net.game.classes.mobs.hostileMob.enderman;

import net.game.classes.mobs.hostileMob.HostileMob;

public class Enderman extends HostileMob{

    public Enderman() {
        super(14, 6);
    }

    @Override
    public void movement() {
        System.out.println("Enderman has moved");
    }
    
}
