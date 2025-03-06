package factory;

import entity.Entity;
import main.GamePanel;
import object.*;

public class GameObjectFactory implements GameEntityFactory {
    private final Class<? extends Entity> objectType;

    public GameObjectFactory(Class<? extends Entity> objectType) {
        this.objectType = objectType;
    }

    @Override
    public Entity createEntity(GamePanel gp) {
        try {
            return objectType.getConstructor(GamePanel.class).newInstance(gp);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create object: " + objectType.getSimpleName(), e);
        }
    }

    public static GameObjectFactory getFactory(String type) {
        switch (type) {
            case "OBJ_Lantern": return new GameObjectFactory(OBJ_Lantern.class);
            case "OBJ_Tent": return new GameObjectFactory(OBJ_Tent.class);
            case "OBJ_Coin_Bronze": return new GameObjectFactory(OBJ_Coin_Bronze.class);
            case "OBJ_Axe": return new GameObjectFactory(OBJ_Axe.class);
            case "OBJ_Shield_Blue": return new GameObjectFactory(OBJ_Shield_Blue.class);
            case "OBJ_Potion_Red": return new GameObjectFactory(OBJ_Potion_Red.class);
            case "OBJ_Heart": return new GameObjectFactory(OBJ_Heart.class);
            case "OBJ_ManaCrystal": return new GameObjectFactory(OBJ_ManaCrystal.class);
            case "OBJ_Door": return new GameObjectFactory(OBJ_Door.class);
            case "OBJ_Chest": return new GameObjectFactory(OBJ_Chest.class);
            case "OBJ_Key": return new GameObjectFactory(OBJ_Key.class);
            case "OBJ_Door_Iron": return new GameObjectFactory(OBJ_Door_Iron.class);
            case "OBJ_BlueHeart": return new GameObjectFactory(OBJ_BlueHeart.class);
            case "OBJ_Sword_Normal": return new GameObjectFactory(OBJ_Sword_Normal.class);
            case "OBJ_Pickaxe": return new GameObjectFactory(OBJ_Pickaxe.class);
            default: throw new IllegalArgumentException("Unknown object type: " + type);
        }
    }
}