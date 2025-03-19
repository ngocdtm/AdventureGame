package singleton;

import main.GamePanel;

public class EventDialogueManager {
    // The single instance of EventDialogueManager
    private static EventDialogueManager instance;

    // Array storing dialogues (can be expanded to a list or Map if needed)
    private String[][] dialogues;

    // Private constructor to prevent instantiation from outside
    private EventDialogueManager() {
        dialogues = new String[20][20]; // Maximum of 20 dialogue sets, each containing 20 lines
        initializeDialogues();
    }

    // Static method to get the unique instance
    public static EventDialogueManager getInstance() {
        if (instance == null) {
            instance = new EventDialogueManager();
        }
        return instance;
    }

    // Initialize dialogue data
    private void initializeDialogues() {
        dialogues[0][0] = "You fall into a pit!";
        
        dialogues[1][0] = "You drink the water.\nYour life and mana have been recovered.\n(The progress has been saved)";
        dialogues[1][1] = "OMG, this is good water.";
        
        dialogues[2][0] = "To enter this area you need to be level 3!";
        
        dialogues[3][0] = "To enter this area you need to be level 5!";
    }

    // Retrieve a specific dialogue line
    public String getDialogue(int set, int index) {
        if (set >= 0 && set < dialogues.length && index >= 0 && index < dialogues[set].length) {
            return dialogues[set][index];
        }
        return null; // Return null if the index is invalid
    }

    // Start a dialogue (set game state and display the first line)
    public void startDialogue(GamePanel gp, int set) {
        if (set >= 0 && set < dialogues.length && dialogues[set][0] != null) {
            gp.gameState = gp.dialogueState;
            gp.ui.currentDialogue = dialogues[set][0];
            gp.ui.npc = null; // Not associated with any NPC
        }
    }

    // (Optional) Add a method to support multi-line dialogues if needed
    public String[] getDialogueSet(int set) {
        if (set >= 0 && set < dialogues.length) {
            return dialogues[set];
        }
        return null;
    }
}