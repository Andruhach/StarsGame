package ru.geekbrains.stargame.star;

/**
 * Created by Andrey Zverkov on 27.12.2017.
 */


import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class TrackingStar extends Star {

    private final Vector2 trackingV;

    public TrackingStar(TextureRegion region, float vx, float vy, float height, Vector2 trackingV) {
        super(region, vx, vy, height);
        this.trackingV = trackingV;
    }

    private final Vector2 sumV = new Vector2();

    @Override
    public void update(float deltaTime) {
        sumV.setZero().mulAdd(trackingV, 0.2f).rotate(180).add(v);
        pos.mulAdd(sumV, deltaTime);
        checkAndHandleBounds();
    }
}
