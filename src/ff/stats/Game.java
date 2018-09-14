package ff.stats;

abstract class Game {
	private String date;
	private int gameNumber;
	private String team;
	private String opp;
	private int tmScore;
	private int oppScore;
	private int year;
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the gameNumber
	 */
	public int getGameNumber() {
		return gameNumber;
	}
	/**
	 * @param gameNumber the gameNumber to set
	 */
	public void setGameNumber(int gameNumber) {
		this.gameNumber = gameNumber;
	}
	/**
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}
	/**
	 * @param team the team to set
	 */
	public void setTeam(String team) {
		this.team = team;
	}
	/**
	 * @return the opp
	 */
	public String getOpp() {
		return opp;
	}
	/**
	 * @param opp the opp to set
	 */
	public void setOpp(String opp) {
		this.opp = opp;
	}
	/**
	 * @return the tmScore
	 */
	public int getTmScore() {
		return tmScore;
	}
	/**
	 * @param tmScore the tmScore to set
	 */
	public void setTmScore(int tmScore) {
		this.tmScore = tmScore;
	}
	/**
	 * @return the oppScore
	 */
	public int getOppScore() {
		return oppScore;
	}
	/**
	 * @param oppScore the oppScore to set
	 */
	public void setOppScore(int oppScore) {
		this.oppScore = oppScore;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
