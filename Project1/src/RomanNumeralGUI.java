import java.awt.GridLayout;
import javax.swing.*; 

public class RomanNumeralGUI extends JFrame {
	
public static void main (String [] args) {

}
		public static JFrame createAndShowGUI() {
			
            //Create and set up the window.
            JFrame frame = new JFrame();
            frame.pack(); // to format the GUI
            frame.setVisible(true);
            frame.setLayout(new GridLayout(1,2)); // to set up a a grid layout of 1 row, 2 columns
            frame.setTitle("RomanNumeralConversion"); // to create the name 
            frame.setSize(400, 400);// to set the length and width dimensions of the GUI
            frame.setLocationRelativeTo(null); // to center the GUI popup
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to exit when you press the close button
            
			return frame;
        }
}
