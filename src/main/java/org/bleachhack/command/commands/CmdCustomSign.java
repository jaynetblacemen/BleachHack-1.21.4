package org.bleachhack.command.commands;
import org.bleachhack.command.Command;
import org.bleachhack.command.CommandCategory;
import org.bleachhack.command.exception.CmdSyntaxException;
public class CmdCustomSign extends Command {
    public CmdCustomSign() { super("customsign", "Disabled", "Disabled", CommandCategory.MISC); }
    @Override public void onCommand(String alias, String[] args) throws CmdSyntaxException {}
}