package ru.geekbrains.stargame.bullet;
/**
 * Created by Andrey Zverkov on 27.12.2017.
 */

import ru.geekbrains.engine.pool.SpritesPool;


public class BulletPool extends SpritesPool<Bullet> {

    @Override
    protected Bullet newObject() {
        return new Bullet();
    }

    @Override
    protected void debugLog() {

    }
}
