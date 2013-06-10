import java.awt.Color;

import javax.swing.*;

public class DisplayMessage extends JApplet {
	// Initialize the applet
	public void init() {
		// Get parameter vales from the HTML file
		String message = getParameter("MESSAGE");
		int x = Integer.parseInt(getParameter("X"));
		int y = Integer.parseInt(getParameter("Y"));
		String color = getParameter("COLOR");
		String font = getParameter("FONTNAME");
		int size = Integer.parseInt(getParameter("FONTSIZE"));
		
		// Create a message panel
		MessagePanel messagePanel = new MessagePanel(message);
		messagePanel.setXCoordinate(x);
		messagePanel.setYCoordinate(y);
		messagePanel.setFont(font);
		messagePanel.setFontColor(Color.decode(color));
		messagePanel.setFontSize(size);
		
		
		// Add the message to the applet
		add(messagePanel);
	}
}
