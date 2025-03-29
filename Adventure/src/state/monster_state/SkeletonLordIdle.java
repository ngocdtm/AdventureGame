package state.monster_state;
import entity.Entity;
import monster.MON_SkeletonLord;

public class SkeletonLordIdle extends IdleBehavior {
	
	    public SkeletonLordIdle() {
	        super(120);
	    }

	    @Override
	    public void checkTransition(Entity monster) {
	        MON_SkeletonLord skeleton = (MON_SkeletonLord) monster;
	        if (skeleton.getTileDistance(skeleton.gp.player) < 10) {
	            skeleton.moveTowardPlayer(60);
	            skeleton.setState(new SkeletonLordAttacking());
	        }
	        if (skeleton.life < skeleton.maxLife / 2 && !skeleton.inRange) {
	            skeleton.inRange = true;
	            skeleton.getImage();
	            skeleton.getAttackImage();
	            skeleton.defaultSpeed++;
	            skeleton.speed = skeleton.defaultSpeed;
	            skeleton.attack *= 2;
	        }
	    }
	}
