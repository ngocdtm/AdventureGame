package strategy.movement_strategy;

import entity.Entity;

public class IdleMovement implements MovementStrategy {
    @Override
    public void move(Entity entity) {
        // Không làm gì cả, NPC đứng yên
    }
}
