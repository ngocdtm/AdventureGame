package command.key_command;
import java.awt.event.KeyEvent;


import main.GamePanel;
import main.KeyHandler;
public class TradeStateCommand implements Command {
    private GamePanel gp;
    private KeyHandler keyHandler;

    public TradeStateCommand(GamePanel gp, KeyHandler keyHandler) {
        this.gp = gp;
        this.keyHandler = keyHandler;
    }

    @Override
    public void execute(int code) {
        if(code == KeyEvent.VK_ENTER) keyHandler.enterPressed = true;
        if(gp.ui.subState == 0) {
            if(code == KeyEvent.VK_W) {
                gp.ui.commandNum--;
                if(gp.ui.commandNum < 0) gp.ui.commandNum = 2;
                gp.playSE(9);
            }
            if(code == KeyEvent.VK_S) {
                gp.ui.commandNum++;
                if(gp.ui.commandNum > 2) gp.ui.commandNum = 0;
                gp.playSE(9);
            }
        }
        if(gp.ui.subState == 1) {
            if(code == KeyEvent.VK_ESCAPE) gp.ui.subState = 0;
            if(code == KeyEvent.VK_W && gp.ui.npcSlotRow != 0) {
                gp.ui.npcSlotRow--;
                gp.playSE(9);
            }
            if(code == KeyEvent.VK_A && gp.ui.npcSlotCol != 0) {
                gp.ui.npcSlotCol--;
                gp.playSE(9);
            }
            if(code == KeyEvent.VK_S && gp.ui.npcSlotRow != 3) {
                gp.ui.npcSlotRow++;
                gp.playSE(9);
            }
            if(code == KeyEvent.VK_D && gp.ui.npcSlotCol != 4) {
                gp.ui.npcSlotCol++;
                gp.playSE(9);
            }
        }
        if(gp.ui.subState == 2) {
            if(code == KeyEvent.VK_ESCAPE) gp.ui.subState = 0;
            if(code == KeyEvent.VK_W && gp.ui.playerSlotRow != 0) {
                gp.ui.playerSlotRow--;
                gp.playSE(9);
            }
            if(code == KeyEvent.VK_A && gp.ui.playerSlotCol != 0) {
                gp.ui.playerSlotCol--;
                gp.playSE(9);
            }
            if(code == KeyEvent.VK_S && gp.ui.playerSlotRow != 3) {
                gp.ui.playerSlotRow++;
                gp.playSE(9);
            }
            if(code == KeyEvent.VK_D && gp.ui.playerSlotCol != 4) {
                gp.ui.playerSlotCol++;
                gp.playSE(9);
            }
        }
    }
}