package org.bleachhack.module.mods;
import org.bleachhack.module.Module;
import org.bleachhack.module.ModuleCategory;
import net.minecraft.text.Text;
public class NoRender extends Module {
    public Text[] signText = new Text[4];
    public NoRender() { super("NoRender", KEY_UNBOUND, ModuleCategory.MISC, "Disabled"); }
    public boolean isOverlayToggled(int i) { return false; }
    public boolean isWorldToggled(int i) { return false; }
}