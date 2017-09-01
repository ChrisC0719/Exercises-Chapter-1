package GameZone;

import javax.swing.JOptionPane;

public class RandomGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "Hey! Think of a number between 1-10 and I'll guess it.");
	    JOptionPane.showMessageDialog(null,"The Number is" + (1 + (int)(Math.random() * 10)));}

}
