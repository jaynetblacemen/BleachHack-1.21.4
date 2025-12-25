package org.bleachhack.module.mods;
import org.bleachhack.module.Module;
import org.bleachhack.module.ModuleCategory;
public class UI extends Module {
    public UI() { super("UI", KEY_UNBOUND, ModuleCategory.MISC, "Disabled"); }
    public static int getRainbowFromSettings(int i) { return 0xFFFFFF; }
}