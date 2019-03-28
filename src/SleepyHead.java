
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Heyo! Good morning! Is it a weekday or a weekend today?");
		boolean onVacation = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null,"Heyo! Are you on vacation?", "", JOptionPane.YES_NO_OPTION);
		System.out.println(onVacation);
		if (answer.equals("weekend") || onVacation == true) {
			JOptionPane.showMessageDialog(null, "Oh! I'm so sorry! Go ahead and sleep in! Enjoy your weekend!");
		} else if (answer.equals("weekday") && onVacation == false) {
			JOptionPane.showMessageDialog(null, "GeT uP lAzY BoNeS! WhAt ARe yOu dOInG aSlEeP!?!?!?");
		}

		/*
		 * Ask the user for these values using JOptionPane.showConfirmDialog(null,
		 * "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		 */

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */
	}
}
