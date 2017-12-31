package ru.geekbrains.stargame;

/**
 * Created by Andrey Zverkov on 27.12.2017.
 */


import com.badlogic.gdx.Game;

import ru.geekbrains.stargame.screen.menu.MenuScreen;

public class Star2DGame extends Game {
    @Override
    public void create() {
        setScreen(new MenuScreen(this));
    }
}
