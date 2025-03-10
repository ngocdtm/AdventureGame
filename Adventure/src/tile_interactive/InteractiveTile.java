package tile_interactive;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import entity.Entity;
import main.GamePanel;

public class InteractiveTile extends Entity{
	GamePanel gp;
	public boolean destructible = false;
	public InteractiveTile(GamePanel gp, int col, int row) {
		super(gp);
		this.gp = gp;
		
	}
	public boolean isCorrectItem(Entity entity) {//add axe 
		boolean isCorrectItem = false;
		return isCorrectItem;
	}
	public void playSE() {
		
	}
	public InteractiveTile getDestroyForm() {
		InteractiveTile tile = null;
		return tile;
	}
	public void update() {
		if(invincible == true) {
			invincibleCounter++;
			if(invincible == true) {
				invincibleCounter++;
				if(invincibleCounter > 20) {
					invincible = false;
					invincibleCounter = 0;
				}
			}
		}
	}
	public void draw(Graphics2D g2) {// help for drytree not mờ dần

		int screenX = worldX - gp.player.worldX + gp.player.screenX;// screenX = -500
		int screenY = worldY - gp.player.worldY + gp.player.screenY;// screenX = 500
	
		if(worldX + gp.tileSize > gp.player.worldX - gp.player.screenX 
	    && worldX - gp.tileSize < gp.player.worldX + gp.player.screenX 
		&& worldY + gp.tileSize > gp.player.worldY - gp.player.screenY 
		&& worldY - gp.tileSize < gp.player.worldY + gp.player.screenY) {

			g2.drawImage(down1, screenX, screenY, null);
		}
	}

}
