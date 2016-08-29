import java.awt.Component;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleFrame 
{
	public static void main(String args[])
	{
		JFrame frame=new JFrame("Simple swing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(50, 50, 200, 200);
		frame.setVisible(true);
		Container contentPane = frame.getContentPane();
		Component comps[] = contentPane.getComponents();
		JButton closeButton = new JButton("Close");
		JButton helpButton = new JButton("Help");
		contentPane.add(closeButton);
		contentPane.add(helpButton);
		frame.pack();
		
	}
}
