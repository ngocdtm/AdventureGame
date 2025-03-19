package strategy;

import java.util.Random;

import entity.Entity;

public class RandomMovement implements MovementStrategy {
    @Override
    public void move(Entity entity) {
        entity.actionLockCounter++;
        if (entity.actionLockCounter >= 120) {
            Random random = new Random();
            int i = random.nextInt(100) + 1; // Select a random number from 1 to 100
            if (i <= 25) {
                entity.direction = "up";
            } else if (i <= 50) {
                entity.direction = "down";
            } else if (i <= 75) {
                entity.direction = "left";
            } else {
                entity.direction = "right";
            }
            entity.actionLockCounter = 0;
        }
    }
}
