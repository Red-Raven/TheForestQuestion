public class Place {

  private String myName;
	private int myLength;
	private int myWidth;
	private int myEastEntranceX;
	private int myEastEntranceY;
	private int mySouthEntranceX;
	private int mySouthEntranceY;
	private int myWestEntranceX;
	private int myWestEntranceY;
	private int myNorthEntranceX;
	private int myNorthEntranceY;
	private Object[][] myGrid;
	
	public Place(String name, int length, int width, int eastEntranceX, int eastEntranceY, int southEntranceX, int southEntranceY, int westEntranceX, int westEntranceY, int northEntranceX, int northEntranceY)
	{
		myName = name;
		myLength = length;
		myWidth = width;
		myGrid = new Object[myLength][myWidth];
		myEastEntranceX = eastEntranceX;
		myEastEntranceY = eastEntranceY;
		mySouthEntranceX = southEntranceX;
		mySouthEntranceY = southEntranceY;
		myWestEntranceX = westEntranceX;
		myWestEntranceY = westEntranceY;
		myNorthEntranceX = northEntranceX;
		myNorthEntranceY = northEntranceY;
	}
	
	public Object getGridObject(int x, int y)
	{
		return myGrid[x][y];
	}
	
	public String getName()
	{
		return myName;
	}
	//add descriptions
	
}
