package state.monster_state;

import entity.Entity;
public abstract class AttackingBehavior implements MonsterBehaviorState {
    protected int attackInterval; // Khoảng thời gian kiểm tra tấn công

    public AttackingBehavior(int attackInterval) {
        this.attackInterval = attackInterval;
    }

    @Override
    public abstract void updateBehavior(Entity monster); 

    @Override
    public abstract void checkTransition(Entity monster);
}