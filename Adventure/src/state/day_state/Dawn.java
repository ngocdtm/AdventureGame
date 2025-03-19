package state.day_state;

import java.awt.Color;
import java.awt.Graphics2D;

import environment.Lighting;

public class Dawn implements DayState {
    @Override
    public void update(Lighting lighting) {
        lighting.filterAlpha -= 0.001f;
        if (lighting.filterAlpha < 0) {
            lighting.filterAlpha = 0;
            lighting.setState(new Day());
        }
    }

    @Override
    public void draw(Graphics2D g2, Lighting lighting) {
        g2.setColor(Color.white);
        g2.setFont(g2.getFont().deriveFont(50f));
        g2.drawString("Dawn", 800, 500);
    }
}
