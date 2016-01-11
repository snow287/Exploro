
public class Door extends GameObject {
	private Room from;
	private Room to;
	
	public Door(String description, Room from, Room to, int hp) {
		super(description, hp);
		this.from = from;
		this.to = to;
	}
	
	public Door(String description, Room from, Room to) {
		super(description);
		this.from = from;
		this.to = to;
	}
	
	public Room getOtherRoom(Room room) {
		if (room.equals(from)) {
			return to;
		} else {
			return from;
		}
	}
}
