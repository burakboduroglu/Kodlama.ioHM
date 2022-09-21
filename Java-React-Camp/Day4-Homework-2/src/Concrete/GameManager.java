package Concrete;

import Abstract.IGameManager;
import Entities.Game;

public class GameManager implements IGameManager {

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " oyunu eklendi.");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " oyunu silindi.");	
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " oyununun fiyatý "+ "49" +" olarak güncellendi.");
	}	

}
