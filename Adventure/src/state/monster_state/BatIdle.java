package state.monster_state;
import entity.Entity;

public class BatIdle extends IdleBehavior{
	public BatIdle() {
        super(10);
    }

    @Override
    public void checkTransition(Entity monster) {

    }
}