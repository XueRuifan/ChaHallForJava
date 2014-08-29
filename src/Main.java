import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Main {

	public static void main(String[] args)
	{
		Frame s = new Frame();
		s.setSize(500, 400);
		s.setVisible(true);
		
		s.addWindowListener(new WindowLis());
	}
}

class WindowLis extends WindowAdapter
{

	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		super.windowClosing(arg0);
		System.exit(0);
	}
	
}
