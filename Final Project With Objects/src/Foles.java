import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Foles
	{
		static int foles;
		static JFrame frame = new JFrame();
		private static String location;
		public static void playAdventure()
			{
				Object[] options = {"Let's start!"};
				foles = JOptionPane.showOptionDialog(frame, "Foles is a strong character with a stength of 15 and an intellectual level of 6",
						"Fole's Skills",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options[0]);

			}
		public static void location()
			{
				
				final String[] genre = { "SuperBowl", "Traffic"};
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
					if(location.equals("SuperBowl"))
				    	{
				    		
							final String[] problemForest = { "I do not have the strength to win the SuperBowl!", "I do have the strength and will win the SuperBowl!"};
							final JFrame frame = new JFrame();
							int boulderChallenge = JOptionPane.showOptionDialog(frame, "You are faced up against the Patriots. You must have the strength to beat this insane team! (Patriots strength = 13)",
									"Boulder",
									JOptionPane.YES_NO_CANCEL_OPTION,
									JOptionPane.QUESTION_MESSAGE,
									null, problemForest, null);
							
							if(boulderChallenge == 0)
								{
									final String[]  intelChallenge = {"I have failed!"};
									final JFrame frame1 = new JFrame();
									foles = JOptionPane.showOptionDialog(frame1, "You have been shut out in the SuperBowl 21-0",
											"Failure",
											JOptionPane.YES_NO_CANCEL_OPTION,
											JOptionPane.QUESTION_MESSAGE,
											null, intelChallenge, null);
									System.exit(0);
								}
							else
								{
									Game.heroes.get(1).setStrength(1000);
									
									
									final String[] newLilyIntel = { "You have succeded!!"};
									final JFrame frame1 = new JFrame();
									JOptionPane.showOptionDialog(frame1, "Your strength has been increased to " + Game.heroes.get(1).getStrength() + " !",
											"Boulder", 
											JOptionPane.YES_NO_CANCEL_OPTION,
											JOptionPane.QUESTION_MESSAGE,
											null, newLilyIntel, null);
									System.exit(0);

								}
				    		
				    	}
				    else
				    	{
				    		
				    		final String[] problemTower = { "Stay on the highway(Requires 1)", "Take a back way(Requires 6", "Use a map to find the best way to work(Requires 9)"};
							final JFrame frame = new JFrame();
							int problemAnswer = JOptionPane.showOptionDialog(frame, "You are faced with an intellectual challenge. You must get to work on time or coach will be mad. You have three choices. Each choice requires a certain intellcual level!",
									"Intellectual Challenge #1",
									JOptionPane.YES_NO_CANCEL_OPTION,
									JOptionPane.QUESTION_MESSAGE,
								
									null, problemTower, null);
							
							if(problemAnswer == 0)
								{
								
									
									Game.heroes.get(1).setIntel(8);
										
										
									final String[] newLilyIntel = { "Go me!"};
									final JFrame frame1 = new JFrame();
									JOptionPane.showOptionDialog(frame1, "You have made it to work on time! Foles Now has an intel level of " + Game.heroes.get(1).getIntel() + "!",
											"Boulder",
											JOptionPane.YES_NO_CANCEL_OPTION,
											JOptionPane.QUESTION_MESSAGE,
											null, newLilyIntel, null);
								}
							if(problemAnswer == 1)
								{
									Game.heroes.get(1).setIntel(13);
									
									final String[] newLilyIntel = { "Go me!"};
									final JFrame frame1 = new JFrame();
									JOptionPane.showOptionDialog(frame1, "You have made it to work on time! Foles Now has an intel level of " + Game.heroes.get(1).getIntel() + "!",
											"Traffic Problem",
											JOptionPane.YES_NO_CANCEL_OPTION,
											JOptionPane.QUESTION_MESSAGE,
											null, newLilyIntel, null);
								}
							if(problemAnswer == 2)
								{
									final String[] newLilyIntel = { "Bummer!"};
									final JFrame frame1 = new JFrame();
									JOptionPane.showOptionDialog(frame1, "You do not have an intellectual level of 9! You have crashed!",
											"Traffic Problem",
											JOptionPane.YES_NO_CANCEL_OPTION,
											JOptionPane.QUESTION_MESSAGE,
											null, newLilyIntel, null);
								}
				    	}
				}
				
			}