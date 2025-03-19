package state.day_state;

import java.awt.Color;
import java.awt.Graphics2D;

import environment.Lighting;

public class Day implements DayState {
    @Override
    public void update(Lighting lighting) {
        lighting.dayCounter++;
        if (lighting.dayCounter > 1200) { // 1200 frames = 20s if running at 60 FPS
            lighting.setState(new Dusk());
            lighting.dayCounter = 0;
            lighting.filterAlpha = 0f; // Reset alpha
        }
    }

    @Override
    public void draw(Graphics2D g2, Lighting lighting) {
        g2.setColor(Color.white);
        g2.setFont(g2.getFont().deriveFont(50f));
        g2.drawString("Day", 800, 500);
    }
}
