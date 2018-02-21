import java.util.ArrayList;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Game
{	

	private static final long serialVersionUID = 1L;
	static String name; 
	static String characterChoose;
	static int character;
	static JFrame frame = new JFrame();
	static ArrayList<Character> heroes = new ArrayList<Character>();

	
	public static void main(String[] args)
	
		{
			heroes.add(new Character("Lily", 7, 12));
			heroes.add(new Character("Foles", 15, 6));
			heroes.add(new Character("Tom", 9, 9));
			name = JOptionPane.showInputDialog("Welcome to a text adventure.  To start I must know your name?");  
			JOptionPane.showMessageDialog(frame, "I have never heard of that name "  + name);
			
			
			Object[] options = {"Lily", "Foles", "Tom"};
			character = JOptionPane.showOptionDialog(frame, "You must choose a character.  Which character will you pick?",
					"Character Choice",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, options, options);
		
			switch(character)
			{
		case 0:
				{
					Lily.playAdventure();
					Lily.location();
					Lily.problemOne();
					
				break;
				}
			case 1:
				{
					Foles.playAdventure();
					Foles.location();
					Foles.problemOne();
				break;
				}
			case 2:
				{
					Tom.playAdventure();
					Tom.location();
					Tom.problemOne();
				break;
				}
				
		
		}
		}
}


			
				
			
		

			
			
			
			
			
		



	

	
