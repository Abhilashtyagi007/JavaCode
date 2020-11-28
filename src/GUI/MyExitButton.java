package GUI;

import java.awt.*;
class MyExitButton extends Button {
    MyExitButton(String label) {
        super(label);
    }

    public boolean action(Event e, Object what) {
        System.exit(10);
        return true;
    }
}