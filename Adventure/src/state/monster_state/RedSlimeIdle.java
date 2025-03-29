package state.monster_state;
import entity.Entity;

public class RedSlimeIdle extends IdleBehavior{
	public RedSlimeIdle() {
        super(120); // Di chuyển ngẫu nhiên mỗi 2 giây
    }

    @Override
    public void checkTransition(Entity monster) {
        monster.checkStartChasingOrNot(monster.gp.player, 5, 100);
        if (monster.onPath) {
            monster.setState(new RedSlimeChasing());
        }
    }
}