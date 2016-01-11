import java.util.ArrayList;

public class Game {
	private ArrayList<Room> rooms;
	
	public static void main(String[] args) {
		Game g = new Game();
		g.gameInit();
	}

	/**
	 * Initializes game world.
	 * Draws rooms and objects.
	 */
	public void gameInit() {
		// Create rooms
		Room lobby = new Room("Entrance to the manor", 10, 10);
		Room kitchen = new Room("Smells of rotting flesh.", 10, 10);
		
		// Create doors
		Door lobbyToKitchen = new Door("Off-white wooden door", lobby, kitchen);
	}
}
