package environment;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.awt.image.BufferedImage;

import State.Day;
import State.DayState;
import main.GamePanel;


public class Lighting 
{
	GamePanel gp;
	BufferedImage darknessFilter;
	public int dayCounter;
	public float filterAlpha = 0f;
	private DayState state;
	
	public final int day = 0;
	public final int dusk = 1;
	public final int night = 2;
	public final int dawn = 3;
	public int dayState = day;

	public Lighting(GamePanel gp) {
        this.gp = gp;
        this.state = new Day(); // Start with the Day state
        setLightSource();
    }
	
	public void setState(DayState state) {
        this.state = state;
    }
	
	public void setLightSource()
	{
		// Create a buffered image
		darknessFilter = new BufferedImage(gp.screenWidth, gp.screenHeight, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = (Graphics2D)darknessFilter.getGraphics();
		
		if(gp.player.currentLight == null)
		{
			g2.setColor(new Color(0,0,0.1f,0.97f)); // 0.1f - blue
		}
		else
		{
			// Get the center x and y of the light circle
			int centerX = gp.player.screenX + (gp.tileSize)/2;
			int centerY = gp.player.screenY + (gp.tileSize)/2;
			
			// Create a gradition effect within the light circle
			Color color[] = new Color[12];
			float fraction[]= new float[12];
			
			color[0] = new Color(0,0,0.1f,0.1f);
			color[1] = new Color(0,0,0.1f,0.42f);
			color[2] = new Color(0,0,0.1f,0.52f);
			color[3] = new Color(0,0,0.1f,0.61f);
			color[4] = new Color(0,0,0.1f,0.69f);
			color[5] = new Color(0,0,0.1f,0.76f);
			color[6] = new Color(0,0,0.1f,0.82f);
			color[7] = new Color(0,0,0.1f,0.87f);
			color[8] = new Color(0,0,0.1f,0.91f);
			color[9] = new Color(0,0,0.1f,0.92f);
			color[10] = new Color(0,0,0.1f,0.93f);
			color[11] = new Color(0,0,0.1f,0.94f);
			
			fraction[0] = 0f; // center
			fraction[1] = 0.4f;
			fraction[2] = 0.5f;
			fraction[3] = 0.6f;
			fraction[4] = 0.65f; 
			fraction[5] = 0.7f;
			fraction[6] = 0.75f;
			fraction[7] = 0.8f;
			fraction[8] = 0.85f;
			fraction[9] = 0.9f;
			fraction[10] = 0.95f;
			fraction[11] = 1f; // edge
			
			// Create a gradation paint settings for the light circle
			RadialGradientPaint gPaint = new RadialGradientPaint(centerX, centerY, gp.player.currentLight.lightRadius, fraction, color);
			
			// Set the gradient data on g2
			g2.setPaint(gPaint);
		}

		g2.fillRect(0, 0, gp.screenWidth, gp.screenHeight);	
		
		g2.dispose();
	}
	public void resetDay()
	{
		dayCounter = 0;
		dayState = day;
		filterAlpha = 0f;
	}
	public void update() {
        if (gp.player.lightUpdated) {
            setLightSource();
            gp.player.lightUpdated = false;
        }
        state.update(this); // Call update from the current state
    }
	
	public void draw(Graphics2D g2)
	{
		if (gp.currentArea == gp.outside)
		{
			g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, filterAlpha));
		}
		if (gp.currentArea == gp.outside || gp.currentArea == gp.dungeon)
		{
			g2.drawImage(darknessFilter, 0, 0, null);
		}		
		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));
		
		// DUBUG
		String situation = "";
		
		state.draw(g2, this);  // Call draw from the current state
	}
}
