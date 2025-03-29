package command.key_command;
import java.awt.event.KeyEvent;


import main.GamePanel;
public class GameOverStateCommand implements Command {
    private GamePanel gp;

    public GameOverStateCommand(GamePanel gp) {
        this.gp = gp;
    }

    @Override
    public void execute(int code) {
        if(code == KeyEvent.VK_W) {
            gp.ui.commandNum--;
            if(gp.ui.commandNum < 0) gp.ui.commandNum = 1;
            gp.playSE(9);
        }
        if(code == KeyEvent.VK_S) {
            gp.ui.commandNum++;
            if(gp.ui.commandNum > 1) gp.ui.commandNum = 0;
            gp.playSE(9);
        }
        if(code == KeyEvent.VK_ENTER) {
            if(gp.ui.commandNum == 0) {
                gp.gameState = gp.playState;
                gp.resetGame(false);
                gp.playMusic(0);
            } else if(gp.ui.commandNum == 1) {
                gp.ui.tileScreenState = 0;
                gp.gameState = gp.tileState;
                gp.resetGame(true);
            }
        }
    }
}