package ru.geekbrains.stargame.screen.game.ui;

/**
 * Created by Andrey Zverkov on 27.12.2017.
 */


import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import ru.geekbrains.engine.ui.ActionListener;
import ru.geekbrains.engine.ui.ScaledTouchUpButton;

public class ButtonNewGame extends ScaledTouchUpButton {

    private final static float HEIGHT = 0.05f;
    private final static float TOP = -0.012f;
    private final static float PRESS_SCALE = 0.9f;

    public ButtonNewGame(TextureAtlas atlas, ActionListener listener) {
        super(atlas.findRegion("button_new_game"), listener, PRESS_SCALE);
        setHeightProportion(HEIGHT);
        setTop(TOP);
    }
}
