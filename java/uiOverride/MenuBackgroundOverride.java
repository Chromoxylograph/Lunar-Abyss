package java.uiOverride;

import mindustry.mod.Mod;
import mindustry.ui.MenuBackground;

public class MenuBackgroundOverride extends Mod {

    @Override
    public void init() {
        // Replace the default menu background with our custom star background
        MenuBackground.set(new StarBackground());
    }
}
