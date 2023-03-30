package studio7;

public class HockeyPlayer {
	private String name;
	private int number;
	private String handed;
	private String shootSide;
	private int games;
	private int goals;
	private int assists;
	private int points;

public HockeyPlayer(String name, int number, String handed, String shootSide, int games, int goals, int assists, int points) {
	this.name = name;
	this.number = number;
	this.handed = handed;
	this.shootSide = shootSide;
	this.games = games;
	this.goals = goals;
	this.assists = assists;
	this.points = points;		
}

public void update(int pgoals, int passists) {
	this.goals = pgoals + goals;
	this.assists = passists + assists;
	this.points = this.goals + this.assists + this.points;
	this.games = this.games +1;
}

public static void main(String[]args) {
	HockeyPlayer player = new HockeyPlayer("Bob", 47, "left", "right", 7, 9, 2, 13);
	System.out.println(player);
}

@Override
public String toString() {
	return "HockeyPlayer [name=" + name + ", number=" + number + ", handed=" + handed + ", shootSide=" + shootSide
			+ ", games=" + games + ", goals=" + goals + ", assists=" + assists + ", points=" + points + "]";
}

}