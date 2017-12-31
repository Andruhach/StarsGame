package ru.geekbrains.engine.utils;

/**
 * Created by Andrey Zverkov on 27.12.2017.
 */


import com.badlogic.gdx.utils.StringBuilder;

public class StrBuilder extends StringBuilder{

    public StringBuilder clear(){
        setLength(0);
        return this;
    }

}
