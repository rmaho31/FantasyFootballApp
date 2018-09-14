package ff.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ff.players.Player;
import ff.stats.*;

public class Crud {

	private static Connection connect = null;
    private static Statement statement = null;
    private static PreparedStatement preparedStatement = null;
    private static ResultSet resultSet = null;

    public static void writeDataBase(Player p) {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/ffstats?allowPublicKeyRetrieval=true&useSSL=false", "ffStats_user", "sesame");

            // Sets up the preparedStatement for inputting the values into the DB from the input Array
            preparedStatement = connect
                    .prepareStatement(" insert into Player (name, height, weight, age, yearspro, position)" + 
                    		 " values (?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, p.getName());
            preparedStatement.setInt(2, p.getHeight());
            preparedStatement.setInt(3, p.getWeight());
            preparedStatement.setInt(4, p.getAge());
            preparedStatement.setInt(5, p.getYearsPro());
            preparedStatement.setString(6, p.getPosition());
            preparedStatement.executeUpdate();           

        } catch (SQLException | ClassNotFoundException e) {
        	e.printStackTrace();
        } finally {
            close();
        }

    }
    
    public static void writeDataBase(OffSkill o) {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/ffstats?allowPublicKeyRetrieval=true&useSSL=false", "ffStats_user", "sesame");

            // Sets up the preparedStatement for inputting the values into the DB from the input Array
            preparedStatement = connect
                    .prepareStatement(" insert into OffSkill (playerID, gs, tgt, rec, recyards, " +
                    				  "rectd, att, rushyds, rushtd, twopm, " +
                    				  "season, gamenumber, gamedate, opp, team, tmscore, oppscore)" + 
                    		 " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, o.getPlayerId());
            preparedStatement.setInt(2, o.getGs());
            preparedStatement.setInt(3, o.getTgt());
            preparedStatement.setInt(4, o.getRec());
            preparedStatement.setInt(5, o.getRecYards());
            preparedStatement.setInt(6, o.getReceivTd());
            preparedStatement.setInt(7, o.getAtt());
            preparedStatement.setInt(8, o.getRushYds());
            preparedStatement.setInt(9, o.getRushTd());
            preparedStatement.setInt(10, o.getTwopm());
            preparedStatement.setInt(11, o.getYear());
            preparedStatement.setInt(12, o.getGameNumber());
            preparedStatement.setString(13, o.getDate());
            preparedStatement.setString(14, o.getOpp());
            preparedStatement.setString(15, o.getTeam());
            preparedStatement.setInt(16, o.getTmScore());
            preparedStatement.setInt(17, o.getOppScore());
            preparedStatement.executeUpdate();           

        } catch (SQLException | ClassNotFoundException e) {
        	e.printStackTrace();
        } finally {
            close();
        }

    }
    
    public static void writeDataBase(Qaurterback q) {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/ffstats?allowPublicKeyRetrieval=true&useSSL=false", "ffStats_user", "sesame");

            // Sets up the preparedStatement for inputting the values into the DB from the input Array
            preparedStatement = connect
                    .prepareStatement(" insert into Qaurterback (playerID, gs, cmp, passatt, passyards, " +
                    				  "passtd, interceptions, sk, ydslost, rushatt, " +
                    				  "rushyds, rushtds, season, gamenumber, gamedate, opp, team, tmscore, oppscore)" + 
                    		 " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, q.getPlayerId());
            preparedStatement.setInt(2, q.getGs());
            preparedStatement.setInt(3, q.getCmp());
            preparedStatement.setInt(4, q.getPassAtt());
            preparedStatement.setInt(5, q.getPassYds());
            preparedStatement.setInt(6, q.getPassTd());
            preparedStatement.setInt(7, q.getInterceptions());
            preparedStatement.setInt(8, q.getSk());
            preparedStatement.setInt(9, q.getYdsLost());
            preparedStatement.setInt(10, q.getRushAtt());
            preparedStatement.setInt(11, q.getRushYds());
            preparedStatement.setInt(12, q.getRushTds());
            preparedStatement.setInt(13, q.getYear());
            preparedStatement.setInt(14, q.getGameNumber());
            preparedStatement.setString(15, q.getDate());
            preparedStatement.setString(16, q.getOpp());
            preparedStatement.setString(17, q.getTeam());
            preparedStatement.setInt(18, q.getTmScore());
            preparedStatement.setInt(19, q.getOppScore());
            preparedStatement.executeUpdate();           

        } catch (SQLException | ClassNotFoundException e) {
        	e.printStackTrace();
        } finally {
            close();
        }

    }
    
