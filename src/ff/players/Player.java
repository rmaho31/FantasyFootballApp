package ff.players;

public class Player {
	private int id;
	private String name;
	private int height;
	private int weight;
	private int age;
	private int yearsPro;
	private String position;
	/**
	 * @param id
	 * @param name
	 * @param height
	 * @param weight
	 * @param age
	 * @param yearsPro
	 * @param position
	 */
	public Player(int id, String name, int height, int weight, int age, int yearsPro, String position) {
		super();
		this.id = id;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.yearsPro = yearsPro;
		this.position = position;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the yearsPro
	 */
	public int getYearsPro() {
		return yearsPro;
	}
	/**
	 * @param yearsPro the yearsPro to set
	 */
	public void setYearsPro(int yearsPro) {
		this.yearsPro = yearsPro;
	}
	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	
	

}
