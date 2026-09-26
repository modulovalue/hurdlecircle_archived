package com.modestasv.hurdlecircle.desktop;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.modestasv.hurdlecircle.Game;
import com.modestasv.hurdlecircle.Interfaces.IProxable;

public class DesktopLauncher  {
    public static void main (String[] arg) {
        Lwjgl3ApplicationConfiguration cfg = new Lwjgl3ApplicationConfiguration();
        cfg.setWindowedMode(640, 800);
        cfg.setTitle("Hurdle Circle");

        IProxable iProxable = new IProxable() {
            @Override
            public float getProx() {
                return -1;
            }
        };

        DesktopActionResolver desktopActionResolver = new DesktopActionResolver();

        new Lwjgl3Application(new Game(iProxable, desktopActionResolver), cfg);
    }

}
