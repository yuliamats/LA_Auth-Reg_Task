package by.htp.library.controller;

import java.util.HashMap;
import java.util.Map;

import by.htp.library.controller.impl.AuthorizationCommand;
import by.htp.library.controller.impl.RegistrationCommand;

public class CommandProvider {

	private Map<CommandName, Command> commands = new HashMap<CommandName, Command>();

	public CommandProvider() {
		commands.put(CommandName.REGISTRATION, new RegistrationCommand());
		commands.put(CommandName.AUTHORIZATION, new AuthorizationCommand());
	}
			
	public Command getCommand(String strCommandName) {
		CommandName commandName;
		Command command;
		
		commandName = CommandName.valueOf(strCommandName.toUpperCase());
		command = commands.get(commandName);
		
		return command;
	}
}
