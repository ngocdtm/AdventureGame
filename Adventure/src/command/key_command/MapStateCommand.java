package command.key_command;
import java.awt.event.KeyEvent;


import main.GamePanel;
public class MapStateCommand implements Command {
    private GamePanel gp;

    public MapStateCommand(GamePanel gp) {
        this.gp = gp;
    }

    @Override
    public void execute(int code) {
        if(code == KeyEvent.VK_M) gp.gameState = gp.playState;
    }
}