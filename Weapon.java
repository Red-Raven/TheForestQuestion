package game;

public class Weapon {
  String myName;
	int myRange;
	int myDamage;

	public Weapon(String name, int range, int damage)
	{
		myName = name;
		myRange = range;
		myDamage = damage;
	}

	public String getName()
	{
		return myName;
	}

	public int getRange()
	{
		return myRange;
	}

	public int getDamage()
	{
		return myDamage;
	}

	public int getCalculatedDamage(int distance, int armorCoefficient)
	{
		//this will use distance and the armor of the target
		//(which are precalculated from other methods)
		//along with myRange and myDamage.
		//distance - effect depends on range and kind of weapon
		//armor - calculated damage varies inversely
		//myRange - optimal distance for maximum damage
		//myDamage - overall effectiveness of weapon. multiple or divide final int by this.
	}


}
