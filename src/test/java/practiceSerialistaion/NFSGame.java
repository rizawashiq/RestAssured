package practiceSerialistaion;

import java.io.Serializable;

public class NFSGame implements Serializable{
	
	String player_name ;
	int level ;
	long score ;
	int life ;
	public NFSGame(String player_name, int level, long score, int life) {
		super();
		this.player_name = player_name;
		this.level = level;
		this.score = score;
		this.life = life;
	}
	
	

}
