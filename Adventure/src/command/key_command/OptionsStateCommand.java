package command.key_command;
import java.awt.event.KeyEvent;
import main.KeyHandler;

import main.GamePanel;
public class OptionsStateCommand implements Command {
    private GamePanel gp;
    private KeyHandler keyHandler;

    public OptionsStateCommand(GamePanel gp, KeyHandler keyHandler) {
        this.gp = gp;
        this.keyHandler = keyHandler;
    }

    @Override
    public void execute(int code) {
        if(code == KeyEvent.VK_ESCAPE) gp.gameState = gp.playState;
        if(code == KeyEvent.VK_ENTER) keyHandler.enterPressed = true;

        int maxCommandNum = gp.ui.subState == 0 ? 5 : (gp.ui.subState == 3 ? 1 : 0);
        if(code == KeyEvent.VK_W) {
            gp.ui.commandNum--;
            gp.playSE(9);
            if(gp.ui.commandNum < 0) gp.ui.commandNum = maxCommandNum;
        }
        if(code == KeyEvent.VK_S) {
            gp.ui.commandNum++;
            gp.playSE(9);
            if(gp.ui.commandNum > maxCommandNum) gp.ui.commandNum = 0;
        }
        if(code == KeyEvent.VK_A && gp.ui.subState == 0) {
            if(gp.ui.commandNum == 1 && gp.music.volumeScale > 0) {
                gp.music.volumeScale--;
                gp.music.checkVolume();
                gp.playSE(9);
            }
            if(gp.ui.commandNum == 2 && gp.se.volumeScale > 0) {
                gp.se.volumeScale--;
                gp.playSE(9);
            }
        }
        if(code == KeyEvent.VK_D && gp.ui.subState == 0) {
            if(gp.ui.commandNum == 1 && gp.music.volumeScale < 5) {
                gp.music.volumeScale++;
                gp.music.checkVolume();
                gp.playSE(9);
            }
            if(gp.ui.commandNum == 2 && gp.se.volumeScale < 5) {
                gp.se.volumeScale++;
                gp.playSE(9);
            }
        }
    }
}