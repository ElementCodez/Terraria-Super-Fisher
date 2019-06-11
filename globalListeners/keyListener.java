package globalListeners;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import GUI.auto_fish;

public class keyListener implements NativeKeyListener
{
    @Override
    public void nativeKeyPressed(NativeKeyEvent e)
    {

    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e)
    {
        if (e.getKeyCode() == 59)
        {
            /**
             * Using F1 will start AFK
             * Sets the enable disable button like a toggle button
             * where it checks the state of the buttons to start or stop the program
             */
            auto_fish.start_afk.setEnabled(false);
            auto_fish.stop_afk.setEnabled(true);
        }
        else if (e.getKeyCode() == 60)
        {
            // Stop AFK using F2
            auto_fish.start_afk.setEnabled(true);
            auto_fish.stop_afk.setEnabled(false);
        }
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent e)
    {
        
    }
}