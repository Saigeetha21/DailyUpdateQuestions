package com.cg.day15;

public class StringUtil {
	public static String getCommand(String url) {
		String[] parts = url.split("/");
		String command = parts[parts.length - 1];
		command = command.replace(".html" ," ");
		return command;
	}

}
