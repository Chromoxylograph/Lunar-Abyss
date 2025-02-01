package uitest.java;

import arc.math.Mathf;
import arc.math.geom.Vec3;
import arc.struct.Seq;
import mindustry.Vars;
import mindustry.content.Planets;
import mindustry.ctype.ContentType;
import mindustry.graphics.g3d.PlanetParams;
import mindustry.type.Planet;

import static mindustry.Vars.content;

public class MenuUI {
    public static MenuBackground defaultBackground, solarSystem;

    public static void load() {
        // Default background (thanks, Project Restoration otherwise I probably wouldnt have added the fallback haha)
        defaultBackground = new SpaceMenuBackground() {{
            params = new PlanetParams() {{
                planet = Planets.serpulo;
                zoom = 0.6f;
            }};
        }};

        // Solar system background
        solarSystem = new SpaceMenuBackground() {{
            params = new PlanetParams() {{
                planet = Planets.sun; // Use the sun as the center
                camPos = new Vec3(0, 0.5f, 0); // Adjust camera position
                zoom = 12f; // Zoom out to show the solar system
            }};
        }};
    }
}
