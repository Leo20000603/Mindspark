/*
 * TO DO LIST:
 * 1. Better Images
 * 2. custom AI
 * 3. Special Powers
 * 4. Bosses
 * 5. Power Ups
 * 6. Different Levels
 * 7. Multiplayer?
 */

import java.awt.Dimension;

import javax.swing.JFrame;

import processing.core.PApplet;

public class Main {
	
	public static void main(String args[]) {
		DrawingSurface drawing = new DrawingSurface();
		drawing.init();
		JFrame window = new JFrame();
		window.setSize(DrawingSurface.WIDTH, DrawingSurface.HEIGHT);
		window.setMinimumSize(new Dimension(100,100));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(drawing);
		window.requestFocus();
		window.setVisible(true);
	}

}


