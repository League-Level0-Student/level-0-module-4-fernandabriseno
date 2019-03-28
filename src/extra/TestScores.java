package extra;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("What was your test score on you last test? (Out of 100)");
		double scores = Double.parseDouble(score);
		if (scores < 80.5) {
			JOptionPane.showMessageDialog(null,
					"Well... not the best, but.... just work harder and study so you can get better scores! Better luck next time!");
		} else if (scores > 79.9) {
			JOptionPane.showMessageDialog(null,
					"Woah! You must have studied really hard! Congratulations! You totally deserve this!");
		}
	}
}