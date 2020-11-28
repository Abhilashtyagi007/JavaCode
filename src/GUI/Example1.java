package GUI;

import java.awt.*;
import java.awt.event.*;
class Example1 extends Frame
        implements ActionListener, ItemListener, WindowListener {
    Example1(String m) {
        super("Example1: " + m);
        Button b;
        Checkbox c;
        setSize(240, 140);
        Panel p = new Panel();
        p.add(new Label("Conference Registration"));
        p.add(c = new Checkbox("Attend Tutorial"));
        c.addItemListener(this);
        p.add(c = new Checkbox("Require Hotel"));
        c.addItemListener(this);
        p.add(b = new Button("Reset"));
        b.addActionListener(this);
        p.add(b = new Button("Submit"));
        b.addActionListener(this);


        addWindowListener(this);
        add(p);
        setVisible(true);
    }
    public static void main(String arg[]) {
        new Example1("Event Handling");
    }
    public void actionPerformed(ActionEvent evt) {
        System.out.println("actionPerformed: " + evt.getSource().toString());
    }
    public void itemStateChanged(ItemEvent itm) {
        System.out.println("itemStateChanged: " + itm.getItemSelectable());
    }
    public void windowActivated(WindowEvent we) { }
    public void windowClosed(WindowEvent we) { }
    public void windowClosing(WindowEvent we) { System.exit(0) ; }
    public void windowDeactivated(WindowEvent we) { }
    public void windowDeiconified(WindowEvent we) { }
    public void windowIconified(WindowEvent we) { }
    public void windowOpened(WindowEvent we) { }
}