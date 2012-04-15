import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import java.awt.Color;
import java.util.ArrayList;

class myBug extends Bug
{

  private boolean found = false;
  private myBug otherBug1;
  private myBug otherBug2;

  /**
   * Create a Bug
   * @param bugColor Color of the bug
   */
  public myBug(Color bugColor)
  {
	   super(bugColor);
	   
  }
  
  public void addOthers( myBug o1, myBug o2) {

    this.otherBug1 = o1;

    this.otherBug2 = o2;

  }

  /**
   * Does something when step is pressed.
   */
  public void act()
  {

	  
	   //get the grid of this object
	   Grid<Actor> grid = this.getGrid();

	   
	   //get current location
	   Location currentLocation = this.getLocation();

	   //get a list of adjacent objects
	   ArrayList<Actor> adjObjects = grid.getNeighbors(currentLocation);
	   
	   //go through adjacent actors
	   for(Actor x : adjObjects)
	   {
		   //get object description
		   String objectDescription = x.toString();
		   
		   //see if it contains the string for yellow - check for gold rock
		   if( objectDescription.contains("r=255,g=255,b=0") )
		   {
			   found = true;
			   otherBug1.removeSelfFromGrid();
			   otherBug2.removeSelfFromGrid();
		   }
	   }
	   
	   
	   //if found is false, move to a random valid location
	   if( found == false )
	   {
		   //get a list of available locations
		   ArrayList<Location> validLocations = grid.getEmptyAdjacentLocations(currentLocation);
		    
		   //pick a random location
		   int randLocation = (int) (Math.random() * validLocations.size());
	
		   //move there
		   moveTo(validLocations.get(randLocation));
	   }
  }

}

public class test
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//setup myBug
		myBug bug1 = new myBug(Color.BLUE);
		Location bug1location = new Location(1, 1);
		myBug bug2 = new myBug(Color.GREEN);
		Location bug2location = new Location(9, 0);
		myBug bug3 = new myBug(Color.RED);
		Location bug3location = new Location(0, 9);
		bug1.addOthers(bug2, bug3);
		bug2.addOthers(bug1, bug3);
		bug3.addOthers(bug1, bug2);
		
		//setup a rock
		Rock rock1 = new Rock();
		Rock rock2 = new Rock();
		Rock rock3 = new Rock();
		Rock rock4 = new Rock(Color.YELLOW);
		Rock rock5 = new Rock();
		Rock rock6 = new Rock();
		Rock rock7 = new Rock();
		Rock rock8 = new Rock();
		Rock rock9 = new Rock();
		Rock rock10 = new Rock();

		
		//setup Grid
		BoundedGrid myGrid = new BoundedGrid(10, 10);
		
		//setup World
		ActorWorld world = new ActorWorld(myGrid);
		
		//add rocks and bugs
		world.add(bug1location, bug1);
		world.add(bug2location, bug2);
		world.add(bug3location, bug3);
		world.add(rock1);
		world.add(rock2);
		world.add(rock3);
		world.add(rock4);
		world.add(rock5);
		world.add(rock6);
		world.add(rock7);
		world.add(rock8);
		world.add(rock9);
		world.add(rock10);

		
		world.show();
	}
}