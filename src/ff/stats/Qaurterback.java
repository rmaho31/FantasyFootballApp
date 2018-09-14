package ff.stats;

public class Qaurterback extends Game {
	private int id;
	private int playerId;
	private int gs;
	private int cmp;
	private int passAtt;
	private int passYds;
	private int passTd;
	private int interceptions;
	private int sk;
	private int ydsLost;
	private int rushAtt;
	private int rushYds;
	private int rushTds;
	/**
	 * @param id
	 * @param playerId
	 * @param gs
	 * @param cmp
	 * @param passAtt
	 * @param passYds
	 * @param passTd
	 * @param interceptions
	 * @param sk
	 * @param ydsLost
	 * @param rushAtt
	 * @param rushYds
	 * @param rushTds
	 */
	public Qaurterback(int id, int playerId, int gs, int cmp, int passAtt, int passYds, int passTd, int interceptions,
			int sk, int ydsLost, int rushAtt, int rushYds, int rushTds) {
		super();
		this.id = id;
		this.playerId = playerId;
		this.gs = gs;
		this.cmp = cmp;
		this.passAtt = passAtt;
		this.passYds = passYds;
		this.passTd = passTd;
		this.interceptions = interceptions;
		this.sk = sk;
		this.ydsLost = ydsLost;
		this.rushAtt = rushAtt;
		this.rushYds = rushYds;
		this.rushTds = rushTds;
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
	 * @return the playerId
	 */
	public int getPlayerId() {
		return playerId;
	}
	/**
	 * @param playerId the playerId to set
	 */
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	/**
	 * @return the gs
	 */
	public int getGs() {
		return gs;
	}
	/**
	 * @param gs the gs to set
	 */
	public void setGs(int gs) {
		this.gs = gs;
	}
	/**
	 * @return the cmp
	 */
	public int getCmp() {
		return cmp;
	}
	/**
	 * @param cmp the cmp to set
	 */
	public void setCmp(int cmp) {
		this.cmp = cmp;
	}
	/**
	 * @return the passAtt
	 */
	public int getPassAtt() {
		return passAtt;
	}
	/**
	 * @param passAtt the passAtt to set
	 */
	public void setPassAtt(int passAtt) {
		this.passAtt = passAtt;
	}
	/**
	 * @return the passYds
	 */
	public int getPassYds() {
		return passYds;
	}
	/**
	 * @param passYds the passYds to set
	 */
	public void setPassYds(int passYds) {
		this.passYds = passYds;
	}
	/**
	 * @return the passTd
	 */
	public int getPassTd() {
		return passTd;
	}
	/**
	 * @param passTd the passTd to set
	 */
	public void setPassTd(int passTd) {
		this.passTd = passTd;
	}
	/**
	 * @return the interceptions
	 */
	public int getInterceptions() {
		return interceptions;
	}
	/**
	 * @param interceptions the interceptions to set
	 */
	public void setInterceptions(int interceptions) {
		this.interceptions = interceptions;
	}
	/**
	 * @return the sk
	 */
	public int getSk() {
		return sk;
	}
	/**
	 * @param sk the sk to set
	 */
	public void setSk(int sk) {
		this.sk = sk;
	}
	/**
	 * @return the ydsLost
	 */
	public int getYdsLost() {
		return ydsLost;
	}
	/**
	 * @param ydsLost the ydsLost to set
	 */
	public void setYdsLost(int ydsLost) {
		this.ydsLost = ydsLost;
	}
	/**
	 * @return the rushAtt
	 */
	public int getRushAtt() {
		return rushAtt;
	}
	/**
	 * @param rushAtt the rushAtt to set
	 */
	public void setRushAtt(int rushAtt) {
		this.rushAtt = rushAtt;
	}
	/**
	 * @return the rushYds
	 */
	public int getRushYds() {
		return rushYds;
	}
	/**
	 * @param rushYds the rushYds to set
	 */
	public void setRushYds(int rushYds) {
		this.rushYds = rushYds;
	}
	/**
	 * @return the rushTds
	 */
	public int getRushTds() {
		return rushTds;
	}
	/**
	 * @param rushTds the rushTds to set
	 */
	public void setRushTds(int rushTds) {
		this.rushTds = rushTds;
	}
	
	

}
