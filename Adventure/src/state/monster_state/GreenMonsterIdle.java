package state.monster_state;

import java.util.Random;


import entity.Entity;

public class GreenMonsterIdle extends IdleBehavior {

    public GreenMonsterIdle() {
    	super(120);
    }

    @Override
    public void checkTransition(Entity monster) {
        monster.checkStartChasingOrNot(monster.gp.player, 5, 100); // Bắt đầu đuổi khi cách 5 ô
        if (monster.onPath) {
            monster.setState(new GreenMonsterChasing());
        }
    }
}