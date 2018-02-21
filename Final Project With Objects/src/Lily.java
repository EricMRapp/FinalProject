import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

public class Lily
	{
		static int lily;
		static JFrame frame = new JFrame();
		
		private static String location;
		private static Object[] options2s;
		public static void playAdventure()
			{
				Object[] options = {"Let's start!"};
				lily = JOptionPane.showOptionDialog(frame, "Lily is a weak character with a stength of 7 and an intellectual level of 12",
						"Lily's Skills",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options[0]);
			}
				public static void location()
				{
					
					final String[] genre = { "Forest", "Tower"};
					final JFrame frame = new JFrame();
				    location = (String) JOptionPane.showInputDialog(frame, 
				            "What type of adventure would you like to experience?",
				            "Adventure Genre",
				            JOptionPane.QUESTION_MESSAGE, 
				            null, 
				            genre, 
				            genre[0]);
			
				   
				}
				public static void problemOne()
					{
						if(location.equals("Forest"))
					    	{
					    		
								final String[] problemForest = { "I do have the strength!", "I do not have the strength!"};
								final JFrame frame = new JFrame();
								int boulderChallenge = JOptionPane.showOptionDialog(frame, "You are faced with a strength challenge.  You must move a boulder that requires a strength of at least 9. Do you have the strength?(P.S. Your strength is 7)",
										"Boulder Problem",
										JOptionPane.YES_NO_CANCEL_OPTION,
										JOptionPane.QUESTION_MESSAGE,
										null, problemForest, null);
								
								if(boulderChallenge == 0)
									{
										final String[]  intelChallenge = {"I have failed!"};
										final JFrame frame1 = new JFrame();
										lily = JOptionPane.showOptionDialog(frame1, "You are to weak for this boulder. You have injured yourself.",
												"Failure",
												JOptionPane.YES_NO_CANCEL_OPTION,
												JOptionPane.QUESTION_MESSAGE,
												null, intelChallenge, null);
										System.exit(0);
									}
								else
									{
										Game.heroes.get(0).setStrength(15);
										
										
										final String[] newLilyIntel = { "Bummer! I was wanting those gains!"};
										final JFrame frame1 = new JFrame();
										JOptionPane.showOptionDialog(frame1, "You have outsmarted the boulder and have walked around. Your strength remains the same!",
												"Boulder Problem",
												JOptionPane.YES_NO_CANCEL_OPTION,
												JOptionPane.QUESTION_MESSAGE,
												null, newLilyIntel, null);
										System.exit(0);

									}
					    		
					    	}
					    else
					    	{
					    		
					    		final String[] problemTower = { "121", "144", "169"};
								final JFrame frame = new JFrame();
								int problemAnswer = JOptionPane.showOptionDialog(frame, "You are faced with an intellectual challenge.  You must solve a math problem to move onto your next challenge.  What is 12 squared?",
										"Math Problem",
										JOptionPane.YES_NO_CANCEL_OPTION,
										JOptionPane.QUESTION_MESSAGE,
									
										null, problemTower, null);
								
								if(problemAnswer == 1)
									{
									
										
										Game.heroes.get(0).setIntel(15);
											
											
										final String[] newLilyIntel = { "Go me!"};
										final JFrame frame1 = new JFrame();
										JOptionPane.showOptionDialog(frame1, "Lily Now has an intel level of" + Game.heroes.get(0).getIntel(),
												"Math Problem",
												JOptionPane.YES_NO_CANCEL_OPTION,
												JOptionPane.QUESTION_MESSAGE,
												null, newLilyIntel, null);
									}
								else
									{
										
										final String[]  intelChallenge = {"I have failed!"};
										final JFrame frame1 = new JFrame();
										lily = JOptionPane.showOptionDialog(frame1, "You are to dumb too pass this challenge.",
												"Math Problem",
												JOptionPane.YES_NO_CANCEL_OPTION,
												JOptionPane.QUESTION_MESSAGE,
												null, intelChallenge, null);
										System.exit(0);
									}
					    	}
					}
					
				}

			

	
