package main;

import data.Progress;

import tile_interactive.InteractiveTile;
import factory.*;
import entity.Entity;
public class AssetSetter 
{
	GamePanel gp;
	private final GameObjectFactory objectFactory;
    private final GameNPCFactory npcFactory;
    private final GameMonsterFactory monsterFactory;
    private final GameInteractiveTileFactory tileFactory;
    
	public AssetSetter(GamePanel gp)
	{
		this.gp = gp;
		this.objectFactory = new GameObjectFactory(null); 
        this.npcFactory = new GameNPCFactory(null); 
        this.monsterFactory = new GameMonsterFactory(null); 
        this.tileFactory = new GameInteractiveTileFactory(null, 0, 0); 
	}
	
	public void setObject() 
	{
		int mapNum = 0; int i = 0;
		placeObject(mapNum, i++, "OBJ_Lantern", 18, 20);//column//row
        placeObject(mapNum, i++, "OBJ_Tent", 25, 16);
        placeObject(mapNum, i++, "OBJ_Tent", 37, 31);
        placeObject(mapNum, i++, "OBJ_Tent", 15, 40);
        placeObject(mapNum, i++, "OBJ_Tent", 33, 21);
        placeObject(mapNum, i++, "OBJ_Coin_Bronze", 25, 23);
        placeObject(mapNum, i++, "OBJ_Coin_Bronze", 21, 19);
        placeObject(mapNum, i++, "OBJ_Coin_Bronze", 26, 21);
        placeObject(mapNum, i++, "OBJ_Coin_Bronze", 25, 42);
        placeObject(mapNum, i++, "OBJ_Coin_Bronze", 37, 38);
        placeObject(mapNum, i++, "OBJ_Coin_Bronze", 39, 11);
        placeObject(mapNum, i++, "OBJ_Coin_Bronze", 10, 25);
        placeObject(mapNum, i++, "OBJ_Coin_Bronze", 10, 20);
        placeObject(mapNum, i++, "OBJ_Coin_Bronze", 12, 18);
        placeObject(mapNum, i++, "OBJ_Shield_Blue", 29, 21);
        placeObject(mapNum, i++, "OBJ_Potion_Red", 29, 40);
        placeObject(mapNum, i++, "OBJ_Potion_Red", 25, 36);
        placeObject(mapNum, i++, "OBJ_Potion_Red", 24, 27);
        placeObject(mapNum, i++, "OBJ_Heart", 22, 29);
        placeObject(mapNum, i++, "OBJ_Heart", 18, 40);
        placeObject(mapNum, i++, "OBJ_Heart", 10, 33);
        placeObject(mapNum, i++, "OBJ_Heart", 35, 24);
        placeObject(mapNum, i++, "OBJ_ManaCrystal", 34, 12);
        placeObject(mapNum, i++, "OBJ_ManaCrystal", 41, 7);
        placeObject(mapNum, i++, "OBJ_ManaCrystal", 11, 29);
        placeObject(mapNum, i++, "OBJ_Door", 14, 28);
        placeObject(mapNum, i++, "OBJ_Door", 12, 12);
        
        //Chest
		placeObject(mapNum, i++, "OBJ_Chest", 12, 32).setLoot(GameObjectFactory.getFactory("OBJ_Key").createEntity(gp));
		placeObject(mapNum, i++, "OBJ_Chest", 30, 29).setLoot(GameObjectFactory.getFactory("OBJ_Key").createEntity(gp));
		placeObject(mapNum, i++, "OBJ_Chest", 20, 7).setLoot(GameObjectFactory.getFactory("OBJ_Key").createEntity(gp));
		placeObject(mapNum, i++, "OBJ_Chest", 37, 9).setLoot(GameObjectFactory.getFactory("OBJ_Key").createEntity(gp));
		placeObject(mapNum, i++, "OBJ_Chest", 34, 42).setLoot(GameObjectFactory.getFactory("OBJ_Key").createEntity(gp));
		placeObject(mapNum, i++, "OBJ_Chest", 23, 39).setLoot(GameObjectFactory.getFactory("OBJ_Sword_Normal").createEntity(gp));
		
		// Map Dungeon
		mapNum = 2;
		i = 0;
		placeObject(mapNum, i++, "OBJ_Chest", 40, 41).setLoot(GameObjectFactory.getFactory("OBJ_Pickaxe").createEntity(gp));
		placeObject(mapNum, i++, "OBJ_Potion_Red", 13, 16).setLoot(GameObjectFactory.getFactory("OBJ_Potion_Red").createEntity(gp));
		placeObject(mapNum, i++, "OBJ_Potion_Red", 26, 34).setLoot(GameObjectFactory.getFactory("OBJ_ManaCrystal").createEntity(gp));
		placeObject(mapNum, i++, "OBJ_Potion_Red", 27, 15).setLoot(GameObjectFactory.getFactory("OBJ_Potion_Red").createEntity(gp));
		placeObject(mapNum, i++, "OBJ_Door_Iron", 18, 23);
		
		// Iron Door lock player when fighting Boss
		mapNum = 3;
		i = 0;
		placeObject(mapNum, i++, "OBJ_Door_Iron", 25, 15);
		placeObject(mapNum, i++, "OBJ_BlueHeart", 25, 8);
	}
	public void setNPC() 
	{	
		int mapNum = 0;
		int i = 0;
		// MAP 0
		placeNPC(mapNum, i++, "NPC_OldMan", 21, 21);
		
		// MAP 1
		mapNum = 1;
		i = 0;
		placeNPC(mapNum, i++, "NPC_Merchant", 12, 7);
		
		// MAP 2 (DUNGEON)
		mapNum = 2;
		i = 0;
		placeNPC(mapNum, i++, "NPC_BigRock", 20, 25);
		placeNPC(mapNum, i++, "NPC_BigRock", 11, 18);
		placeNPC(mapNum, i++, "NPC_BigRock", 23, 14);
				
	}

