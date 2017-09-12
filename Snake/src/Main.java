import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args){
		DrawingSurface drawing = new DrawingSurface();
		drawing.init();
		JFrame window = new JFrame();
		window.setSize(517, 540);
		window.setMinimumSize(new Dimension(100,100));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(drawing);
		window.requestFocus();
		window.setVisible(true);
	}
}
