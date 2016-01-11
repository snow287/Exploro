import java.util.ArrayList;

public class Room {
	private int id;
	private String description;
	private ArrayList<GameObject> contents;
	private ArrayList<Door> doors;
	public final int width;
	public final int height;
	
	/**
	 * Room Constructor
	 * @param description Description of the room
	 * @param width Width of room grid in squares
	 * @param height Height of room grid in squares
	 * @param doors List of doors
	 */
	public Room(String description, int width, int height) {
		this.description = description;
		contents = new ArrayList<GameObject>();
		doors = new ArrayList<Door>();
		this.width = width;
		this.height = height;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getID() {
		return id;
	}
	
	public ArrayList<Door> getDoors() {
		return doors;
	}
	
	public ArrayList<GameObject> getContents() {
		return contents;
	}
	
	public void addDoor(Door door) {
		doors.add(door);
	}
	
}
