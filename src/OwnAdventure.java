import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		int task = JOptionPane.showOptionDialog(null,
				"You're in terrible danger with Henry the dog.You're running away from a stalker.You're running in the woods in the rain.You see a creepy old mansion.What do you do?",
				"Tough Decision", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {
						"Leave Henry outside to watch out for the stalker", "Keep him with you to protect you." },
				null);

		boolean Adventure = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null,
				"Leave Henry outside the mansion in the rain to watch out for the stalker?",
				"HURRY!!! TIMES A WASTIN'!", JOptionPane.YES_NO_OPTION);
		System.out.println(Adventure);
		if (Adventure == true) {
			JOptionPane.showMessageDialog(null,
					"You leave Henry outside.Flashes of thunder and lightening help you spot a flashlight.You turn on the flashlight to see Henry ripped apart horribly by a shady figure.You run.");
		} else if (Adventure == false) {
			JOptionPane.showMessageDialog(null,
					"You bring Henry inside.Flashes of thunder and lightening help you spot a flashlight.Henry whimpers to a shadow outside. He runs away outside. You run, but broken-hearted.");
		}

		boolean Adventure2 = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null,
				"You run deeper into the mansion. You cry for Henry, but you need to survive. You shake it off. You end up in a hallway with two doors. Would you like to go into Door 1?",
				"Sorry for Henry, but you need to move on! HURRY!", JOptionPane.YES_NO_OPTION);
		System.out.println(Adventure2);
		if (Adventure2 == true) {
			JOptionPane.showMessageDialog(null,
					"You go through Door 1.You're in a dim room lit by a candle.Does the electricity work?You try to turn on the light.Nope.You start walking and fall down.");
		} else if (Adventure2 == false) {
			JOptionPane.showMessageDialog(null,
					"You go though Door 2.You're in a room brightly lit by many candles.Guess electricity doesn't work.Nope.You see a hole in the ground.You avoid it,but something pushes you in.");
		}
		boolean Adventure3 = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null,
				"You keep falling,but see mattress at bottom.You hear someone's voice. Scream for help? ", "OOF.",
				JOptionPane.YES_NO_OPTION);
		System.out.println(Adventure3);
		if (Adventure3 == true) {
			JOptionPane.showMessageDialog(null,
					"You think, yea, maybe they can help me.You scream, HELP!They laugh and say,why would you want help from the person you are trying to get away from?");
		} else if (Adventure3 == false) {
			JOptionPane.showMessageDialog(null,
					"You think, no, they won't help me, wait, this mansion is abandoned... That must have been the stalker....");
		}
		boolean Adventure4 = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null,
				"You fall onto the mattress and realize that WAS the stalker.Oh no.You see a donut and water.Pick the donut?",
				"OOF. HURRY!!! TIMES A WASTIN'!", JOptionPane.YES_NO_OPTION);
		System.out.println(Adventure4);
		if (Adventure4 == true) {
			JOptionPane.showMessageDialog(null,
					"You pick the donut.Bad idea.Water disappears.Great.You find a puddle on the floor.Dirty,but you drink it.You vomit.So not worth it.Now you're dizzy.");
		} else if (Adventure4 == false) {
			JOptionPane.showMessageDialog(null,
					"You pick the water.Good idea.No longer thirsty or hungry!Nice!You walk and hit your head. OOF. Now you are dizzy.");
		}
		boolean Adventure5 = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null,
				"You stumble to a hallway.Your head hurts and you cant think.You see two doors.WHEN WILL IT END!?One is pink the other is black. Pick pink?",
				"HURRY!!! TIMES A WASTIN'!", JOptionPane.YES_NO_OPTION);
		System.out.println(Adventure5);
		if (Adventure5 == true) {
			JOptionPane.showMessageDialog(null,
					"You pick the pink. You enter ANOTHER ROOM WITH TWO MORE DOORS!!!! UGHHH! You can hear faint footsteps. Uh oh. Hurry.");
		} else if (Adventure5 == false) {
			JOptionPane.showMessageDialog(null,
					"You pick black. You enter ANOTHER ROOM WITH TWO MORE DOORS!!! UGHHH!! You hear faint footsteps. Uh oh. Hurry.");
		}
	}
}
