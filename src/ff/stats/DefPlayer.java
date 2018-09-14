package ff.stats;

public class DefPlayer extends Game {
	private int id;
	private int playerId;
	private int gs;
	private int sk;
	private int tkl;
	private int ast;
	private int interceptions;
	private int intYds;
	private int tds;
	/**
	 * @param id
	 * @param playerId
	 * @param gs
	 * @param sk
	 * @param tkl
	 * @param ast
	 * @param interceptions
	 * @param intYds
	 * @param tds
	 */
	public DefPlayer(int id, int playerId, int gs, int sk, int tkl, int ast, int interceptions, int intYds, int tds) {
		this.id = id;
		this.playerId = playerId;
		this.gs = gs;
		this.sk = sk;
		this.tkl = tkl;
		this.ast = ast;
		this.interceptions = interceptions;
		this.intYds = intYds;
		this.tds = tds;
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
	 * @return the tkl
	 */
	public int getTkl() {
		return tkl;
	}
	/**
	 * @param tkl the tkl to set
	 */
	public void setTkl(int tkl) {
		this.tkl = tkl;
	}
	/**
	 * @return the ast
	 */
	public int getAst() {
		return ast;
	}
	/**
	 * @param ast the ast to set
	 */
	public void setAst(int ast) {
		this.ast = ast;
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
	 * @return the intYds
	 */
	public int getIntYds() {
		return intYds;
	}
	/**
	 * @param intYds the intYds to set
	 */
	public void setIntYds(int intYds) {
		this.intYds = intYds;
	}
	/**
	 * @return the tds
	 */
	public int getTds() {
		return tds;
	}
	/**
	 * @param tds the tds to set
	 */
	public void setTds(int tds) {
		this.tds = tds;
	}
	
	
	

}
