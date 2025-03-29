package command.key_command;
import java.awt.event.KeyEvent;

import main.KeyHandler;

import main.GamePanel;
public class DialogueStateCommand implements Command {
    private GamePanel gp;
    private KeyHandler keyHandler;

    public DialogueStateCommand(GamePanel gp, KeyHandler keyHandler) {
        this.gp = gp;
        this.keyHandler = keyHandler;
    }

    @Override
    public void execute(int code) {
        if(code == KeyEvent.VK_ENTER) keyHandler.enterPressed = true;
    }
}