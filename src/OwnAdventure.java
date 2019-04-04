import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog( "You're in terrible danger with Henry the dog.You're running away from a stalker.You're running in the woods in the rain.You see a creepy old mansion.What do you do?");
		boolean Adventure = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null,"Leave Henry outside the mansion in the rain to watch out for the stalker?", "HURRY!!! TIMES A WASTIN'!", JOptionPane.YES_NO_OPTION);
		System.out.println(Adventure); 
		if (Adventure == true) {
			JOptionPane.showMessageDialog(null, "You leave Henry outside.Flashes of thunder and lightening help you spot a flashlight.You turn on the flashlight to see Henry ripped apart horribly by a shady figure.You run.");
		} else if (Adventure == false) {
			JOptionPane.showMessageDialog(null, "You bring Henry inside.Flashes of thunder and lightening help you spot a flashlight.Henry whimpers to shadow outside. You run and end up in a hallway with 2 doors.");
		}

	}
}
