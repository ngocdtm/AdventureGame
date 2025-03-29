package state.monster_state;

import entity.Entity;

public abstract class IdleBehavior implements MonsterBehaviorState{
	protected int idleInterval; 

    public IdleBehavior(int idleInterval) {
        this.idleInterval = idleInterval;
    }

    @Override
    public void updateBehavior(Entity monster) {
        monster.getRandomDirection(idleInterval);
    }

    @Override
    public abstract void checkTransition(Entity monster); 
}
