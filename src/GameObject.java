
public class GameObject {
	
	private int hp;
	private String description;
	
	public GameObject(String description, int hp) {
		this.description = description;
		this.hp = hp;
	}
	
	public GameObject(String description) {
		this.description = description;
		hp = 100;
	}
	
	/**
	 * Adds a given amount of HP
	 * to the GameObject. Use negative
	 * amounts to subtract.
	 * @inv 0 <= hp <= 100
	 * @param amount
	 */
	public void addHP(int amount) {
		hp += amount;
	}
	
	public int getHP() {
		return hp;
	}
	
	public String getDescription() {
		return description;
	}
}
