-- create and select the database
DROP DATABASE IF EXISTS ffStats;
CREATE DATABASE ffStats;
USE ffStats;

CREATE TABLE Player (
	ID						INT 						 PRIMARY KEY  AUTO_INCREMENT,
	Name 					VARCHAR(25)					 NOT NULL,
	Height 					INT 						 NOT NULL,
	Weight 					INT 						 NOT NULL,
	Age 					INT 						 NOT NULL,
	YearsPro 				INT 						 NOT NULL,
	Position 				VARCHAR(25) 				 NOT NULL
);

CREATE TABLE OffSkill (
	ID						INT							 PRIMARY KEY  AUTO_INCREMENT,
	PlayerID 				INT 						 NOT NULL,
	Gs 						INT 						 ,
	Tgt 					INT 						 ,
	Rec 					INT 						 ,
	RecYards 				INT 						 ,
	RecTd 					INT 						 ,
	att 					INT 						 ,
	RushYds 				INT 						 ,
	RushTd 					INT 						 ,
	TwoPM 					INT 						 ,
	Season 					INT 						 ,
	GameNumber				INT 						 ,
	GameDate				VARCHAR(25) 				 ,
	Opp 					VARCHAR(25) 				 ,
	Team 					VARCHAR(25) 				 ,
	TmScore					INT 						 ,
	OppScore				INT 						 ,
	FOREIGN KEY (PlayerID) REFERENCES Player(ID)
);

CREATE TABLE Qaurterback (
	ID						INT 						 PRIMARY KEY  AUTO_INCREMENT,
	PlayerID 				INT 						 NOT NULL,
	Gs 						INT 						 ,
	Cmp 		 			INT 						 ,
	PassAtt 				INT 						 ,
	PassYards 				INT 						 ,
	PassTd 					INT 						 ,
	Interceptions			INT 						 ,
	Sk 						INT 						 ,
	YdsLost					INT 						 ,
	RushAtt 				INT 						 ,
	RushYds					INT 						 ,
	RushTds					INT 						 ,
	Season 					INT 						 ,
	GameNumber				INT 						 ,
	GameDate				VARCHAR(25) 				 ,
	Opp 					VARCHAR(25) 				 ,
	Team 					VARCHAR(25) 				 ,
	TmScore					INT 						 ,
	OppScore				INT 						 ,
	FOREIGN KEY (PlayerID) REFERENCES Player(ID)
);

CREATE TABLE DefPlayer (
	ID						INT							 PRIMARY KEY  AUTO_INCREMENT,
	PlayerID 				INT 						 NOT NULL,
	Gs 						INT 						 ,
	Sk 						INT 						 ,
	Tkl 					INT 						 ,
	Ast		 				INT 						 ,
	Interceptions			INT 						 ,
	IntYds 					INT 						 ,
	Tds 	 				INT 						 ,
	Season 					INT 						 ,
	GameNumber				INT 						 ,
	GameDate				VARCHAR(25) 				 ,
	Opp 					VARCHAR(25) 				 ,
	Team 					VARCHAR(25) 				 ,
	TmScore					INT 						 ,
	OppScore				INT 						 ,
	FOREIGN KEY (PlayerID) REFERENCES Player(ID)
);

CREATE TABLE TeamStats (
	ID						INT							PRIMARY KEY  AUTO_INCREMENT,
	OffFirstDown			INT 						 ,
	OffTotYd				INT 						 ,
	OffPassYds				INT 						 ,
	OffRushYds 				INT 						 ,
	OffTo 					INT 						 ,
	DefFirstDown			INT 						 ,
	DefTotYd				INT 						 ,
	DefPassYds				INT 						 ,
	DefRushYds 				INT 						 ,
	DefTo 					INT 						 ,
	Season 					INT 						 ,
	GameNumber				INT 						 ,
	GameDate				VARCHAR(25) 				 ,
	Opp 					VARCHAR(25) 				 ,
	Team 					VARCHAR(25) 				 ,
	TmScore					INT 						 ,
	OppScore				INT 						 
	
);

CREATE USER ffStats_user@localhost IDENTIFIED BY 'sesame';
GRANT SELECT, INSERT, DELETE, UPDATE ON ffStats.* TO ffStats_user@localhost;