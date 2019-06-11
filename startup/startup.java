package startup;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.jnativehook.GlobalScreen;

import GUI.auto_fish;
import globalListeners.*;

public class startup
{
    public static void main(String[] args)
    {
        GlobalScreen.addNativeKeyListener(new keyListener());
        GlobalScreen.addNativeMouseListener(new mouseListener());
		Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
		logger.setLevel(Level.OFF);
		
        try
        {
            GlobalScreen.registerNativeHook();
        }
        catch (Exception e)
        {
			e.printStackTrace();
		}

        new auto_fish().setVisible(true);
    }
}