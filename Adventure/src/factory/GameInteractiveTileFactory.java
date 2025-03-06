package factory;
import entity.*;
import main.GamePanel;
import tile_interactive.IT_DestructibleWall;
import tile_interactive.IT_DryTree;
import tile_interactive.IT_MetalPlate;
public class GameInteractiveTileFactory implements GameEntityFactory {
    private final Class<? extends Entity> tileType;
    private final int x, y;

    public GameInteractiveTileFactory(Class<? extends Entity> tileType, int x, int y) {
        this.tileType = tileType;
        this.x = x;
        this.y = y;
    }

    @Override
    public Entity createEntity(GamePanel gp) {
        try {
            return tileType.getConstructor(GamePanel.class, int.class, int.class).newInstance(gp, x, y);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create tile: " + tileType.getSimpleName(), e);
        }
    }

    public static GameInteractiveTileFactory getFactory(String type, int x, int y) {
        switch (type) {
            case "IT_DryTree": return new GameInteractiveTileFactory(IT_DryTree.class, x, y);
            case "IT_DestructibleWall": return new GameInteractiveTileFactory(IT_DestructibleWall.class, x, y);
            case "IT_MetalPlate": return new GameInteractiveTileFactory(IT_MetalPlate.class, x, y);
            default: throw new IllegalArgumentException("Unknown tile type: " + type);
        }
    }
}