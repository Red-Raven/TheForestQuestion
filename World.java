package game;

public class World {
  
	private Place[][] myPlaceGrid;
	private int myLength;
	private int myWidth;
	
	public World(int length, int width)
	{
		myLength = length;
		myWidth = width;
		myPlaceGrid = new Place[myLength][myWidth];
	}
	
	public Place getPlace(int x, int y)
	{
		return myPlaceGrid[x][y];
	}

}
