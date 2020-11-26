package GUI;

import javax.swing.*;

class MyFrame extends JFrame{
	
	public MyFrame() {
		setTitle("This is my first GUI");
		setSize(400,300);
	}
}


public class FrameTest {

	public static void main(String[] args) {
		JFrame frame = new MyFrame();
		frame.setVisible(true);
	}

}

