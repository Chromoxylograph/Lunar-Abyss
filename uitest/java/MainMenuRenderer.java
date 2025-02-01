package uitest.java;

import mindustry.graphics.MenuRenderer;

import static mindustry.Vars.mobile;

public class MainMenuRenderer extends MenuRenderer {
    private final int width = !mobile ? 100 : 60, height = !mobile ? 50 : 40;
    public MenuBackground background;

    public MainMenuRenderer(MenuBackground background) {
        this.background = background != null ? background : MenuUI.defaultBackground;
        generateBackground();
    }

    public void generateBackground() {
        background.generateWorld(width, height);
    }

    @Override
    public void render() {
        super.render();
        background.render();
    }
}
