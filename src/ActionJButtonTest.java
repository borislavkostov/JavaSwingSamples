import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionJButtonTest extends JFrame {
		public  class CloseAction extends AbstractAction{
			public CloseAction()
			{
				super("Close");
			}
			@Override
			public void actionPerformed(ActionEvent event)
			{
				System.exit(0);
			}	
	}
		JButton closeButton1;
		JButton closeButton2;
		Action closeAction =new CloseAction();
		public ActionJButtonTest()
		{
			super("Using Action object with JButton");
			this.initFrame();
		}
		private void initFrame()
		{
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(new FlowLayout());
			Container contentPane=this.getContentPane();
			closeButton1=new JButton(closeAction);
			closeButton2=new JButton(closeAction);
			contentPane.add(closeButton1);
			contentPane.add(closeButton2);
			closeAction.putValue(Action.SHORT_DESCRIPTION, "Closes the application");
			closeAction.putValue(Action.MNEMONIC_KEY, KeyEvent.VK_C);
		}
		public static void main(String args[])
		{
			ActionJButtonTest frame =new ActionJButtonTest();
			frame.pack();
			frame.setVisible(true);
			
		}
}
