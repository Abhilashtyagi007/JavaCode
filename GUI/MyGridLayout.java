package GUI;
import java.awt.*;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGridLayout extends Frame {

	MyGridLayout(String m){
		super("Layout:"+ m);
		setSize(240,80);
		Panel p = new Panel();
		add(p);
		p.setLayout(new GridLayout(3,2));
		p.add(new Checkbox("save config"));
		p.add(new Button("Save"));
		p.add(new Checkbox("Save setting"));
		p.add(new Button("Abort & do not save"));
		p.add(new Checkbox("Ignore colors"));
		p.add(new Button("Quit"));
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}

	public static void main(String[] args) {
		new MyGridLayout("GridLayout");

	}

}
