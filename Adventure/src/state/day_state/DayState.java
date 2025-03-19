package state.day_state;

import java.awt.Graphics2D;

import environment.Lighting;

public interface DayState {
    void update(Lighting lighting);
    void draw(Graphics2D g2, Lighting lighting);
}


