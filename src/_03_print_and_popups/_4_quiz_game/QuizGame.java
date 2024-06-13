package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("What is 9 + 10?");
				// 3.  Use an if statement to check if their answer is correct
				if(answer.equals ("19")) {
				// 4.  if the user's answer was correct, add one to their score 
					score = score + 1;
					JOptionPane.showMessageDialog(null, "correct");
				} else {
					score = score - 1;
					JOptionPane.showMessageDialog(null, "Incorrect");
				
				}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
				String answer1 = JOptionPane.showInputDialog("What is 4^4?");
				if(answer1.equals ("256")) {
					
					score = score + 1;
					JOptionPane.showMessageDialog(null, "correct");
				} else {
					score = score - 1;
					JOptionPane.showMessageDialog(null, "Incorrect");
				}
				
				String answer2 = JOptionPane.showInputDialog("What is 2^8?");
				
				if(answer2.equals ("256")) {
					
				score = score + 1;
						JOptionPane.showMessageDialog(null, "correct");
				}else {
					score = score - 1;
					JOptionPane.showMessageDialog(null, "Incorrect");
				}
				
				JOptionPane.showMessageDialog(null, "Your score is "+score);
				
		// After all the questions have been asked, tell the user their final score 
		
	}
}