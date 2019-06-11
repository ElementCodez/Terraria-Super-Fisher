package globalListeners;

import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;
import GUI.auto_fish;

public class mouseListener implements NativeMouseInputListener
{
    @Override
    public void nativeMouseClicked(NativeMouseEvent e)
    {
        if (e.getButton() == 1)
        {
            if (auto_fish.isSettingiil == true)
            {
                auto_fish.ill_setLocation.setEnabled(true);
                auto_fish.isSettingiil = false;
                auto_fish.iil_x.setText("" + auto_fish.mouseGlobeXLoc);
                auto_fish.iil_y.setText("" + auto_fish.mouseGlobeYLoc);
            }

            if (auto_fish.isSettingftl == true)
            {
                auto_fish.ftl_setLocation.setEnabled(true);
                auto_fish.isSettingftl = false;
                auto_fish.ftl_x.setText("" + auto_fish.mouseGlobeXLoc);
                auto_fish.ftl_y.setText("" + auto_fish.mouseGlobeYLoc);
            }
        }
    }

    @Override
    public void nativeMousePressed(NativeMouseEvent e)
    {

    }

    @Override
    public void nativeMouseReleased(NativeMouseEvent e)
    {

    }

    @Override
    public void nativeMouseDragged(NativeMouseEvent e)
    {

    }

    @Override
    public void nativeMouseMoved(NativeMouseEvent e) 
    {

    }
}