package monster;

import java.util.Random;

import entity.Entity;
import main.GamePanel;
import object.OBJ_Coin_Bronze;
import object.OBJ_Heart;
import object.OBJ_ManaCrystal;
import state.monster_state.BatIdle;

public class MON_Bat extends Entity
{
	GamePanel gp;
	
	public MON_Bat(GamePanel gp) 
	{
		super(gp);
		
		this.gp = gp;
		
		type = type_monster;
		name= "Bat";
		defaultSpeed = 4;
		speed = defaultSpeed;
		maxLife = 7;
		life = maxLife;
		attack = 7;
		defense = 0;
		exp = 7;
		
		solidArea.x = 3;
		solidArea.y = 15;
		solidArea.width = 42;
		solidArea.height = 21;
		solidAreaDefaultX = solidArea.x;
		solidAreaDefaultY = solidArea.y;
		state = new BatIdle();
		getImage();
	}
	
	public void getImage() 
	{
		up1 = setup("/monster/bat_down_1", gp.tileSize, gp.tileSize);
		up2 = setup("/monster/bat_down_2", gp.tileSize, gp.tileSize);
		down1 = setup("/monster/bat_down_1", gp.tileSize, gp.tileSize);
		down2 = setup("/monster/bat_down_2", gp.tileSize, gp.tileSize);
		left1 = setup("/monster/bat_down_1", gp.tileSize, gp.tileSize);
		left2 = setup("/monster/bat_down_2", gp.tileSize, gp.tileSize);
		right1 = setup("/monster/bat_down_1", gp.tileSize, gp.tileSize);
		right2 = setup("/monster/bat_down_2", gp.tileSize, gp.tileSize);		
	}

	public void damageReaction() 
	{//attack player after receive damage
		
		actionLockCounter = 0;
//		direction = gp.player.direction;
//		onPath = true;
	}
	public void checkDrop() 
	{
		//CAST A DIE
		int i = new Random().nextInt(100)+1;
		
		//SET THE MONSTER DROP
		if( i < 50){
			dropItem(new OBJ_Coin_Bronze(gp));
		}
		if( i >= 50 && i < 75){
			dropItem(new OBJ_Heart(gp));
		}
		if( i >= 75 && i < 100){
			dropItem(new OBJ_ManaCrystal(gp));
		}
	}
}
