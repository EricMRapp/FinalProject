import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tom
	{
		static int tom;
		static JFrame frame = new JFrame();
		private static String location;
		public static void playAdventure()
			{	
				Object[] options = {"Let's start!"};
				tom = JOptionPane.showOptionDialog(frame, "Tom is an overall average character with a stength of 9 and an intellectual level of 9",
					"Tom's Skills",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, options, options[0]);


			}
		public static void location()
			{
				final String[] genre = { "Parenthood", "Ball deflating"};
				final JFrame frame = new JFrame();
			    location = (String) JOptionPane.showInputDialog(frame, 
			            "What type of adventure would you like to experience?",
			            "Adventure Genre",
			            JOptionPane.QUESTION_MESSAGE, 
			            null, 
			            genre, 
			            null);
		
			   
			}
			public static void problemOne()
				{
					if(location.equals("Parenthood"))
				    	{
				    		
							final String[] problemParenthood = { "Gisele Bundchen(Spouse)", "Benjamin Brady(Son)", "Tom Brady Sr(Father)"};
							final JFrame frame = new JFrame();
							int parenthood = JOptionPane.showOptionDialog(frame, "You are faced up against your family. Which family member will you kiss?",
									"Problem Parenthood",
									JOptionPane.YES_NO_CANCEL_OPTION,
									JOptionPane.QUESTION_MESSAGE,
									null, problemParenthood, null);
							
							if(parenthood == 0)
								{
									Game.heroes.get(2).setIntel(15);
									final String[]  intelChallenge = {"Great!"};
									final JFrame frame1 = new JFrame();
									tom = JOptionPane.showOptionDialog(frame1, "This is the choice that makes the most sense your intellectual level has been increased to " + Game.heroes.get(2).getIntel() + ("!"),
											"Problem Parenthood",
											JOptionPane.YES_NO_CANCEL_OPTION,
											JOptionPane.QUESTION_MESSAGE,
											null, intelChallenge, null);
									System.exit(0);
								}
							if(parenthood == 1)
								{
									Game.heroes.get(2).setIntel(-1000);
									
									
									final String[] newLilyIntel = { "You have failed!"};
									final JFrame frame1 = new JFrame();
									JOptionPane.showOptionDialog(frame1, "This is the choice that doesn't make sense. Your intellectual level has been decreased to " + Game.heroes.get(2).getIntel() + " !",
											"Problem Parenthood", 
											JOptionPane.YES_NO_CANCEL_OPTION,
											JOptionPane.QUESTION_MESSAGE,
											null, newLilyIntel, null);
									System.exit(0);

								}
							if(parenthood == 2)
								{
									Game.heroes.get(2).setIntel(-1000);
									
									final String[] newLilyIntel = { "You have failed!"};
									final JFrame frame1 = new JFrame();
									JOptionPane.showOptionDialog(frame1, "This is the choice that doesn't make sense. Your intellectual level has been decreased to  " + Game.heroes.get(2).getIntel() + " !",
											"Problem Parenthood", 
											JOptionPane.YES_NO_CANCEL_OPTION,
											JOptionPane.QUESTION_MESSAGE,
											null, newLilyIntel, null);
									System.exit(0);
								}
							
				    		
				    	}
				    else
				    	{
				    		
				    		final String[] problemTower = { "I do have the strength to keep this a secret!", "I do not have the strength to keep this a secret!"};
							final JFrame frame = new JFrame();
							int problemAnswer = JOptionPane.showOptionDialog(frame, "You are faced up against a strength challenge. Do you have the strength to keep your ball deflation allegations on the down low",
									"Intellectual Challenge #1",
									JOptionPane.YES_NO_CANCEL_OPTION,
									JOptionPane.QUESTION_MESSAGE,
								
									null, problemTower, null);
							
							if(problemAnswer == 0)
								{
								
									
									Game.heroes.get(2).setStrength(15);
										
										
									final String[] newLilyIntel = { "Go me!"};
									final JFrame frame1 = new JFrame();
									JOptionPane.showOptionDialog(frame1, "You have came clean about these allegations. Your strength level has been increased to " + Game.heroes.get(2).getStrength() + "!",
											"Boulder",
											JOptionPane.YES_NO_CANCEL_OPTION,
											JOptionPane.QUESTION_MESSAGE,
											null, newLilyIntel, null);
								}
							if(problemAnswer == 1)
								{
									Game.heroes.get(2).setStrength(0);
									
									final String[] newLilyIntel = { "Go me!"};
									final JFrame frame1 = new JFrame();
									JOptionPane.showOptionDialog(frame1, "You have not come clean  about these allegations. Your intellectual level has been decreased to " + Game.heroes.get(2).getStrength() + "!",
											"Boulder",
											JOptionPane.YES_NO_CANCEL_OPTION,
											JOptionPane.QUESTION_MESSAGE,
											null, newLilyIntel, null);
								}
							
				    	}
				}
				
			}