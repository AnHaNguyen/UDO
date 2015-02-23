package udo.logic;

import udo.util.Config;

public class Logic {
    private static final String ERROR_FORMAT = "Error: %s";
    private static final String ERROR_INVALID_CMD_NAME =
            "Invalid command name";
    private static final String ERROR_UNSUPPORTED_CMD =
            "Unsupported command";
    
    private InputParser parser;
    
    private static String status;
    
    public Logic() {
        parser = new InputParser();
        /* TODO:
         * Initialize Storage
         * Initialize and start up passive thread for reminder
         */
    }
    
    /******************************
     * Code for the active logics *
     ******************************/
    
    /**
     * Execute the command given in the command string 
     * @param command the command string
     */
    public void executeCommand(String command) {
        Command parsedCommand = parser.parseCommand(command);
        
        if (isCommandValid(parsedCommand)) {
        } else {
           // TODO: Inform GUI of error status 
        }
    }

    /**
     * Check the semantics of a parsed command
     * @param parsedCommand
     * @return the command's correctness
     */
    private boolean isCommandValid(Command parsedCommand) {
        if (parsedCommand == null || parsedCommand.commandName == null ||
            parsedCommand.commandName.trim().equalsIgnoreCase("")) {
            status = formatErrorStr(ERROR_INVALID_CMD_NAME);
            return false;
        }
        
        String cmdName = parsedCommand.commandName;
        if (cmdName.equalsIgnoreCase(Config.CMD_STR_ADD)) {
            return isAddCmdValid(parsedCommand); 
        } else if (cmdName.equalsIgnoreCase(Config.CMD_STR_DELETE)) {
            return isDeleteCmdValid(parsedCommand);
        } else if (cmdName.equalsIgnoreCase(Config.CMD_STR_MODIFY)) {
            return isModifyCmdValid(parsedCommand);
        } else if (cmdName.equalsIgnoreCase(Config.CMD_STR_DISPLAY)) {
            return isDisplayCmdValid(parsedCommand);
        } else {
            status = formatErrorStr(ERROR_UNSUPPORTED_CMD);
            return false;
        }
    }

    private boolean isDisplayCmdValid(Command parsedCommand) {
        // TODO Auto-generated method stub
        return false;
    }

    private boolean isModifyCmdValid(Command parsedCommand) {
        // TODO Auto-generated method stub
        return false;
    }

    private boolean isDeleteCmdValid(Command parsedCommand) {
        // TODO Auto-generated method stub
        return false;
    }

    private boolean isAddCmdValid(Command parsedCommand) {
        // TODO Auto-generated method stub
        return false;
    }

    private String formatErrorStr(String errorInvalidCmdName) {
        return String.format(ERROR_FORMAT, errorInvalidCmdName);
    }
}