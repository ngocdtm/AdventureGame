package factory;

import entity.Entity;
import main.GamePanel;

public interface GameEntityFactory {
    Entity createEntity(GamePanel gp);
}