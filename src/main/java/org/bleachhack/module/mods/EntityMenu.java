package org.bleachhack.module.mods;
import org.bleachhack.module.Module;
import org.bleachhack.module.ModuleCategory;
import org.bleachhack.util.collections.MutablePairList;
public class EntityMenu extends Module {
    public MutablePairList<String, String> interactions = new MutablePairList<>();
    public EntityMenu() { super("EntityMenu", KEY_UNBOUND, ModuleCategory.MISC, "Disabled"); }
}