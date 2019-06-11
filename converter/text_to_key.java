package converter;

import javax.swing.JOptionPane;

import com.sun.glass.events.KeyEvent;

import GUI.auto_fish;

public class text_to_key
{
    public static int keyValue;
    public static boolean hasOKClicked;

    public static void convetTextnKey(String keyName)
    {
        if (keyName.equals("back"))
            keyValue = KeyEvent.VK_BACKSPACE;
        else if (keyName.equals("tab"))
            keyValue = KeyEvent.VK_TAB;
        else if (keyName.equals("enter"))
            keyValue = KeyEvent.VK_ENTER;
        else if (keyName.equals("leftshift") || keyName.equals("rightshift"))
            keyValue = KeyEvent.VK_SHIFT;
        else if (keyName.equals("leftcontrol") || keyName.equals("rightcontrol"))
            keyValue = KeyEvent.VK_CONTROL;
        else if (keyName.equals("leftalt") || keyName.equals("rightalt"))
            keyValue = KeyEvent.VK_ALT;
        else if (keyName.equals("capslock"))
            keyValue = KeyEvent.VK_CAPS_LOCK;
        else if (keyName.equals("escape"))
            keyValue = KeyEvent.VK_ESCAPE;
        else if (keyName.equals("space"))
            keyValue = KeyEvent.VK_SPACE;
        else if (keyName.equals("left"))
            keyValue = KeyEvent.VK_LEFT;
        else if (keyName.equals("up"))
            keyValue = KeyEvent.VK_UP;
        else if (keyName.equals("right"))
            keyValue = KeyEvent.VK_RIGHT;
        else if (keyName.equals("down"))
            keyValue = KeyEvent.VK_DOWN;
        else if (keyName.equals("oemcomma"))
            keyValue = KeyEvent.VK_COMMA;
        else if (keyName.equals("oemminus"))
            keyValue = KeyEvent.VK_MINUS;
        else if (keyName.equals("oemperiod"))
            keyValue = KeyEvent.VK_PERIOD;
        else if (keyName.equals("oemquestion"))
            keyValue = KeyEvent.VK_SLASH;
        else if (keyName.equals("oempipe"))
            keyValue = KeyEvent.VK_BACK_SLASH;
        else if (keyName.equals("d0"))
            keyValue = KeyEvent.VK_0;
        else if (keyName.equals("d1"))
            keyValue = KeyEvent.VK_1;
        else if (keyName.equals("d2"))
            keyValue = KeyEvent.VK_2;
        else if (keyName.equals("d3"))
            keyValue = KeyEvent.VK_3;
        else if (keyName.equals("d4"))
            keyValue = KeyEvent.VK_4;
        else if (keyName.equals("d5"))
            keyValue = KeyEvent.VK_5;
        else if (keyName.equals("d6"))
            keyValue = KeyEvent.VK_6;
        else if (keyName.equals("d7"))
            keyValue = KeyEvent.VK_7;
        else if (keyName.equals("d8"))
            keyValue = KeyEvent.VK_8;
        else if (keyName.equals("d9"))
            keyValue = KeyEvent.VK_9;
        else if (keyName.equals("oemsemicolon"))
            keyValue = KeyEvent.VK_SEMICOLON;
        else if (keyName.equals("oemplus"))
            keyValue = KeyEvent.VK_PLUS;
        else if (keyName.equals("a"))
            keyValue = KeyEvent.VK_A;
        else if (keyName.equals("b"))
            keyValue = KeyEvent.VK_B;
        else if (keyName.equals("c"))
            keyValue = KeyEvent.VK_C;
        else if (keyName.equals("d"))
            keyValue = KeyEvent.VK_D;
        else if (keyName.equals("e"))
            keyValue = KeyEvent.VK_E;
        else if (keyName.equals("f"))
            keyValue = KeyEvent.VK_F;
        else if (keyName.equals("g"))
            keyValue = KeyEvent.VK_G;
        else if (keyName.equals("h"))
            keyValue = KeyEvent.VK_H;
        else if (keyName.equals("i"))
            keyValue = KeyEvent.VK_I;
        else if (keyName.equals("j"))
            keyValue = KeyEvent.VK_J;
        else if (keyName.equals("k"))
            keyValue = KeyEvent.VK_K;
        else if (keyName.equals("l"))
            keyValue = KeyEvent.VK_L;
        else if (keyName.equals("m"))
            keyValue = KeyEvent.VK_M;
        else if (keyName.equals("n"))
            keyValue = KeyEvent.VK_N;
        else if (keyName.equals("o"))
            keyValue = KeyEvent.VK_O;
        else if (keyName.equals("p"))
            keyValue = KeyEvent.VK_P;
        else if (keyName.equals("q"))
            keyValue = KeyEvent.VK_Q;
        else if (keyName.equals("r"))
            keyValue = KeyEvent.VK_R;
        else if (keyName.equals("s"))
            keyValue = KeyEvent.VK_S;
        else if (keyName.equals("t"))
            keyValue = KeyEvent.VK_T;
        else if (keyName.equals("u"))
            keyValue = KeyEvent.VK_U;
        else if (keyName.equals("v"))
            keyValue = KeyEvent.VK_V;
        else if (keyName.equals("w"))
            keyValue = KeyEvent.VK_W;
        else if (keyName.equals("x"))
            keyValue = KeyEvent.VK_X;
        else if (keyName.equals("y"))
            keyValue = KeyEvent.VK_Y;
        else if (keyName.equals("z"))
            keyValue = KeyEvent.VK_Z;
        else if (keyName.equals("oemtilde"))
            keyValue = KeyEvent.VK_BACK_QUOTE;
        else if (keyName.equals("divide"))
            keyValue = KeyEvent.VK_DIVIDE;
        else if (keyName.equals("multiply"))
            keyValue = KeyEvent.VK_MULTIPLY;
        else if (keyName.equals("subtract"))
            keyValue = KeyEvent.VK_SUBTRACT;
        else if (keyName.equals("add"))
            keyValue = KeyEvent.VK_ADD;
        else if (keyName.equals("numlock"))
            keyValue = KeyEvent.VK_NUM_LOCK;
        else if (keyName.equals("home"))
            keyValue = KeyEvent.VK_HOME;
        else if (keyName.equals("pageup"))
            keyValue = KeyEvent.VK_PAGE_UP;
        else if (keyName.equals("end"))
            keyValue = KeyEvent.VK_END;
        else if (keyName.equals("pagedown"))
            keyValue = KeyEvent.VK_PAGE_DOWN;
        else if (keyName.equals("numpad7"))
            keyValue = KeyEvent.VK_NUMPAD7;
        else if (keyName.equals("numpad8"))
            keyValue = KeyEvent.VK_NUMPAD8;
        else if (keyName.equals("numpad9"))
            keyValue = KeyEvent.VK_NUMPAD9;
        else if (keyName.equals("numpad4"))
            keyValue = KeyEvent.VK_NUMPAD4;
        else if (keyName.equals("numpad5"))
            keyValue = KeyEvent.VK_NUMPAD5;
        else if (keyName.equals("numpad6"))
            keyValue = KeyEvent.VK_NUMPAD6;
        else if (keyName.equals("numpad1"))
            keyValue = KeyEvent.VK_NUMPAD1;
        else if (keyName.equals("numpad2"))
            keyValue = KeyEvent.VK_NUMPAD2;
        else if (keyName.equals("numpad3"))
            keyValue = KeyEvent.VK_NUMPAD3;
        else if (keyName.equals("decimal"))
            keyValue = KeyEvent.VK_DECIMAL;
        else if (keyName.equals("numpado"))
            keyValue = KeyEvent.VK_NUMPAD0;
        else if (keyName.equals("omequotes"))
            keyValue = KeyEvent.VK_QUOTE;
        else if (keyName.equals("oemopenbrackets"))
            keyValue = KeyEvent.VK_OPEN_BRACKET;
        else if (keyName.equals("oemclosebrackets"))
            keyValue = KeyEvent.VK_CLOSE_BRACKET;
        else if (keyName.equals("insert"))
            keyValue = KeyEvent.VK_INSERT;
        else if (keyName.equals("delete"))
            keyValue = KeyEvent.VK_DELETE;
        else if (keyName.equals("pause"))
            keyValue = KeyEvent.VK_PAUSE;
        else if (keyName.equals("scroll"))
            keyValue = KeyEvent.VK_SCROLL_LOCK;
        else
        {
            if
            (
                hasOKClicked == false && 
                JOptionPane.showConfirmDialog(null, 
                "Please change your terraria inventory key to a key\nthat is on your keyboard and is not a function key!", 
                keyName, JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION
            )
            {
                hasOKClicked = true;
                auto_fish.start_afk.setEnabled(true);
                auto_fish.stop_afk.setEnabled(false);
            }
        }
    }
}