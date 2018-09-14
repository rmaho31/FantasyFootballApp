package ff.stats;

public class Defense extends Game {
	private int firstDown;
	private int totYd;
	private int passYd;
	private int rushYd;
	private int to;
	/**
	 * @param firstDown
	 * @param totYd
	 * @param passYd
	 * @param ruchYd
	 * @param to
	 */
	public Defense(int firstDown, int totYd, int passYd, int rushYd, int to) {
		this.firstDown = firstDown;
		this.totYd = totYd;
		this.passYd = passYd;
		this.rushYd = rushYd;
		this.to = to;
	}
	/**
	 * @return the firstDown
	 */
	public int getFirstDown() {
		return firstDown;
	}
	/**
	 * @param firstDown the firstDown to set
	 */
	public void setFirstDown(int firstDown) {
		this.firstDown = firstDown;
	}
	/**
	 * @return the totYd
	 */
	public int getTotYd() {
		return totYd;
	}
	/**
	 * @param totYd the totYd to set
	 */
	public void setTotYd(int totYd) {
		this.totYd = totYd;
	}
	/**
	 * @return the passYd
	 */
	public int getPassYd() {
		return passYd;
	}
	/**
	 * @param passYd the passYd to set
	 */
	public void setPassYd(int passYd) {
		this.passYd = passYd;
	}
	/**
	 * @return the ruchYd
	 */
	public int getRushYd() {
		return rushYd;
	}
	/**
	 * @param ruchYd the ruchYd to set
	 */
	public void setRushYd(int ruchYd) {
		this.rushYd = ruchYd;
	}
	/**
	 * @return the to
	 */
	public int getTo() {
		return to;
	}
	/**
	 * @param to the to to set
	 */
	public void setTo(int to) {
		this.to = to;
	}	
	
}
