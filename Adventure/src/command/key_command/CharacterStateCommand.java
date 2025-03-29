package command.key_command;
import java.awt.event.KeyEvent;


import main.GamePanel;
public class CharacterStateCommand implements Command {
    private GamePanel gp;

    public CharacterStateCommand(GamePanel gp) {
        this.gp = gp;
    }

    @Override
    public void execute(int code) {
        if(code == KeyEvent.VK_C) gp.gameState = gp.playState;
        if(code == KeyEvent.VK_ENTER) gp.player.selectItem();
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