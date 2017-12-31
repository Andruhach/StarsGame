package ru.geekbrains.stargame.screen.menu.ui;

/**
 * Created by Andrey Zverkov on 27.12.2017.
 */


import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import ru.geekbrains.engine.math.Rect;
import ru.geekbrains.engine.ui.ActionListener;
import ru.geekbrains.engine.ui.ScaledTouchUpButton;

public class ButtonNewGame extends ScaledTouchUpButton {
    public ButtonNewGame(TextureAtlas atlas, ActionListener listener, float pressScale) {
        super(atlas.findRegion("btPlay"), listener, pressScale);
    }

    @Override
    public void resize(Rect worldBounds) {
        setBottom(worldBounds.getBottom());
        setLeft(worldBounds.getLeft());

    }
}
