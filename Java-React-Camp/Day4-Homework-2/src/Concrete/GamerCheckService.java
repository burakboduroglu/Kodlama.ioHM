package Concrete;

import Entities.Gamer;
import Abstract.IGamerCheckService;

public class GamerCheckService implements IGamerCheckService {

	@Override
	public boolean checkIfRealGamer(Gamer gamer) {
		return true;
	}
}
