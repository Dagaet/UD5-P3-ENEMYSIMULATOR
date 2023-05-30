package net.game.classes.mobs.pacificMob.sheep;

import net.game.classes.mobs.pacificMob.PacificMob;

public class Sheep extends PacificMob{

    public Sheep(Integer health, Integer strength) {
        super(5, 0);
    }

    @Override
    public void movement() {
        System.out.println("Sheep has moved");
    }
    
}
