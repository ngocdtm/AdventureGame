package command.key_command;

import java.awt.event.KeyEvent;

import main.GamePanel;

public class TileStateCommand implements Command {
    private GamePanel gp;

    public TileStateCommand(GamePanel gp) {
        this.gp = gp;
    }

    @Override
    public void execute(int code) {
        if(gp.ui.tileScreenState == 0) {
            if(code == KeyEvent.VK_W) {
                gp.ui.commandNum--;
                if(gp.ui.commandNum < 0) gp.ui.commandNum = 2;
            }
            if(code == KeyEvent.VK_S) {
                gp.ui.commandNum++;
                if(gp.ui.commandNum > 2) gp.ui.commandNum = 0;
            }
            if(code == KeyEvent.VK_ENTER) {
                if(gp.ui.commandNum == 0) gp.ui.tileScreenState = 1;
                if(gp.ui.commandNum == 1) {
                    gp.saveLoad.load();
                    gp.gameState = gp.playState;
                    gp.playMusic(0);
                }
                if(gp.ui.commandNum == 2) System.exit(0);
            }
        } else if(gp.ui.tileScreenState == 1) {
            if(code == KeyEvent.VK_W) {
                gp.ui.commandNum--;
                if(gp.ui.commandNum < 0) gp.ui.commandNum = 2;
            }
            if(code == KeyEvent.VK_S) {
                gp.ui.commandNum++;
                if(gp.ui.commandNum > 2) gp.ui.commandNum = 0;
            }
            if(code == KeyEvent.VK_ENTER) {
                if(gp.ui.commandNum == 0) {
                    gp.player.playerType = "Boy";
                    gp.player.getImage();
                    gp.player.getAttackImage();
                    gp.gameState = gp.playState;
                    gp.playMusic(0);
                }
                if(gp.ui.commandNum == 1) {
                    gp.player.playerType = "Girl";
                    gp.player.getImage();
                    gp.player.getAttackImage();
                    gp.gameState = gp.playState;
                    gp.playMusic(0);
                }
                if(gp.ui.commandNum == 2) gp.ui.tileScreenState = 0;
            }
        }
    }
}
