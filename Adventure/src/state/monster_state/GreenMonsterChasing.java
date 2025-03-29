package state.monster_state;

import java.util.Random;

import entity.Entity;
import monster.MON_GreenSlime;

public class GreenMonsterChasing implements MonsterBehaviorState {
    @Override
    public void updateBehavior(Entity monster) {
        monster.searchPath(monster.getGoalCol(monster.gp.player), monster.getGoalRow(monster.gp.player));
        // ((MON_GreenSlime) monster).checkShootOrNot(200, 30);
    }

    @Override
    public void checkTransition(Entity monster) {
        monster.checkStopChasingOrNot(monster.gp.player, 15, 100); // Dừng đuổi khi cách 15 ô
        if (!monster.onPath) {
            monster.setState(new GreenMonsterIdle());
        }
    }
}