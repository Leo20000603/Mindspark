

import java.awt.Dimension;

import javax.swing.JFrame;

import processing.core.PApplet;

public class Main {
	
	public static void main(String args[]) {
		System.out.println(-7 % 4);
		DrawingSurface drawing = new DrawingSurface();
		drawing.init();
		JFrame window = new JFrame();
		window.setSize(600, 480);
		window.setMinimumSize(new Dimension(100,100));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(drawing);
		window.requestFocus();
		window.setVisible(true);
	}

}
