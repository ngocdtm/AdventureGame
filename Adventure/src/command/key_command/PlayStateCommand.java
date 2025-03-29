package command.key_command;

import java.awt.event.KeyEvent;

import main.KeyHandler;

import main.GamePanel;

public class PlayStateCommand implements Command {
    private GamePanel gp;
    private KeyHandler keyHandler;

    public PlayStateCommand(GamePanel gp, KeyHandler keyHandler) {
        this.gp = gp;
        this.keyHandler = keyHandler;
    }

    @Override
    public void execute(int code) {
        if(code == KeyEvent.VK_W) keyHandler.upPressed = true;
        if(code == KeyEvent.VK_S) keyHandler.downPressed = true;
        if(code == KeyEvent.VK_A) keyHandler.leftPressed = true;
        if(code == KeyEvent.VK_D) keyHandler.rightPressed = true;
        if(code == KeyEvent.VK_P) gp.gameState = gp.pauseState;
        if(code == KeyEvent.VK_C) gp.gameState = gp.characterState;
        if(code == KeyEvent.VK_ENTER) keyHandler.enterPressed = true;
        if(code == KeyEvent.VK_F) keyHandler.shotKeyPressed = true;
        if(code == KeyEvent.VK_ESCAPE) gp.gameState = gp.optionsState;
        if(code == KeyEvent.VK_M) gp.gameState = gp.mapState;
        if(code == KeyEvent.VK_X) {
            gp.map.miniMapOn = !gp.map.miniMapOn;
        }
        if(code == KeyEvent.VK_SPACE) keyHandler.spacePressed = true;
        if(code == KeyEvent.VK_T) keyHandler.showDebugText = !keyHandler.showDebugText;
        if(code == KeyEvent.VK_R) {
            switch(gp.currentMap) {
                case 0: gp.tileM.loadMap("/maps/worldV3.txt", 0); break;
                case 1: gp.tileM.loadMap("/maps/interior01.txt", 1); break;
            }
        }
        if(code == KeyEvent.VK_G) keyHandler.godModeOn = !keyHandler.godModeOn;
    }
}