    public static void writeDataBase(DefPlayer d) {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/ffstats?allowPublicKeyRetrieval=true&useSSL=false", "ffStats_user", "sesame");

            // Sets up the preparedStatement for inputting the values into the DB from the input Array
            preparedStatement = connect
                    .prepareStatement(" insert into DefPlayer (playerID, gs, sk, tkl, ast, " +
                    				  "interceptions, intyds, tds, season," +
                    				  " gamenumber, gamedate, opp, team, tmscore, oppscore)" + 
                    		 " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, d.getPlayerId());
            preparedStatement.setInt(2, d.getGs());
            preparedStatement.setInt(3, d.getSk());
            preparedStatement.setInt(4, d.getTkl());
            preparedStatement.setInt(5, d.getAst());
            preparedStatement.setInt(6, d.getInterceptions());
            preparedStatement.setInt(7, d.getIntYds());
            preparedStatement.setInt(8, d.getTds());
            preparedStatement.setInt(9, d.getYear());
            preparedStatement.setInt(10, d.getGameNumber());
            preparedStatement.setString(11, d.getDate());
            preparedStatement.setString(12, d.getOpp());
            preparedStatement.setString(13, d.getTeam());
            preparedStatement.setInt(14, d.getTmScore());
            preparedStatement.setInt(15, d.getOppScore());
            preparedStatement.executeUpdate();           

        } catch (SQLException | ClassNotFoundException e) {
        	e.printStackTrace();
        } finally {
            close();
        }

    }
    
    public static void writeDataBase(Offense o, Defense d) {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/ffstats?allowPublicKeyRetrieval=true&useSSL=false", "ffStats_user", "sesame");

            // Sets up the preparedStatement for inputting the values into the DB from the input Array
            preparedStatement = connect
                    .prepareStatement(" insert into TeamStats (OffFirstDown, OffTotYd, OffPassYds," +
                    				  " OffRushYds, OffTo, DefFirstDown, DefTotYd, DefPassYds," +
                    				  " DefRushYds, DefTo, season," +
                    				  " gamenumber, gamedate, opp, team, tmscore, oppscore)" + 
                    		 " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, o.getFirstDown());
            preparedStatement.setInt(2, o.getTotYd());
            preparedStatement.setInt(3, o.getPassYd());
            preparedStatement.setInt(4, o.getRushYd());
            preparedStatement.setInt(5, o.getTo());
            preparedStatement.setInt(6, d.getTotYd());
            preparedStatement.setInt(7, d.getTotYd());
            preparedStatement.setInt(8, d.getPassYd());
            preparedStatement.setInt(9, d.getRushYd());
            preparedStatement.setInt(10, d.getTo());
            preparedStatement.setInt(11, d.getYear());
            preparedStatement.setInt(12, d.getGameNumber());
            preparedStatement.setString(13, d.getDate());
            preparedStatement.setString(14, d.getOpp());
            preparedStatement.setString(15, d.getTeam());
            preparedStatement.setInt(16, d.getTmScore());
            preparedStatement.setInt(17, d.getOppScore());
            preparedStatement.executeUpdate();           

        } catch (SQLException | ClassNotFoundException e) {
        	e.printStackTrace();
        } finally {
            close();
        }

    }
    
    public ResultSet readDataBase(String d1) throws Exception {
        try {
            // Loads the SQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Setup the connection
            connect = DriverManager.getConnection("jdbc:mysql://localhost/calendar?useSSL=false", "root", "");

            statement = connect.createStatement();
            resultSet = statement.executeQuery("select date, event, description, time, length, location from newEvents where date = " + "'" + d1 +"'");
            return resultSet;         
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void deleteRowDatabase(String[] a) throws Exception{
    	try {
    		//Load MySQL driver
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		//Setup the connection
    		connect = DriverManager.getConnection("jdbc:mysql://localhost/calendar?useSSL=false", "root", "");
    		
    		//Deletes record matching the input array values
    		statement = connect.createStatement();
    		statement.executeUpdate("delete from newEvents where date = " + "'" + a[0] + "' and event = " + "'" + a[1] + "' and time = " + "'" + a[3] + "'");
    		
    	} catch (Exception e) {
    		throw e;
    	} finally {
    		close();
    	}
    }

    
    // Method to close the connections
    private static void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }

}
