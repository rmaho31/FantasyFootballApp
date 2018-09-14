package ff.main;

import ff.db.Crud;
import ff.players.Player;
import ff.stats.*;

public class FantasyFootballApp {

	public static void main(String[] args) {
		Player p = new Player(0, "test", 72, 234, 33, 3, "QB");
		Crud.writeDataBase(p);
		
		OffSkill o = new OffSkill(0, 1, 11, 12, 9, 53, 2, 1, 0, 1, 1);
		o.setYear(2018);
		o.setGameNumber(12);
		o.setDate("09/12/2018");
		o.setOpp("Cle");
		o.setTeam("Cin");
		o.setTmScore(33);
		o.setOppScore(12);
		Crud.writeDataBase(o);
		
		Qaurterback q = new Qaurterback(1, 1, 11, 12, 12, 233, 2, 1, 1, 12, 2, 12, 0);
		q.setYear(2018);
		q.setGameNumber(12);
		q.setDate("09/12/2018");
		q.setOpp("Cle");
		q.setTeam("Cin");
		q.setTmScore(33);
		q.setOppScore(12);
		Crud.writeDataBase(q);
		
		DefPlayer d = new DefPlayer(1, 1, 1, 2, 12, 3, 1, 12, 1);
		d.setYear(2018);
		d.setGameNumber(12);
		d.setDate("09/12/2018");
		d.setOpp("Cle");
		d.setTeam("Cin");
		d.setTmScore(34);
		d.setOppScore(12);
		Crud.writeDataBase(d);
		
		Defense d1 = new Defense(1, 213, 122, 91, 1);
		d1.setYear(2018);
		d1.setGameNumber(12);
		d1.setDate("09/12/2018");
		d1.setOpp("Cle");
		d1.setTeam("Cin");
		d1.setTmScore(34);
		d1.setOppScore(12);
		Offense o1 = new Offense(12, 333, 222, 111, 2);
		Crud.writeDataBase(o1, d1);
		
	}

}
