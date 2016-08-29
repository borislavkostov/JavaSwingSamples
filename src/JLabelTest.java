import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JLabelTest {
	public static void main(String args[]){
		JFrame frame = new JFrame();
		Container contentPane = frame.getContentPane();
		JTextField nameTextField = new JTextField("Please enter yout name...");
		JLabel nameLabel = new JLabel("Name: ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nameLabel.setDisplayedMnemonic(KeyEvent.VK_N);
		nameLabel.setLabelFor(nameTextField);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		contentPane.add(nameLabel);
		contentPane.add(nameTextField);
		frame.pack();
		frame.setVisible(true);
	}
}
