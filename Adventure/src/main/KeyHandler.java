package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

import command.key_command.CharacterStateCommand;
import command.key_command.Command;
import command.key_command.DialogueStateCommand;
import command.key_command.GameOverStateCommand;
import command.key_command.MapStateCommand;
import command.key_command.OptionsStateCommand;
import command.key_command.PauseStateCommand;
import command.key_command.PlayStateCommand;
import command.key_command.TileStateCommand;
import command.key_command.TradeStateCommand;

public class KeyHandler implements KeyListener
{
	GamePanel gp;
	private Map<Integer, Command> commands;
	public boolean upPressed, downPressed, leftPressed, rightPressed, enterPressed, shotKeyPressed, spacePressed;
	//DEBUG
	public boolean showDebugText = false;
	public boolean godModeOn = false;
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	public KeyHandler(GamePanel gp) {
		this.gp = gp;
		commands = new HashMap<>();
        initializeCommands();
	}
	@Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        Command command = commands.get(gp.gameState);
        if(command != null) {
            command.execute(code);
        }
    }
	private void initializeCommands() {
        commands.put(gp.playState, new PlayStateCommand(gp, this));
        commands.put(gp.pauseState, new PauseStateCommand(gp));
        commands.put(gp.tileState, new TileStateCommand(gp));
        commands.put(gp.dialogueState, new DialogueStateCommand(gp, this));
        commands.put(gp.characterState, new CharacterStateCommand(gp));
        commands.put(gp.optionsState, new OptionsStateCommand(gp, this));
        commands.put(gp.gameOverState, new GameOverStateCommand(gp));
        commands.put(gp.tradeState, new TradeStateCommand(gp, this));
        commands.put(gp.mapState, new MapStateCommand(gp));
    }

	
	@Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_W) upPressed = false;
        if(code == KeyEvent.VK_S) downPressed = false;
        if(code == KeyEvent.VK_A) leftPressed = false;
        if(code == KeyEvent.VK_D) rightPressed = false;
        if(code == KeyEvent.VK_F) shotKeyPressed = false;
        if(code == KeyEvent.VK_ENTER) enterPressed = false;
        if(code == KeyEvent.VK_SPACE) spacePressed = false;
    }
}
	

