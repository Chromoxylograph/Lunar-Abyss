package java.uiOverride;

import arc.graphics.Color;
import arc.graphics.g2d.Draw;
import arc.math.Mathf;
import arc.util.Time;
import mindustry.graphics.Pal;

public class StarBackground extends MenuBackground {
    private static final int starCount = 200;
    private static final float starSpeed = 0.1f;
    private static final float starSize = 1.5f;

    private final float[] starX = new float[starCount];
    private final float[] starY = new float[starCount];
    private final float[] starSizeArray = new float[starCount];

    public StarBackground() {
        for (int i = 0; i < starCount; i++) {
            starX[i] = Mathf.random(0, 100);
            starY[i] = Mathf.random(0, 100);
            starSizeArray[i] = Mathf.random(0.5f, starSize);
        }
    }

    @Override
    public void draw() {
        Draw.color(Color.valueOf("404040"));
        Draw.rect("white", 0, 0, 100, 100);

        Draw.color(Pal.accent);
        for (int i = 0; i < starCount; i++) {
            float x = starX[i] + Time.time * starSpeed;
            float y = starY[i];
            float size = starSizeArray[i];

            if (x > 100) {
                x = 0;
                y = Mathf.random(0, 100);
            }

            Draw.rect("white", x, y, size, size);
            starX[i] = x;
            starY[i] = y;
        }
    }
}
