import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelTest {
	public static void main(String args[]){
		JPanel buttonPanel=new JPanel(new BorderLayout());
		JButton northButton=new JButton("North");
		JButton southButton=new JButton("South");
		JButton eastButton =new JButton("East");
		JButton westButton=new JButton("West");
		buttonPanel.add(northButton,BorderLayout.NORTH);
		buttonPanel.add(southButton,BorderLayout.SOUTH);
		buttonPanel.add(eastButton,BorderLayout.EAST);
		buttonPanel.add(westButton,BorderLayout.WEST);
		JFrame frame=new JFrame("Simlple JFrame");
		Container contentPane =frame.getContentPane();
		contentPane.add(buttonPanel, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}
}
