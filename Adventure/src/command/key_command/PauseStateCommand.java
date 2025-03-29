package command.key_command;
import java.awt.event.KeyEvent;

import javax.swing.plaf.basic.BasicComboBoxUI.KeyHandler;

import main.GamePanel;
public class PauseStateCommand implements Command {
    private GamePanel gp;

    public PauseStateCommand(GamePanel gp) {
        this.gp = gp;
    }

    @Override
    public void execute(int code) {
        if(code == KeyEvent.VK_P) {
            gp.gameState = gp.playState;
        }
    }
}
