package org.bleachhack.command.commands;
import org.bleachhack.command.Command;
import org.bleachhack.command.CommandCategory;
import org.bleachhack.command.exception.CmdSyntaxException;
import net.minecraft.item.ItemStack;
public class CmdEnchant extends Command {
    public CmdEnchant() { super("enchant", "Disabled", "Disabled", CommandCategory.CREATIVE); }
    @Override public void onCommand(String alias, String[] args) throws CmdSyntaxException {}
}