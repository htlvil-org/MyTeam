package pkgMain;

import pkgData.Player;

public class MainAppl {

	public static void main(String[] args) {


		Player player = new Player(10, "Kalajdzic", "Striker");
		System.out.println("== " + player);
		player = new Player(11, "Arnautovic", "Striker");

		System.out.println("== " + player);
		
		player = new Player(8, "Baumgartner", "Midfielder");
		System.out.println("== " + player);
	}

}
