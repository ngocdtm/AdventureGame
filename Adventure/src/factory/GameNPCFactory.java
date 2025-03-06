package factory;

import entity.*;
import main.GamePanel;

public class GameNPCFactory implements GameEntityFactory {
    private final Class<? extends Entity> npcType;

    public GameNPCFactory(Class<? extends Entity> npcType) {
        this.npcType = npcType;
    }

    @Override
    public Entity createEntity(GamePanel gp) {
        try {
            return npcType.getConstructor(GamePanel.class).newInstance(gp);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create NPC: " + npcType.getSimpleName(), e);
        }
    }

    public static GameNPCFactory getFactory(String type) {
        switch (type) {
            case "NPC_OldMan": return new GameNPCFactory(NPC_OldMan.class);
            case "NPC_Merchant": return new GameNPCFactory(NPC_Merchant.class);
            case "NPC_BigRock": return new GameNPCFactory(NPC_BigRock.class);
            default: throw new IllegalArgumentException("Unknown NPC type: " + type);
        }
    }
}