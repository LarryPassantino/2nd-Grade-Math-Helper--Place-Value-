package mathgrouping;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Container;

public class MathHelpGUI extends JFrame {

	public JFrame frame;
	private JPanel contentPane;
	private JLabel  imageLabel;

	/**
	 * Create the frame.
	 */
	public MathHelpGUI() {
		frame = new JFrame ("Math Place Value Instructions");
		
		setBackground(Color.WHITE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 820);
		
		imageLabel = 
		new JLabel(new ImageIcon(getClass().getResource("/mathgrouping/helpScreen.jpg")));
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		imageLabel.setBounds(0, 0, 800, 800);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		contentPane.add(imageLabel);
		
		setVisible(true);
	}
}

