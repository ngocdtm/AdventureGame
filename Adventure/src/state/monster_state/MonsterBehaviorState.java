package state.monster_state;

import entity.Entity;

public interface MonsterBehaviorState {
	void updateBehavior(Entity monster); 
    void checkTransition(Entity monster); 
}
