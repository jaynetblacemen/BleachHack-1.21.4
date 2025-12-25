package org.bleachhack.command.commands;
import org.bleachhack.command.Command;
import org.bleachhack.command.CommandCategory;
import org.bleachhack.command.exception.CmdSyntaxException;
public class CmdRename extends Command {
    public CmdRename() { super("rename", "Disabled", "Disabled", CommandCategory.CREATIVE); }
    @Override public void onCommand(String alias, String[] args) throws CmdSyntaxException {}
}