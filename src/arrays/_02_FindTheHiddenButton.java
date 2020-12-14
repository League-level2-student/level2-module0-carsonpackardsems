/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	JButton[] button;
	//1. create an array of JButtons. Don't initialize it yet.
	
	//2 create an int variable called hiddenButton
	int hiddenButton;
	int speed;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
	String answer =	JOptionPane.showInputDialog("Enter a positive number. 50 would be a good size.");
	String speed =	JOptionPane.showInputDialog("Enter a number between 10 and 50. This number will set your speed, 10 being very fast, and 50 being very slow.");
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		int translated = Integer.parseInt(answer);
		int speedRemake = Integer.parseInt(speed) * 10;
		button = new JButton[translated];
		int loopVar = translated ;
		//5. Make a for loop to iterate through the JButton array
		for(int i = 0; i < loopVar; i++) {
			button[i] = new JButton();
			button[i].addActionListener(this);
			panel.add(button[i]);
		}
		window.add(panel);
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		
		//9 add the panel to the window
		
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.setVisible(true);
		//11. set the JFrame to visible.
		
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "Hello Challenger.");
		JOptionPane.showMessageDialog(null, "My name is Chekt. (pronounced 'check-T'");
		JOptionPane.showMessageDialog(null, "Today we will be playing Find the Hidden Button.");
		JOptionPane.showMessageDialog(null, "I am an AI specially designed to test peoples perceptivness.");
		JOptionPane.showMessageDialog(null, "I will make a random one of these buttons show a special message for a small window of time.");
		JOptionPane.showMessageDialog(null, "Your job is to determine which of the buttons showed the message.");
		JOptionPane.showMessageDialog(null, "Good luck.");
		JOptionPane.showMessageDialog(null, "Mwa.");
		JOptionPane.showMessageDialog(null, "Ha.");
		JOptionPane.showMessageDialog(null, "Ha.");
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		Random r = new Random();
		Random rnt = new Random();
		hiddenButton = r.nextInt(translated - 1);
		int randomSaying = rnt.nextInt(3);
		//14. Set the text of the JButton located at hiddenButton to  "ME"
		if(randomSaying == 0) {
			button[hiddenButton].setText("ME");			
		}
		else if(randomSaying == 1) {
			button[hiddenButton].setText("I");
		}
		else if(randomSaying == 2) {
			button[hiddenButton].setText("DO");
		}
		else if(randomSaying == 3) {
			button[hiddenButton].setText("IT");
		}

		try {
			Thread.sleep(speedRemake);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//    Surround it with a try/catch - use Eclipse helper for this
		
		//16. Set the text of the JButton located at hiddenButton to be blank.
		button[hiddenButton].setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		if(buttonClicked == button[hiddenButton]) {
			JOptionPane.showMessageDialog(null, "You win!");
			JOptionPane.showMessageDialog(null, "Chekt.newObjective('Reset');");
			window.dispose();
			start();
		}
		else {
			JOptionPane.showMessageDialog(null, "Try Again");
		}
		//18. else tell them to try again
	}
}
