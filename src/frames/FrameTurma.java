package frames;

import javax.swing.JButton;
import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

public class FrameTurma  extends FrameCrud {
	
	public static void main(String[] args) {
		
	}
	
	public FrameTurma() {
		initialize();
	}

	private static void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[450px]", "[45px][45px][45px][45px][45px][45px]"));
		frame.setLocation(300, 300);
	
	}
}