	public void setMonster() 
	{	
		int mapNum = 0;
		int i = 0;
		
		// Green Slime
		placeMonster(mapNum, i++, "MON_GreenSlime", 23, 38);
		placeMonster(mapNum, i++, "MON_GreenSlime", 23, 42);
		placeMonster(mapNum, i++, "MON_GreenSlime", 24, 37);
		placeMonster(mapNum, i++, "MON_GreenSlime", 34, 42);
		placeMonster(mapNum, i++, "MON_GreenSlime", 38, 42);
		placeMonster(mapNum, i++, "MON_RedSlime", 35, 10);
		placeMonster(mapNum, i++, "MON_RedSlime", 37, 12);
		placeMonster(mapNum, i++, "MON_RedSlime", 38, 8);
		placeMonster(mapNum, i++, "MON_Orc", 12, 33);
		
		mapNum = 2;
		i++;
		placeMonster(mapNum, i++, "MON_Bat", 34, 39);
		placeMonster(mapNum, i++, "MON_Bat", 36, 25);
		placeMonster(mapNum, i++, "MON_Bat", 39, 26);
		placeMonster(mapNum, i++, "MON_Bat", 28, 11);
		placeMonster(mapNum, i++, "MON_Bat", 10, 19);
		
		// Skeleton
		mapNum = 3;
		i++;
		
		if (Progress.skeletonLordDefeated == false)
		{
			placeMonster(mapNum, i++, "MON_SkeletonLord", 23, 16);
		}		
	}
	public void setInteractiveTile() {
	    int mapNum = 0;
	    int i = 0;

	    placeTile(mapNum, i++, "IT_DryTree", 25, 27);
	    placeTile(mapNum, i++, "IT_DryTree", 26, 27);
	    placeTile(mapNum, i++, "IT_DryTree", 27, 27);
	    placeTile(mapNum, i++, "IT_DryTree", 27, 28);
	    placeTile(mapNum, i++, "IT_DryTree", 27, 29);
	    placeTile(mapNum, i++, "IT_DryTree", 27, 30);
	    placeTile(mapNum, i++, "IT_DryTree", 27, 31);
	    placeTile(mapNum, i++, "IT_DryTree", 28, 31);
	    placeTile(mapNum, i++, "IT_DryTree", 29, 31);
	    placeTile(mapNum, i++, "IT_DryTree", 30, 31);
	    placeTile(mapNum, i++, "IT_DryTree", 30, 30);

	    placeTile(mapNum, i++, "IT_DryTree", 27, 12);
	    placeTile(mapNum, i++, "IT_DryTree", 28, 12);
	    placeTile(mapNum, i++, "IT_DryTree", 29, 12);
	    placeTile(mapNum, i++, "IT_DryTree", 30, 12);
	    placeTile(mapNum, i++, "IT_DryTree", 31, 12);
	    placeTile(mapNum, i++, "IT_DryTree", 32, 12);
	    placeTile(mapNum, i++, "IT_DryTree", 33, 12);

	    placeTile(mapNum, i++, "IT_DryTree", 30, 20);
	    placeTile(mapNum, i++, "IT_DryTree", 30, 21);
	    placeTile(mapNum, i++, "IT_DryTree", 30, 22);
	    placeTile(mapNum, i++, "IT_DryTree", 20, 20);
	    placeTile(mapNum, i++, "IT_DryTree", 20, 21);
	    placeTile(mapNum, i++, "IT_DryTree", 20, 22);
	    placeTile(mapNum, i++, "IT_DryTree", 22, 24);
	    placeTile(mapNum, i++, "IT_DryTree", 23, 24);
	    placeTile(mapNum, i++, "IT_DryTree", 24, 24);

	    placeTile(mapNum, i++, "IT_DryTree", 10, 40);
	    placeTile(mapNum, i++, "IT_DryTree", 10, 41);
	    placeTile(mapNum, i++, "IT_DryTree", 11, 41);
	    placeTile(mapNum, i++, "IT_DryTree", 12, 41);
	    placeTile(mapNum, i++, "IT_DryTree", 13, 41);
	    placeTile(mapNum, i++, "IT_DryTree", 13, 40);
	    placeTile(mapNum, i++, "IT_DryTree", 14, 40);

	    // Map Dungeon
	    mapNum = 2;
	    i = 0;

	    placeTile(mapNum, i++, "IT_DestructibleWall", 18, 30);
	    placeTile(mapNum, i++, "IT_DestructibleWall", 17, 31);
	    placeTile(mapNum, i++, "IT_DestructibleWall", 17, 32);
	    placeTile(mapNum, i++, "IT_DestructibleWall", 17, 34);
	    placeTile(mapNum, i++, "IT_DestructibleWall", 18, 34);
	    placeTile(mapNum, i++, "IT_DestructibleWall", 18, 33);
	    placeTile(mapNum, i++, "IT_DestructibleWall", 10, 22);
	    placeTile(mapNum, i++, "IT_DestructibleWall", 10, 24);
	    placeTile(mapNum, i++, "IT_DestructibleWall", 38, 18);
	    placeTile(mapNum, i++, "IT_DestructibleWall", 38, 19);
	    placeTile(mapNum, i++, "IT_DestructibleWall", 38, 20);
	    placeTile(mapNum, i++, "IT_DestructibleWall", 38, 21);
	    placeTile(mapNum, i++, "IT_DestructibleWall", 18, 13);
	    placeTile(mapNum, i++, "IT_DestructibleWall", 18, 14);
	    placeTile(mapNum, i++, "IT_DestructibleWall", 22, 28);
	    placeTile(mapNum, i++, "IT_DestructibleWall", 30, 28);
	    placeTile(mapNum, i++, "IT_DestructibleWall", 32, 28);

	    placeTile(mapNum, i++, "IT_MetalPlate", 20, 22);
	    placeTile(mapNum, i++, "IT_MetalPlate", 8, 17);
	    placeTile(mapNum, i++, "IT_MetalPlate", 39, 31);
	}
	private Entity placeObject(int mapNum, int index, String type, int x, int y) {
        Entity entity = GameObjectFactory.getFactory(type).createEntity(gp);
        gp.obj[mapNum][index] = entity;
        entity.worldX = gp.tileSize * x;
        entity.worldY = gp.tileSize * y;
        return entity;
    }

    private void placeNPC(int mapNum, int index, String type, int x, int y) {
        Entity entity = GameNPCFactory.getFactory(type).createEntity(gp);
        gp.npc[mapNum][index] = entity;
        entity.worldX = gp.tileSize * x;
        entity.worldY = gp.tileSize * y;
    }

    private void placeMonster(int mapNum, int index, String type, int x, int y) {
        Entity entity = GameMonsterFactory.getFactory(type).createEntity(gp);
        gp.monster[mapNum][index] = entity;
        entity.worldX = gp.tileSize * x;
        entity.worldY = gp.tileSize * y;
    }

    private void placeTile(int mapNum, int index, String type, int x, int y) {
        Entity entity = GameInteractiveTileFactory.getFactory(type, x, y).createEntity(gp);
        // gp.iTile[mapNum][index] = entity;
        gp.iTile[mapNum][index] = (InteractiveTile) entity; 
    }
}
