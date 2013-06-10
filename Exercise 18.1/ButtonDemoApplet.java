import javax.swing.JFrame;

public class ButtonDemoApplet {
	
	public static void main(String[] args){
		
		ButtonDemo frame = new ButtonDemo(); 
		
		frame.setSize(300, 100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
