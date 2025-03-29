package state.monster_state;
import entity.Entity;
import monster.MON_RedSlime;

public class RedSlimeChasing extends ChasingBehavior{
	@Override
    public void updateBehavior(Entity monster) {
        super.updateBehavior(monster);
        ((MON_RedSlime) monster).checkShootOrNot(200, 30); // Bắn đạn
    }

    @Override
    public void checkTransition(Entity monster) {
        monster.checkStopChasingOrNot(monster.gp.player, 15, 100);
        if (!monster.onPath) {
            monster.setState(new RedSlimeIdle());
        }
    }
}