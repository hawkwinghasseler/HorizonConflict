package HorizonConflict.desktop;

import HorizonConflict.Main;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.title = "hello-world";
		config.width = 480;
		config.height = 320;
		
		new LwjglApplication(new Main(), config);
	}
}
