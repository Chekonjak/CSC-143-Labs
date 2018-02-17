import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2004
 * </p>
 * <p>
 * Company:
 * </p>
 *
 * @author not attributable
 * @version 1.0
 */

public class BoxViewer extends JPanel {

	// The box viewed by this viewer
	private Box box;

	/**
	 * Creates a box viewer within a frame
	 */
	public BoxViewer() {
		// Create a frame for this panel
		JFrame frame = new JFrame("Box viewer");
		frame.setSize(1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// The panel to display the box goes in the frame
		this.setBackground(Color.WHITE);
		frame.add(this);
		frame.setVisible(true);

		box = new Box(getWidth() / 2, getHeight() / 2, getHeight(), getWidth(), Color.RED);

		// A click on the viewer adds an inner box to the box
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			    if (e.isMetaDown()) {
                    System.out.println("A right click was received.");
			        if (!box.removeInnerBox()) {
			            JOptionPane.showMessageDialog(BoxViewer.this,"No box can be removed.",
                                "Information", JOptionPane.INFORMATION_MESSAGE); // Careful with this within a class override [may not be right?]
                    } else {
			            repaint();
                    }
                } else {
//                    System.out.println("Welcome!");
			        if (!box.addInnerBox()) {
			            JOptionPane.showMessageDialog(BoxViewer.this, "No box can be added", "Information",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
			            repaint();
                    }
                }
			}
		});
//		this.addMouseListener(new MouseAdapter() { // without Lambda
//			@Override
//			public void mousePressed(MouseEvent e) {
//				box.addInnerBox();
//				repaint();
//			}
//		}
	}

	/**
	 * Paints the contents of this viewer
	 *
	 * @param g
	 *            the graphics context to use.
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (box != null) {
			box.draw(g);
		}
	}

	/**
	 * Starts the application.
	 *
	 * @param args
	 *            the list of the command line parameters.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new BoxViewer();
			}
		});
	}
}






