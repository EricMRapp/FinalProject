
public class Character
	{

		String name;
		int strength;
		int intel;
		
		
		public Character(String n, int s, int i)
			{
				name = n;
				strength = s;
				intel = i;
			
			}


		public String getName()
			{
				return name;
			}


		public void setName(String name)
			{
				this.name = name;
			}


		public int getStrength()
			{
				return strength;
			}


		public void setStrength(int strength)
			{
				this.strength = strength;
			}


		public int getIntel()
			{
				return intel;
			}


		public void setIntel(int intel)
			{
				this.intel = intel;
			}

	

	}
