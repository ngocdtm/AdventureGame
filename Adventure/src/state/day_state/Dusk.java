package state.day_state;

import java.awt.Color;
import java.awt.Graphics2D;

import environment.Lighting;

public class Dusk implements DayState {
    @Override
    public void update(Lighting lighting) {
        lighting.filterAlpha += 0.001f;
        if (lighting.filterAlpha > 1f) {
            lighting.filterAlpha = 1f;
            lighting.setState(new Night());
        }
    }

    @Override
    public void draw(Graphics2D g2, Lighting lighting) {
        g2.setColor(Color.white);
        g2.setFont(g2.getFont().deriveFont(50f));
        g2.drawString("Dusk", 800, 500);
    }
}
