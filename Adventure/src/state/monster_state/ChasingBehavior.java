package state.monster_state;
import entity.Entity;

public abstract class ChasingBehavior implements MonsterBehaviorState {
    @Override
    public void updateBehavior(Entity monster) {
        monster.searchPath(monster.getGoalCol(monster.gp.player), monster.getGoalRow(monster.gp.player));
    }

    @Override
    public abstract void checkTransition(Entity monster); // Để subclass định nghĩa
}