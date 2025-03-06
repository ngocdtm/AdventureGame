package factory;

import main.GamePanel;
import monster.*;
import entity.*;
public class GameMonsterFactory implements GameEntityFactory {
    private final Class<? extends Entity> monsterType;

    public GameMonsterFactory(Class<? extends Entity> monsterType) {
        this.monsterType = monsterType;
    }

    @Override
    public Entity createEntity(GamePanel gp) {
        try {
            return monsterType.getConstructor(GamePanel.class).newInstance(gp);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create monster: " + monsterType.getSimpleName(), e);
        }
    }

    public static GameMonsterFactory getFactory(String type) {
        switch (type) {
            case "MON_GreenSlime": return new GameMonsterFactory(MON_GreenSlime.class);
            case "MON_RedSlime": return new GameMonsterFactory(MON_RedSlime.class);
            case "MON_Orc": return new GameMonsterFactory(MON_Orc.class);
            case "MON_Bat": return new GameMonsterFactory(MON_Bat.class);
            case "MON_SkeletonLord": return new GameMonsterFactory(MON_SkeletonLord.class);
            default: throw new IllegalArgumentException("Unknown monster type: " + type);
        }
    }
}