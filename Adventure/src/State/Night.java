package State;

import java.awt.Color;
import java.awt.Graphics2D;

import environment.Lighting;

public class Night implements DayState {
    @Override
    public void update(Lighting lighting) {
        lighting.dayCounter++;
        if (lighting.dayCounter > 600) { // 600 frames = 10s if running at 60 FPS
            lighting.setState(new Dawn());
            lighting.dayCounter = 0;
        }
    }

    @Override
    public void draw(Graphics2D g2, Lighting lighting) {
        g2.setColor(Color.white);
        g2.setFont(g2.getFont().deriveFont(50f));
        g2.drawString("Night", 800, 500);
    }
}
