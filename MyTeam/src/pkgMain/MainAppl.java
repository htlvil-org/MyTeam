package pkgMain;

import pkgData.Player;

public class MainAppl {

	public static void main(String[] args) {
		Player player = new Player(2, "Dragovic", "Defense");


		player = new Player(10, "Kalajdzic", "Striker");
		player = new Player(6, "Gregoritsch", "Midfielder");
		System.out.println("== " + player);
		
		System.out.println("== " + player);
		player = new Player(11, "Arnautovic", "Striker");

		System.out.println("== " + player);

		
		player = new Player(8, "Baumgartner", "Midfielder");
		System.out.println("== " + player);
		
		player = new Player(7, "Baumgartlinger", "Midfielder");
		System.out.println("== " + player);
	}

}
