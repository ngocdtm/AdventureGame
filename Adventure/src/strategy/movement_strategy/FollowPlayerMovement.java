package strategy.movement_strategy;

import entity.Entity;

public class FollowPlayerMovement implements MovementStrategy {
    @Override
    public void move(Entity entity) {
        if (entity.onPath) {
            int goalCol = (entity.gp.player.worldX + entity.gp.player.solidArea.x) / entity.gp.tileSize;
            int goalRow = (entity.gp.player.worldY + entity.gp.player.solidArea.y) / entity.gp.tileSize;
            entity.searchPath(goalCol, goalRow); // Use the available pathfinding method
        }
    }
}
