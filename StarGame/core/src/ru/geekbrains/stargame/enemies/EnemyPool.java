package ru.geekbrains.stargame.enemies;

/**
 * Created by Andrey Zverkov on 27.12.2017.
 */


import ru.geekbrains.stargame.bullet.BulletPool;
import ru.geekbrains.stargame.explosions.ExplosionPool;
import ru.geekbrains.stargame.screen.game.MainShip;
import ru.geekbrains.engine.math.Rect;
import ru.geekbrains.engine.pool.SpritesPool;

public class EnemyPool extends SpritesPool<Enemy> {

    private final BulletPool bulletPool;
    private final ExplosionPool explosionPool;
    private final Rect worldBounds;
    private final MainShip mainShip;

    public EnemyPool(BulletPool bulletPool, ExplosionPool explosionPool, Rect worldBounds, MainShip mainShip) {
        this.bulletPool = bulletPool;
        this.explosionPool = explosionPool;
        this.worldBounds = worldBounds;
        this.mainShip = mainShip;
    }

    @Override
    protected Enemy newObject() {
        return new Enemy(bulletPool, explosionPool, worldBounds, mainShip);
    }

    @Override
    protected void debugLog() {
        System.out.println("EnemyPool change active/free: " + activeObjects.size() + "/" + freeObjects.size());
    }
}
