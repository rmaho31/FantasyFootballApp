package ff.stats;

public class OffSkill extends Game {
	private int id;
	private int playerId;
	private int gs;
	private int tgt;
	private int rec;
	private int recYards;
	private int receivTd;
	private int att;
	private int rushYds;
	private int rushTd;
	private int twopm;
	
	/**
	 * @param id
	 * @param playerId
	 * @param gs
	 * @param tgt
	 * @param rec
	 * @param recYards
	 * @param receivTd
	 * @param att
	 * @param rushYds
	 * @param rushTd
	 * @param twopm
	 */
	public OffSkill(int id, int playerId, int gs, int tgt, int rec, int recYards, int receivTd, int att, int rushYds,
			int rushTd, int twopm) {
		this.id = id;
		this.playerId = playerId;
		this.gs = gs;
		this.tgt = tgt;
		this.rec = rec;
		this.recYards = recYards;
		this.receivTd = receivTd;
		this.att = att;
		this.rushYds = rushYds;
		this.rushTd = rushTd;
		this.twopm = twopm;
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
	 * @return the tgt
	 */
	public int getTgt() {
		return tgt;
	}
	/**
	 * @param tgt the tgt to set
	 */
	public void setTgt(int tgt) {
		this.tgt = tgt;
	}
	/**
	 * @return the rec
	 */
	public int getRec() {
		return rec;
	}
	/**
	 * @param rec the rec to set
	 */
	public void setRec(int rec) {
		this.rec = rec;
	}
	/**
	 * @return the recYards
	 */
	public int getRecYards() {
		return recYards;
	}
	/**
	 * @param recYards the recYards to set
	 */
	public void setRecYards(int recYards) {
		this.recYards = recYards;
	}
	/**
	 * @return the receivTd
	 */
	public int getReceivTd() {
		return receivTd;
	}
	/**
	 * @param receivTd the receivTd to set
	 */
	public void setReceivTd(int receivTd) {
		this.receivTd = receivTd;
	}
	/**
	 * @return the att
	 */
	public int getAtt() {
		return att;
	}
	/**
	 * @param att the att to set
	 */
	public void setAtt(int att) {
		this.att = att;
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
	 * @return the rushTd
	 */
	public int getRushTd() {
		return rushTd;
	}
	/**
	 * @param rushTd the rushTd to set
	 */
	public void setRushTd(int rushTd) {
		this.rushTd = rushTd;
	}
	/**
	 * @return the twopm
	 */
	public int getTwopm() {
		return twopm;
	}
	/**
	 * @param twopm the twopm to set
	 */
	public void setTwopm(int twopm) {
		this.twopm = twopm;
	}	
	
}
