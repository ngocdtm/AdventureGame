package state.monster_state;
import entity.Entity;
import monster.MON_SkeletonLord;

public class SkeletonLordAttacking extends AttackingBehavior {
    public SkeletonLordAttacking() {
        super(120); // Tấn công mỗi 1 giây
    }

    @Override
    public void updateBehavior(Entity monster) {
        MON_SkeletonLord skeleton = (MON_SkeletonLord) monster;
        skeleton.moveTowardPlayer(60);
        if (!skeleton.attacking) {
            skeleton.checkAttackOrNot(60, skeleton.gp.tileSize * 7, skeleton.gp.tileSize * 5);
        }
    }

    @Override
    public void checkTransition(Entity monster) {
        MON_SkeletonLord skeleton = (MON_SkeletonLord) monster;
        if (skeleton.getTileDistance(skeleton.gp.player) >= 10) {
            skeleton.setState(new SkeletonLordIdle());
        }
    }
}
