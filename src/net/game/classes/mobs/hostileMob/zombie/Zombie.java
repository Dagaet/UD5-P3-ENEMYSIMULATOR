package net.game.classes.mobs.hostileMob.zombie;

import net.game.classes.mobs.hostileMob.HostileMob;

public class Zombie extends HostileMob{

    public Zombie() {
        super(10, 4);
    }

    @Override
    public void movement(){
        System.out.println("The zombie has moved");
    }
}
